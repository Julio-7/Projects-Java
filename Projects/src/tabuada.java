import java.util.*;
public class tabuada {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.print("1- Tabuada inteira  2- Tabuada de um numero especifico   3- sair: ");
		Integer escolha = input.nextInt();
		
		if(escolha==1) {
			tabuadaInteira();
		}
			
		else if(escolha==2) {
			tabuadaEspecifica();
		}
		
		else if(escolha==3) {
			sair();
		}
		else {
			System.out.println("Valor Inválido. Tenta novamente \n");
		}
		}
					
			
		}
	
		private static void tabuadaInteira() {
			
			for(int numero = 1; numero<=10; numero++) {
				for(int num2 = 1; num2<=10; num2++) {
					System.out.printf(+numero+"X"+num2+" ="+ numero*num2+"\n");
				}
				
			}
		}
		private static void tabuadaEspecifica() {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Digite qual tabuada tu deseja: ");
			Integer numero = input.nextInt();
			
			for(int numero3 = 1; numero3<=10; numero3++) {
				System.out.printf(+numero+"X"+numero3+"="+numero3*numero+"\n");
				
			}
			
		}
		
		private static void sair() {
			System.out.println("Valeu Falou!!<3");
			System.exit(0);
		}
		
		
		
	}


