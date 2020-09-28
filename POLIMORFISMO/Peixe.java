package POLIMORFISMO;

public class Peixe extends Animal {

	private String corEscama;

	public String corEscama() {
		return corEscama;
	}
	public void soltarbolha()
	{
		System.out.println("Soltou uma bolha");
	}
	
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo substancias");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixe não faz som");
	}

}
