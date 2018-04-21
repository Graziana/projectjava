package utilities;

public class Città {
	 private String nome;
	 private String nazione;
	 private int num;
	 public static int countCittà=0;
	 
	 
	 public Città(String nome, String nazione){
		 this.nome=nome;
		 this.nazione=nazione;
		 countCittà=++num;
	 }


	public String getNome() {
		return nome;
	}


	public String getNazione() {
		return nazione;
	}

}
