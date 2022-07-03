/** 
* Le funzioni permettono di suddividere il programma in sottoprogrammi,
* inoltre mi permettono il riuso del codice.
*/
class Funzioni 
{
    





    static void main(String[] args)
    {


        // Chiamata a procedura/metodo statico (di classe)
        sayHello();



        // Chiamata a funzione/metodo statico
        println("5 + 4 = " + getSum(5,4));



        // Chiamata funzione ESEMPIO 1
        def mioNome = "Marco";
        passaggioPerValore(mioNome);
        println("Nel Main " + mioNome);



        // Chiamata funzione ESEMPIO 2
        def listaDaRaddoppiare =  [1,2,3,4];
        println("Lista prima di essere raddoppiata: " + listaDaRaddoppiare);
        listaDaRaddoppiare = raddoppiaElementiLista(listaDaRaddoppiare);
        println("Lista dopo essere stata raddoppiata: " + listaDaRaddoppiare);
   
   
   
   

        // Chiamata funzione ESEMPIO 3
        /**  Passare un numero sconosciuto di parametri ad una funzione */
        def nums = sommaliTutti(1,2,3,4,5,6);
        println("Somma : " + nums);






        // Chiamata funzione ESEMPIO 4:
        def fact4 = fattoriale(4);
        println("Fattoriale di 4: " + fact4);
   
    }







    /** Procedura/Metodo, senza parametri all'interno della classe 'Funzioni' */
   static def sayHello()
   {
       println("Hello");
   }

   /**  Funzione/Metodo con parametri */
   static def getSum(num1=0, num2=0)
   {
       return num1 + num2;
   }

   /**  ESEMPIO 1:  */
   static def passaggioPerValore(nome)
   {
       nome = "Nella Funzione";
       println("Nome: " + nome);
   }

    /**  ESEMPIO 2: N.B.
    *    Utilizzo delle closures per fare una data operazione su tutti 
    *    gli elementi di una lista di interesse 
    */
   static def raddoppiaElementiLista(lista)
   {
       
       def nuovaLista = lista.collect { it * 2} // Closure
       return nuovaLista;
   }



   /**  ESEMPIO 3: N.B.
   * Passaggio di un numero arbitrario di parametri
   * Utilizzo di un'altra closure
   */
   static def sommaliTutti(int ... num)
   {
       def somma = 0;
       num.each { somma += it; } // Closure
       return somma;
   }


   /**  ESEMPIO 4: RICORSIONE */
   static def fattoriale(num)
   {
       if(num <= 1)
            return 1;
        else
            return (num * fattoriale(num-1));
   }



}