package POLIMORFISMO;

public class TesterAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-------------------------");
		System.out.println("PRINTANDO MAMIFERO");
		System.out.println("-------------------------");
		Mamifero mamifero=new Mamifero();
		mamifero.setPeso(10);
		mamifero.setIdade(2);
		mamifero.setMembros(4);
		mamifero.locomover();
		mamifero.alimentar();
		mamifero.emitirSom();
		System.out.println("-------------------------");
		System.out.println("PRINTANDO CACHORRO");
		System.out.println("-------------------------");
		Cachorro cachorro=new Cachorro();
		cachorro.setPeso(10);
		cachorro.setIdade(2);
		cachorro.setMembros(4);
		cachorro.locomover();
		cachorro.alimentar();
		cachorro.emitirSom();
		cachorro.abanarRabo();
		cachorro.enterrarOsso();
		System.out.println("-------------------------");
		System.out.println("PRINTANDO CANGURU");
		System.out.println("-------------------------");
		Canguru canguru=new Canguru();
		canguru.setPeso(10);
		canguru.setIdade(2);
		canguru.setMembros(4);
		canguru.locomover();
		canguru.alimentar();
		canguru.emitirSom();
		canguru.usarBolsa();
		System.out.println("-------------------------");
		System.out.println("PRINTANDO PEIXE");
		System.out.println("-------------------------");
		Peixe peixe=new Peixe();
		peixe.setPeso(0.35);
		peixe.setIdade(1);
		peixe.setMembros(0);
		peixe.locomover();
		peixe.alimentar();
		peixe.emitirSom();
		peixe.soltarbolha();
		System.out.println("-------------------------");
		System.out.println("PRINTANDO GOLDFISH");
		System.out.println("-------------------------");
		Goldfish goldfish=new Goldfish();
		goldfish.emitirSom();		
		System.out.println("-------------------------");
		System.out.println("PRINTANDO AVE");
		System.out.println("-------------------------");
		Ave ave =new Ave();
		ave.setPeso(0.89);
		ave.setIdade(2);
		ave.setMembros(2);
		ave.locomover();
		ave.alimentar();
		ave.emitirSom();
		ave.fazerNinho();
		System.out.println("-------------------------");
		System.out.println("PRINTANDO ARARA");
		System.out.println("-------------------------");
		Arara arara=new Arara();
		arara.emitirSom("testando o som da arara");
		System.out.println("-------------------------");
		System.out.println("PRINTANDO REPTIL");
		System.out.println("-------------------------");
		Reptil reptil=new Reptil();
		reptil.setPeso(0.35);
		reptil.setIdade(1);
		reptil.setMembros(0);
		reptil.locomover();
		reptil.alimentar();
		reptil.emitirSom();
		System.out.println("-------------------------");
		System.out.println("PRINTANDO TARTARUGA");
		System.out.println("-------------------------");
		Tartaruga tartaruga=new Tartaruga();
		tartaruga.locomover();
		System.out.println("-------------------------");
		
		
	}

}
