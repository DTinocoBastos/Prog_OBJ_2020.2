package POLIMORFISMO;

public class Reptil extends Animal {

	private String corEscama;

	public String corEscama() {
		return corEscama;
	}
	

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Rastejando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de Reptil UGA UGA ");
	}
	
	

}
