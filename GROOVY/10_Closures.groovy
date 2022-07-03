class GroovyClosures 
{

/** 
* Una chiusura rappresenta un blocco di codice che può accettare parametri
* e può essere passato ad un metodo
* 
*/


    static void main(String[] args)
    {
        /**  
        ESEMPIO 1:
        * num è il parametro passato alla mia closure.
        * Utilizzo di un'espressione condizionale per il calcolo del fattoriale
        * con 'call(...)' vado a richiamare la mia funzione
        */
        // Implementazione chiusura
        def ottieniFattoriale = {num -> (num <= 1 ? 1 : num * call(num - 1))}
        // Chiamata chiusura
        println("Fattoriale di 4: " + ottieniFattoriale(4));  


        /**  
        ESEMPIO 2:  
        Accesso ai valori della chiusura al di fuori di essa
        */
        def saluto = "Arrivederci";
        // Implementazione chiusura
        def sayArrivederci = {nome -> println("$saluto $nome")}
        // Chiamata chiusura
        sayArrivederci("Marco");


        /** 
        * ESEMPIO 3:
        * Operazioni su: Liste e Mappe (di interi e di stringhe), Operazioni con Liste di Numeri
        * Metodi applicabili: 'each', 'find', 'findAll', 'any', 'every', 'collect' ...
        */
        println("Lista:");
        def numList = [1,2,3,4]; // Lista
        numList.each {println(it)};
        printf("\n");

        println("Mappa");
        def impiegati = [ // Mappa
            'Marco' : 34,
            'Luca' : 35,
            'Diletta' : 36
        ];
        impiegati.each{println("$it.key : $it.value");}
        printf("\n");

        // Numeri Random:
        println("Numeri Random:");
        // Chiusura che considera (stampa) solo i numeri con una data proprietà (quelli pari)
        def numeriRandom = [1,2,3,4,5,6]; // Numeri Random
        numeriRandom.each { num -> if(num % 2 == 0) println(num) };
        printf("\n");

        // Lista di Stringhe: metodo 'find'
        println("Lista di Stringhe:");
        def listaDiNomi = ["Serenella", "Fabrizio", "Moira", "Giovanni", "Mara", "Simone", "Antonio", "Tamara", "Diletta", "Marco"];
        def matchEle = listaDiNomi.find {item -> item == "Moira"}
        println(matchEle);
        printf("\n");

        // Operazioni con Liste di Numeri
        println("Operazioni con Liste di Numeri:");
        def listaRandom = 1..6; // def listaRandom = [1,2,3,4,5,6];
        // Trova tutti gli elementi > 4
        def numMatches = listaRandom.findAll {item->item > 4}
        println(numMatches);
        // Vedere se almeno un elemento > 5
        println("> 5: " + listaRandom.any {item -> item > 5});
        // Vedere se ogni elemento rispetta la proprietà (> 1)
        println("> 1: " + listaRandom.every {item -> item > 1});
        // Raddoppiare ogni elemento
        println("Doppio: " + listaRandom.collect {item -> item * 2 });



        /** 
        ESEMPIO 4: 
        * Passare una chiusura ad un metodo
        * N.B.
        */
        println("\nEsempio 4");
        // Lista di numeri
        def listaNumerica = 1..20;
        // Implementazione di una chiusura che descrive la proprietà di mio interesse
        def ottieniDispari = { num -> return ( num % 2 != 0) } 
        // Funzione a cui passo una lista di numeri ed una chiusura
        def shotsNums = modificaLista(listaNumerica, ottieniDispari); 
        println("Dispari: " + shotsNums)

    }

    /**  
    * Funzione per esempio 4: 
    * input: lista e closure
    * ritorna: lista di tutti gli elementi trovati che rispettano la proprietà descritta nella chiusura
    * 
    */
    static def modificaLista(lista, chiusura)
    {
        // Ritorna la lista di tutti gli elementi (find all) che rispettano
        // la proprietà descritta nella chiusura
        return lista.findAll(chiusura);
    }
}