package utilities;

public class Citt� {
	 private String nome;
	 private String nazione;
	 private int num;
	 public static int countCitt�=0;
	 
	 
	 public Citt�(String nome, String nazione){
		 this.nome=nome;
		 this.nazione=nazione;
		 countCitt�=++num;
	 }


	public String getNome() {
		return nome;
	}


	public String getNazione() {
		return nazione;
	}

}
