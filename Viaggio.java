package utilities;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.Comparator;



import exceptions.Citt‡ViaggioException;
import exceptions.ClientiViaggioException;


public class Viaggio{
 private String nome;
 private int datainizio;
 private int datafine;
 private ArrayList<Citt‡> citt‡=new ArrayList<>();
 public ArrayList <Clienti> clienti= new ArrayList<>();
 
 
public Viaggio(String nome, int datainizio,int datafine){
	 this.nome=nome;
	 this.datainizio=datainizio;
	 this.datafine=datafine;
 }
 
 public String getNome() {
	return nome;
}

public int getDatainizio() {
	return datainizio;
}

public int getDatafine() {
	return datafine;
}

public ArrayList<Citt‡> getCitt‡() {
	return citt‡;
}

public ArrayList<Clienti> getClienti() {
	return clienti;
}

public void AggiungereCitt‡(Citt‡ citt‡1) throws Citt‡ViaggioException{
	try{
	 if(!citt‡.contains(citt‡1)){
		citt‡.add(citt‡1);
		 
	 }else{
	 throw new Citt‡ViaggioException();
	 }
	}catch(Exception e){
		
	}
 }
 
 public void RimuovereCitt‡(Citt‡ citt‡1){
	 if(citt‡.contains(citt‡1)){
		 citt‡.remove(citt‡1);
	 }
	 
	 
}
 
 public void AggiungereCliente(Clienti cliente1) throws ClientiViaggioException{
	 try{
	 if(!clienti.contains(cliente1)){
		 clienti.add(cliente1);
		 
	 }else{
		 throw new ClientiViaggioException();
	 }
	 }catch(Exception e){
		 
	 }
		 
	}
 
 
 public void RimuovereCliente(Clienti cliente1){
	 if(clienti.contains(cliente1)){
		 clienti.remove(cliente1);
	 }
 }
 
 public int numClientiPremium(){
	 int count=0;
	 for(Clienti cliente2: clienti){
		 if(cliente2 instanceof ClientePremium){
			 count++;
		 }
	 }
	 return count;
 }
 
public static Comparator <Object> getCognomeNomeOrdering(){
	return new CognomeNomeOrdering();
}
public void OrdinaClienti(Object[] array, Viaggio viaggio){
	Clienti[] cl = Arrays.copyOf(array, array.length, Clienti[].class);
	System.out.println("Ordine lessicografico cognome e nome:");
	Arrays.sort(cl,Viaggio.getCognomeNomeOrdering());
	System.out.println();
	System.out.println("Nome viaggio: "+viaggio.getNome());
	System.out.println("Clienti ");
	for(Clienti cliente: cl){
		   
		   System.out.println(cliente.getNome()+"-"+ cliente.getCognome()+"-"+ cliente.getCodfisc()+"-"+cliente.getDatadinascita()+"-"+ cliente.getIndirizzo());
	   }
		System.out.println();

}
 

}

class CognomeNomeOrdering implements Comparator<Object>{
	public int compare(Object arg0, Object arg1){
		Clienti c1=(Clienti) arg0;
		Clienti c2=(Clienti) arg1;
		if(c1.getCognome().equals(c2.getCognome())){
			return c1.getNome().compareTo(c2.getNome());
		 }else{
			 return c1.getCognome().compareTo(c2.getCognome());
		 }
		}
}
