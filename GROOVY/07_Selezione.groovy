class Selezione 
{
    static void main(args) 
    {
        /** Operatori di confronto: == != > < >= <= */
        /** Operatori logici:  && || ! */

        
    /*  ####################
        ESEMPIO 1:
        IF
    */ 
        def ageOld = 6;

        if(ageOld == 5)
        {
            println("Vai all'asilo");
        }
        else if( (ageOld > 5) && (ageOld < 18) )
        {
            printf("Vai al %d° anno di scuola\n" , (ageOld - 5) );
        }
        else
        {
            println("Vai all'Università ");
        }

       /* ###################### */
        






        /** ######################
        ESEMPIO 2: 
        Espressione condizionale:
        ( (codizione) ? (istruzioni se condizione vera) : (istruzioni se condizione falsa) )
        */
        def puoVotare = true;
        println(puoVotare ? "Può Votare" : "Non può" ); // 
        
        print("Inserisci la tua età: ")
        def eta = System.console().readLine().toInteger();
        println( (eta >= 18 ) ? "Maggiorenne" : "Minorenne" );
        /* ###################### */






        /** ######################
        ESEMPIO 3: 
        Switch:
        */
        print("Inserisci il voto preso all'esame di programmazione: ")
        def voto = System.console().readLine().toInteger();
        switch(voto) {
            case 18:
                println("Sufficiente");
            break
            case 24:
                println("Bravo");
            break
            case 27:
                println("Molto bravo");
            break
            case 30:
                println("Ottimo");
            break
            case 31:
                println("Lode");
            break
            default:
                println("La descrizione per il voto inserito non è disponibile");
        }

        // ESEMPIO 4: Switch-case con Range
        println("################\nSwitch-case versione con Range\n################");
        switch(voto) {
            case 18..24:
                println("Sufficiente, bravo");
                break;
            case 25..27:
                println("Bravo, molto bravo");
                break;
            case 28..30:
                println("Molto bravo, ottimo");
                break;
            case 31:
                println("Lode, campione");
                break;
            default:
                println("Insufficiente");
        }
    }
}