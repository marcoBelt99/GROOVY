class GroovyRange {

    static void main(String[] args)
    {
        /**  N.B. */
        /**  Range/Intervallo di interi */
        def oneTo10 = 1..10;
        /**  Range di caratteri */
        def aToZ = 'a'..'z';
        def zToA = 'z'..'a';

        // Stampa a video dei risultati
        println(oneTo10);
        println(aToZ);
        println(zToA);

        /**  Dimensione di un range */
        println("Dimensione " + oneTo10.size());

        /**  Accesso ad un elemento di un range */
        println("2nd Item " + oneTo10.get(1) );

        /**  Vedere se un range contiene un valore (numero, carattere) */
        println("Contiene 11 " + oneTo10.contains(11));

        /**  Ottenere l'ultimo elemento */
        println("Ottieni l'ultimo elemento " + oneTo10.getTo());
        
        /**  Ottenere il primo elemento */
        println("Ottieni il primo elemento " + oneTo10.getFrom());

    }

}