class Mappe {

    static void main(String[] args)
    {
        /**  
        Molto simili alle liste.
        Dichiarazione mappa: 
        def mappa = ['chiave1' : 'valore1',
                     'chiave2' : 'valore2',
                      ...
                      'chiaveN' : 'valoreN'
                    ] */
        def mappaPaul = [
                            'nome' : 'Paul',
                            'eta' : 35,
                            'indirizzo' : '123 Main St',
                            'lista' : [1,2,3]
                        ];

        /**  Accesso agli elementi di una mappa */
        println("Nome " + mappaPaul['nome']);
        println("Età " + mappaPaul['eta']);
        println("Indirizzo " + mappaPaul['indirizzo']);
        println("Elemento di una lista all'interno di una mappa:" + 
            mappaPaul['lista'][1]); // N.B. (accedo al 2° elemento della lista interna alla mappa)

        /**  Aggiunta di una coppia chiave-valore nella mappa */
        mappaPaul.put('citta', 'Ferrara');

        /**  Vedere se una chiave è contenuta o no nella mappa
        *   containsKey('chiave')ritorna true o false
        */
        println("La mappa di  " + mappaPaul['nome'] + " ha una chiave denominata 'citta' " + mappaPaul.containsKey('citta')) ;
        
        /** Dimensione mappa  */
        println("Dimensione " + mappaPaul.size());

        // Stampa mappa
        println(mappaPaul);

        

         // Stampa mappa
        // println(mappaPaul);

    }
}