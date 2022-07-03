class GroovyFile 
{
    static void main(String[] args)
    {
        /** 
        * ESEMPIO 1: 
        * Lettura di ogni riga del file
        * 'test.txt'
         
        Linea 1
        Linea 2
        Linea 3
        Linea 4
        Linea 5
        Linea 6
        Linea 7
        Linea 8
         
        e stampa a video.
        */
        new File("test.txt").eachLine 
        {
            line-> println "$line";
        }

        /** 
        * ESEMPIO 2: 
        * Scrittura su file
        * Sovrascrivere il file
        * 'test1.txt':
        
        Linea 1
        Linea 2
        Linea 3
        Linea 4    -->  quello che voglio scrivere (sovrascrivendo quello che c'era prima)
        Linea 5
        Linea 6
        Linea 7
        Linea 8
        
        e stampa a video.
        */
        new File("test1.txt").withWriter('utf-8')
        {
            writer -> writer.writeLine("quello che voglio scrivere (sovrascrivendo quello che c'era prima)");
        }



        /**  
        * ESEMPIO 3
        * Scrittura in Append su file 'test2.txt'
        * 
        */

        File file = new File("test2.txt");
        file.append('\nCiao a tutti, questa riga è in append!');


        /** 
        * ESEMPIO 4:
        * Varie operazioni su file
        */

        /**
        * Stampa a video di un file salvato in una variabile:
        */
        println("\nStampa a video di un file salvato in una variabile:\n")
        println(file.text);

        /*
        * Dimensione di un file in numero di bytes
        */ 
        println("Dimensione file: ${file.length()} bytes");
        
        /** 
        * Verificare se è un file oppure se è una directory
        */
        println("File:  ${file.isFile()} ");
        println("File:  ${file.isDirectory()} ");

        /** 
        * Copiare un file su un altro
        */
        def newFile = new File("test3.txt");
        newFile << file.text;

        /** 
        * Creazione di un file
        * Eliminazione di un file
        */

        // Creazione file vuoto
        def temp = new File("temporaneo.txt");
        temp.createNewFile();
        // File temp = new File("temporaneo.txt");
        
        // Scrittura su file
        temp.write "Prima Linea\n";
        temp << "Seconda Linea\n";
        
        // Eliminazione file
        temp.delete();


        /**
        * Ottenere una Directory di file
        *
        */
        def dirFiles = new File("").listRoots();

        dirFiles.each
        {
            item -> println file.absolutePath;
        }
    }
}