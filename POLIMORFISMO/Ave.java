package POLIMORFISMO;

public class Ave extends Animal{

	private String corPena;

	public String corPena() {
		return corPena;
	}
	public void fazerNinho()
	{
		System.out.println("Construiu um ninho");
	}

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo Frutas");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de ave PRU PRU");
	}

}
