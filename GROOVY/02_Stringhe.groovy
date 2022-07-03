class Stringhe {

    static void main(String[] args)
    {
        def nome = "Marco";
        println('Io sono ${nome}\n'); // stampa: Io sono ${nome}
        // println("Io sono ${nome}\n");
        println("Io sono $nome\n"); // stampa: Io sono Marco

        /**  Stringa multilinea */
        def multiStringa = ''' 
        Io sono una 
        stringa che si protrae per
        più linee. 
        Basta utilizzare i 3 apici.
        ''';
        println(multiStringa);

        /** Accesso ad un carattere di una stringa */
        /**  RICORDA: GLI INDICI INIZIANO DA 0 */
        println("3° Indice della stringa nome :" + nome[3]);
        println("Indice del carattere c: " + nome.indexOf('c'));
        def editore = "Zanichelli";
        println("Insieme dei caratteri dal 1° al 3°: " + editore[0..2]); // N.B.
        println("Ogni altro carattere: " + editore[0,2,4]); // N.B.

        /** Sottostringhe: */
        println("Sottostringa da 1 (compreso) in poi: " + editore.substring(1));
        println("Sottostringa da 1 (compreso) a 4 (non compreso): " + editore.substring(1,4));

        /**  Concatenazione / Ripetizione */
        println("Il mio nome è " + nome);
        println("Il mio nome è " .concat(nome));
        println("Quello che ho detto è " * 3); // N.B.

        /**  Uguaglianza / Ignorare Case sensitive */
        println("Marco == Marco " + 
            ('Marco'.equals('Marco')));
        println("Marco == marco " + 
            ('Marco'.equalsIgnoreCase('Marco'))); // N.B.

        /**  Lunghezza di una stringa */
        println("Lunghezza stringa nome: " + nome.length());
        println("Lunghezza stringa editore: " + editore.length()); 

        /**  Togliere parti di una stringhe */
        def stringaRipetuta = "Quello che ho detto è " * 2;
        println(stringaRipetuta - "Quello"); // N.B.

        /**  Split di una stringa:
        * L'effetto è quello di creare un array di stringhe, in cui ogni elemento
        * è la parte di stringa che precede la condizione di split
        */
        println(stringaRipetuta.split(' ')); // N.B.

        /** Conversione di una stringa in una Lista (di caratteri)  */
        println(stringaRipetuta.toList());

        /** Replace/Sostituzione di tutte le occorrenze di un certo carattere di una stringa,
            con un altro carattere (o stringa)
         */
         println(stringaRipetuta.replaceAll('e', 'iii')); // N.B.

        /**  Uppercase / Lowercase */
        println("Uppercase: " + editore.toUpperCase());
        println("Lowercase: " + editore.toLowerCase());

        /**  Comparazione tra stringhe */
        println("Ant<=> Banana: " + ('Ant' <=> 'Banana')); // stampa -1
        println("Banana <=> Ant: " + ('Banana' <=> 'Ant')); // stampa 1
        println("Ant <=> Ant: " + ('Ant' <=> 'Ant')); // stampa 0
    }

}