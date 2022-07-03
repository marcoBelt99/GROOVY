
class Driver {

	static void main(args) {
		/**  Creazione oggetto di classe Animale */
		// def king = new Animale(nome : 'King', verso : 'Ruggito');
		def king = new Animale('King', 'Ruggito');
		
		/**  Chiamata a metodo run() dell'oggetto king */
		king.run();
		
		/**  Stampa del valore dei suoi attributi */
		println("$king.nome emette: $king.verso");
		
		/**  Chiamata a metodo setVerso() */
		king.setVerso('Grrrrrrrrr');
		println("$king.nome emette: $king.verso");
		king.run();
		
		/**  Chiamata al metodo toString() */ 
		// println(king.toString());
		println(king); // stampa della toString()
		
		/**  Creazione di un nuovo oggetto di classe Cane */
		def grover = new Cane('Grover', 'Grrrr', 'Marco');
		
		king.emettiVerso();
		grover.emettiVerso();
		println(grover); // stampa della toString()
	}
}
