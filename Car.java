class Carro{
	int anoFab;
	String marca;
	String modelo;
	String cor;
	boolean partida;
	int velocidade;
	boolean andar;
	
	void status() {
		System.out.println("Modelo do carro: "+this.modelo);
		System.out.println("Cor do carro: "+this.cor);
		System.out.println("Marca do carro: "+this.marca);
		System.out.println("Ano de Fabricacao do carro: "+this.anoFab);
		System.out.println("Velocidade Maxima do carro: "+this.velocidade+"KM");
	}
	
	void mover() {
		if(this.partida == true && this.andar) {
			System.out.println("Carro ligado, acelerando");
		}
		else {
			System.out.println("O carro nao pode dar partida");
		}
	}
	
	void acelerar() {
		this.andar = true;
	}
	void freiar() {
		this.andar = false;
	}
	
	void ligado() {
		this.partida = true;
	}
	
	void desligado() {
		this.partida = false;
	}
}

public class Car {

	public static void main(String[] args) {
			
		Carro c1 = new Carro();
		c1.anoFab = 2013;
		c1.cor = "Preto";
		c1.marca = "Uno";
		c1.modelo = "Uno Way";
		c1.velocidade = 270;
		c1.status();
		c1.desligado();
		c1.freiar();
		c1.mover();
		
		System.out.println("---------------------------------------");
		
		Carro c2 = new Carro();
		c2.anoFab = 1967;
		c2.cor = "Preto";
		c2.marca = "Chevrolet";
		c2.modelo = "Impala 67";
		c2.velocidade = 250;
		c2.status();
		c2.ligado();
		c2.acelerar();
		c2.mover();
		
		
				
	}

}