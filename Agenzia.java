package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

import exceptions.Citt‡ViaggioException;
import exceptions.ClientiViaggioException;
import utilities.Citt‡;
import utilities.ClientePremium;
import utilities.Clienti;
import utilities.Viaggio;

public class Agenzia {

	public static void main(String[] args) throws ClientiViaggioException, Citt‡ViaggioException {
	Random random= new Random();
	ArrayList<Clienti> listaclienti= new ArrayList<>();
	
	Clienti clienti[]= new Clienti[301];
	
	for(int i=0; i<=300; i++){
		String codfisc=randomStringa(1)+randomStringa(11);
		String nome=randomStringa(1).toUpperCase()+randomStringa(4);
		String cognome=randomStringa(1).toUpperCase()+randomStringa(4);
		String indirizzo=randomStringa(1).toUpperCase()+randomStringa(10);
		int datadn=random.nextInt();
		int numerotessera=random.nextInt();
		int nviaggi=random.nextInt();
		if(i<=220){
			clienti[i]=new Clienti(codfisc,cognome,nome,datadn,indirizzo);
			listaclienti.add(clienti[i]);
			System.out.println(clienti[i]);
			System.out.println("Cliente "+ i + "...creato");
		}else{
			String codfis=randomStringa(1)+randomStringa(11);
			String nom=randomStringa(1).toUpperCase()+randomStringa(4);
			String cognom=randomStringa(1).toUpperCase()+randomStringa(4);
			String indirizz=randomStringa(1).toUpperCase()+randomStringa(10);
			    clienti[i]=new ClientePremium(codfis,cognom,nom,datadn,indirizz,numerotessera,nviaggi);
			    listaclienti.add(clienti[i]);
				System.out.println("Cliente premium"+ i + "...creato");

			
		}
	 
	}
	ArrayList<Citt‡> listacitt‡=new ArrayList<>();
	Citt‡[] citt‡=new Citt‡[101];
	for(int i=0; i<=100; i++){
		String nome=randomStringa(1).toUpperCase()+ randomStringa(10);
		String nazione=randomStringa(1).toUpperCase() + randomStringa(10);
		citt‡[i]=new Citt‡(nome,nazione);
		listacitt‡.add(citt‡[i]);
		System.out.println("Citt‡"+ i + "...creato");
	}
	
	Viaggio viaggio1=new Viaggio("Viaggio1", 11062016, 1102016);
	for(int i=0; i<50; i++){
		viaggio1.AggiungereCliente(clienti[random.nextInt(301)]);
		System.out.println(viaggio1.getClienti());
		System.out.println("Cliente "+ i + "aggiunto a viaggio1");
	}
	for(int i=0; i<=8; i++){
		viaggio1.AggiungereCitt‡(citt‡[random.nextInt(citt‡.length)]);
		System.out.println("Citt‡"+ i + "aggiunta al viaggio1");
	}
	Viaggio viaggio2=new Viaggio("Viaggio2", 12082016, 11092016);
	for(int i=0; i<=50; i++){
		viaggio2.AggiungereCliente(clienti[random.nextInt(clienti.length)]);
		System.out.println("Cliente"+ i+ "aggiunto a viaggio2");
	}
	for(int i=0; i<=8; i++){
		viaggio2.AggiungereCitt‡(citt‡[random.nextInt(citt‡.length)]);
		System.out.println("Citt‡"+ i + "aggiunta al viaggio2");
	}
	Viaggio viaggio3=new Viaggio("Viaggio3", 13102016, 20112016);
	for(int i=0; i<=50; i++){
		viaggio3.AggiungereCliente(clienti[random.nextInt(clienti.length)]);
		System.out.println("Cliente"+ i + "aggiunta al viaggio3");
	}
	for(int i=0; i<=8; i++){
		viaggio3.AggiungereCitt‡(citt‡[random.nextInt(citt‡.length)]);
		System.out.println("Citt‡"+ i + "aggiunta al viaggio3");
	}
	Viaggio viaggio4=new Viaggio("Viaggio4", 27112016, 12122016);
	for(int i=0; i<=50; i++){
		viaggio4.AggiungereCliente(clienti[random.nextInt(clienti.length)]);
		System.out.println("Cliente"+ i + "aggiunta al viaggio4");
	}
	for(int i=0; i<=8; i++){
		viaggio4.AggiungereCitt‡(citt‡[random.nextInt(citt‡.length)]);
		System.out.println("Citt‡"+ i + "aggiunta al viaggio4");
	}
	Viaggio viaggio5=new Viaggio("Viaggio5", 1012017, 20022017);
	for(int i=0; i<=50; i++){
		viaggio5.AggiungereCliente(clienti[random.nextInt(clienti.length)]);
		System.out.println("Cliente"+ i + "aggiunta al viaggio5");
	}
	for(int i=0; i<=8; i++){
		viaggio5.AggiungereCitt‡(citt‡[random.nextInt(citt‡.length)]);
		System.out.println("Citt‡"+ i + "aggiunta al viaggio5");
	}

	
	int v1=viaggio1.numClientiPremium();
	int v2=viaggio2.numClientiPremium();
	int v3=viaggio3.numClientiPremium();
	int v4=viaggio4.numClientiPremium();
	int v5=viaggio5.numClientiPremium();

	System.out.println("Il viaggio1 un numero di clienti premium pari a "+v1);
	System.out.println("Il viaggio2 un numero di clienti premium pari a "+v2);
	System.out.println("Il viaggio3 un numero di clienti premium pari a "+v3);
	System.out.println("Il viaggio4 un numero di clienti premium pari a "+v4);
	System.out.println("Il viaggio5 un numero di clienti premium pari a "+v5);
	
	double media=(v1+v2+v3+v4+v5)/5;
	
	
	System.out.println("La media del numero di clienti premium che partecipano ai 5 viaggi e': "+media);
	
	
	try{
		PrintStream ps=new PrintStream(new FileOutputStream ("agenzia.csv"));
		
		viaggio1.OrdinaClienti(viaggio1.clienti.toArray(), viaggio1);
		viaggio2.OrdinaClienti(viaggio2.clienti.toArray(), viaggio2);
		viaggio3.OrdinaClienti(viaggio3.clienti.toArray(), viaggio3);
		viaggio4.OrdinaClienti(viaggio4.clienti.toArray(), viaggio4);
		viaggio5.OrdinaClienti(viaggio5.clienti.toArray(), viaggio5);
		ps.print(viaggio1.getNome()+"-"+ viaggio1.getClienti());
		ps.print("\n\n");
		ps.print(viaggio2.getNome()+"-"+ viaggio2.getClienti());
		ps.print("\n\n");
		ps.print(viaggio3.getNome()+"-"+ viaggio3.getClienti());
		ps.print("\n\n");
		ps.print(viaggio4.getNome()+"-"+ viaggio4.getClienti());
		ps.print("\n\n");
		ps.print(viaggio5.getNome()+"-"+ viaggio5.getClienti());
		ps.print("\n\n");
		ps.close();
	}catch(FileNotFoundException exc1){
		System.out.println("File non trovato");
	}
	
	
}			
		


	
	

	public static String randomStringa(int lunghezza){
		Random random=new Random();
		String alfabeto="abcdefghiklmnopqrstuvywkxz";
		String stringa="";
		for(int i=0; i<lunghezza; i++){
			stringa+=alfabeto.charAt(random.nextInt(alfabeto.length()));
		}

	return stringa;
	}

}
