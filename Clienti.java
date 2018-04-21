package utilities;



public class Clienti {
private String codfisc;
private String cognome;
private String nome;
private String indirizzo;
private int datadinascita;
public static int CountClienti=0;
private int NumClienti;


Clienti(String codfisc,String cognome, String nome){
	this.codfisc=codfisc;
	
	this.cognome=cognome;
	this.nome=nome;
	CountClienti=++NumClienti;
}
public Clienti(String codfisc,String cognome, String nome,int datadinascita,String indirizzo) {
	this.codfisc=codfisc;
	
	this.cognome=cognome;
	this.nome=nome;
	this.datadinascita=datadinascita;
	this.indirizzo=indirizzo;
	CountClienti=++NumClienti;
}


@Override
public String toString() {
	return "Clienti [codfisc=" + codfisc + ", cognome=" + cognome + ", nome=" + nome + ", indirizzo=" + indirizzo
			+ ", datadinascita=" + datadinascita + "]";
}
public String getCodfisc() {
	return codfisc;
}
public String getCognome() {
	return cognome;
}
public String getNome() {
	return nome;
}
public String getIndirizzo() {
	return indirizzo;
}
public int getDatadinascita() {
	return datadinascita;
}





}
