class Iterazione {

    static void main(String[] args)
    {
        /**  WHILE */
        println("############## WHILE ############## ");
        def i = 0;

        while(i < 10)
        {
            if(i % 2) // Se i è pari
            {
                i++;
                continue;
            }

            if(i == 8)
            {
                break;
            }

            println(i);
            i++;
        }

        /**  FOR */
        println("############## FOR ############## ");
        for(i = 0; i <5; i++)
        {
            println(i);
        }

        // For con range
        println("############## For con range ############## ");
        for(j in 2..6)
            println(j);

        // For con liste
        println("############## For con liste ############## ");
        def randList = [10,12,13,14];
        for(j in randList)
            println(j);
        
        // For con mappe
        println("############## For con mappe ############## ");
        def clienti = [
            100 : "Marco",
            101 : "Mattia",
            102 : "Fasil",
            103 : "Diletta"
        ];
        for(cli in clienti)
            println("$cli.value : $cli.key"); // N.B.
    }
}