
class Cane extends Animale {
	def proprietario;
	
	def Cane(nome, verso, proprietario)
	{
		super(nome,verso);
		this.proprietario = proprietario;
	}
	
	@Override
	def emettiVerso()
	{
		println("$nome dice bark e $verso");
	}
	
	String toString()
	{
		return this.nome + "\t" + this.verso + "\t" + this.proprietario;
	}
	
}
