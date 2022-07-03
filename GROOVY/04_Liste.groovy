class Liste {

    static void main(String[] args)
    {
        /**  Lista di numeri */
        def numeriPrimi = [2,3,5,7,11,13];

        /**  RICORDA: Gli indici partono da 0 */
        println("2° numero primo " + numeriPrimi[1]); // accesso per indice
        println("3° numero primo " + numeriPrimi.get(2)); // altro modo per accedere per indice

        /** Lista composta da vari tipi: Stringa, intero, double, lista */
        def dipendente = ['Marco', 40, 3.25, [1,2,3]];

        println("2° numero contenuto nel 4° elemento (la lista [1,2,3]) della lista 'dipendente': " + 
        dipendente[3][1]); // stampa 2

        /** Dimensione di una lista (lunghezza) */
        println("Dimensione della lista $numeriPrimi: " + numeriPrimi.size());
        println("Dimensione della lista $dipendente: " + dipendente.size() );

        /** Aggiunta di un elemento in lista */
        // N.B.
        println("Lista dei numeri primi: " + numeriPrimi);
        numeriPrimi.add(17);
        println("Dopo aggiunta del 17: " + numeriPrimi);
        numeriPrimi<<19;
        println("Dopo aggiunta del 19: " + numeriPrimi);
        numeriPrimi.add(23);
        println("Dopo aggiunta del 23: " + numeriPrimi);

        /**  Concatenazione di due liste */
        printf("Concatenazione con la lista [29,31]:\n");
        println(numeriPrimi + [29, 31]);
        printf("Rimozione della lista [31]:\n");
        println(numeriPrimi - [31]);

        /**  Controllo se lista è vuota */
        println("È vuota: " + numeriPrimi.isEmpty());

        /**  Ottenimento di elementi successivi da una lista*/
        println("Dal 1° al 3°: " + numeriPrimi[0..2]);

        /**  Stampa di una lista */
        println(numeriPrimi);

        /**  Controllo se due liste matchano con gli stessi elementi */
        println("Matches " + numeriPrimi.intersect([2,3,7]));

        /** Lista inversa */
        println("Reverse " + numeriPrimi.reverse());

        /** Ordinamento di una lista */
        println("Sort " + numeriPrimi.sort());

        /** Estrazione e Pop (rimozione) dell'ultimo elemento da una lista */
        println("Last " + numeriPrimi.pop());

        println(numeriPrimi);

    }

}