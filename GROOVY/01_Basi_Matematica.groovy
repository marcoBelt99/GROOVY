/**  Corso seguito: https://www.youtube.com/watch?v=B98jc8hdu9g */

class GroovyTut {
    static void main(String[] args){
        
        // Istruzione di stampa
        println("Hello World");

        // Dichiarazione ed inizializzazione di variabili. 
        // RICODA: Supporto al dynamic typing
        def age = "Dog";
        age = 40;

        // Stampa e Operazioni matematiche di base
        println("5 + 4 = " + (5 + 4));
        println("5 - 4 = " + (5 - 4));
        println("5 * 4 = " + (5 * 4));
        println("5 / 4 = " + (5.intdiv(4))); // Divisione intera!
        println("5 % 4 = " + (5 % 4));

        // Numeri floating point
        println("3 + 2 * 5 = " + (3+2*5) )
        println("(3 + 2) * 5 = " + ((3+2)*5) )

        // Operatori aritmetici unari
        println("age++ " + (age++)); // stampa 40
        println("++age " + (++age)); // stampa 42
        println("age-- " + (age--)); // stampa 42
        println("--age " + (--age)); // stampa 40

        // Tipi numerici, Massimo e minimo intero, float e double
        println("Massimo numero intero " + Integer.MAX_VALUE);
        println("Minimo numero intero " + Integer.MIN_VALUE);
        println("Massimo numero reale " + Float.MAX_VALUE);
        println("Minimo numero intero " + Float.MIN_VALUE);
        println("Massimo numero reale " + Double.MAX_VALUE);
        println("Minimo numero intero " + Double.MIN_VALUE);

        /**  RICORDA: tutti i tipi all'interno di Groovy sono oggetti */
        /**  L'accuratezza dei numeri è molto precisa a differenza di molti altri linguaggi di programmazione*/
        println("1.10000000000000001 + 1.10000000000000001 =" + 
            (1.10000000000000011111111111111111111111111111111111111 +
            1.10000000000000011111111111111111111111111111111111111 
            ));

        /**  Operazioni matematiche: */
        def randNum = 2.0;
        
        println("Math.abs(-2.45) = " + (Math.abs(-2.45))); // Valore assoluto
        println("Math.round(2.45) = " + (Math.round(2.45))); // 
        println("randNum.pow(3) = " + (randNum.pow(3))); // Elevamento a potenza
        println("3.0.equals(2.0) = " + (3.0.equals(2.0))); // Uguaglianza numerica
        println("randNum.equals(Float.NaN) = " + (randNum.equals(Float.NaN))); // Verificare validità numero
        println("Math.sqrt(9) = " + (Math.sqrt(9))); // Radice quadrata
        println("Math.cbrt(27) = " + (Math.cbrt(27))); // 
        println("Math.ceil(2.45) = " + (Math.ceil(2.45))); // Ceil
        println("Math.floor(2.45) = " + (Math.floor(2.45))); // Floor
        println("Math.min(2,3) = " + (Math.min(2,3))); // Ricerca del minimo tra due numeri
        println("Math.max(2,3) = " + (Math.max(2,3))); // Ricerca del massimo tra due numeri
        println("Math.log(2) = " + (Math.log(2))); // Logaritmo in base 2
        println("Math.log10(2) = " + (Math.log10(2))); // Logaritmo in base 10
        println("Math.toDegrees(Math.PI) = " + (Math.toDegrees(Math.PI))); // Conversione da radianti a gradi
        println("Math.toRadians(90) = " + (Math.toRadians(90))); // Conversione da gradi a radianti
        // sin, cos, tan, asin, acos, atan, sinh, cosh, tanh
        println("Math.sin(0.5 * Math.PI) = "+ (Math.sin(0.5 * Math.PI)));

        /**  Generazione numero casuale tra 1 a 100 */
        println("Math.abs( new Random().nextInt() % 100 ) + 1 = " + 
        (Math.abs( new Random().nextInt() % 100 ) + 1));
    }
}