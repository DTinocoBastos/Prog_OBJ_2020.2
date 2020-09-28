package POLIMORFISMO;

public class Mamifero extends Animal{
	private String corPelo;

	public String corPelo() {
		return corPelo;
	}
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Correndo");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("amamentando");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de mamifero ");
	}
	

}
