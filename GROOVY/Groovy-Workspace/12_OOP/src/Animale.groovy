//import groovy.transform.Tostring; // Importo il metodo che voglio usare

// @ToString(includeNames=true, includeFields=true)
class Animale {
	// Attributi
	def nome;
	def verso;

	// Costruttore
	def Animale(nome, verso) {
		this.nome = nome;
		this.verso = verso;
	}

	// Metodi
	def run() {
		println("$nome runs");
	}

	def emettiVerso() {
		println("$nome dice $verso");
	}
	
	def setVerso(nuovoVerso)
	{
		this.verso = nuovoVerso;
	}
	
	String toString()
	{
		return this.nome + "\t" + this.verso;
	}
}
