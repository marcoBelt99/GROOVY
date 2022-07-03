class InputOutput {

    static void main(String[] args) {

        def stringaRandom = "Random";

        println("Una $stringaRandom string");

        /**  N.B.: Altra funzione di output */
        printf("Una %s string \n", stringaRandom);

        /** Specificatori di formato e stampa formattata */
        printf("%-10s %d %.2f %10s \n", 
        ['Stuff', 10, 1.234, 'Random']);

        /** INPUT */
        /**  Lettura di una stringa */
        print("Inserisci il tuo nome: "); // N.B.: non è la println, quindi non va a capo
        def nome = System.console().readLine();
        println("Ciao " + nome);

        /** Lettura di un numero:
        * RICORDA: quando leggo da tastiera un numero, ogni cosa che
        * leggo è una stringa, quindi è opportuno effettuare il cast al tipo
        * che si desidera leggere 
        */
        print("Inserisci un numero: ")
        def num1 = System.console().readLine().toDouble();
        print("Inserisci un numero: ")
        def num2 = System.console().readLine().toDouble();

        // Stampa a video formattata
        printf("%.2f + %.2f = %.2f \n", 
        [num1, num2, (num1 + num2)] );
    }
}