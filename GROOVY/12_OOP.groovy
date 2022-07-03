//import groovy.transform.Tostring; // Importo il metodo che voglio usare

//@ToString(includeNames=true, includeFields=true)
class Animale
{
    // Attributi
    def nome;
    def verso;

    // Costruttore
    def Animale(nome, verso)
    {
        this.nome = nome;
        this.verso = verso;
    }

    // Metodi
    def run()
    {
        println("$nome runs");
    }

    def emettiVerso()
    {
        println("$nome dice $verso");
    }

}



class GroovyOOP 
{
    static void main(String[] args)
    {
        // def king = new Animale(nome : 'King', verso : 'Ruggito');
        def king = new Animale('King', 'Ruggito');

        king.run();

        println("$king.nome fa $king.verso");
    }
}