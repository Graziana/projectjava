package utilities;



public class ClientePremium extends Clienti{


private int  numerotessera;
private int numeroviaggi;
public static int CountClienti=0;
int NumClienti;


ClientePremium(String codfisc,String cognome, String nome,int ntessera, int nviaggi){
	super(codfisc,cognome,nome);
	this.numerotessera=ntessera;
	this.numeroviaggi=nviaggi;
	CountClienti=++NumClienti;
}

public ClientePremium(String codfisc,String cognome, String nome,int datadinascita,String indirizzo, int ntessera, int nviaggi){
	super(codfisc,cognome,nome,datadinascita,indirizzo);
	this.numerotessera=ntessera;
	this.numeroviaggi=nviaggi;
	CountClienti=++NumClienti;
}
public int getNumerotessera() {
	return numerotessera;
}

public int getNumeroviaggi() {
	return numeroviaggi;
}



}