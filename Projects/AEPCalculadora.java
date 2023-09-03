import java.util.Scanner;

class Calculadora{
	//double num1, num2;
        
    
    
    
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public static double porcentagem(double num1, double num2) {
        return (num1 / 100) * num2;
    }

    public static double raizQuadrada(double num) {
        return Math.sqrt(num);
    }

    public static double exponenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    

	}
}



public class AEPCalculadora {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	Calculadora calc = new Calculadora();
	
	double num1, num2, resultado;
    int operacao;
    
    // Solicita a opera��o desejada
    System.out.println("Digite a opera��o desejada:");
    System.out.println("1 - Adi��o");
    System.out.println("2 - Subtra��o");
    System.out.println("3 - Multiplica��o");
    System.out.println("4 - Divis�o");
    System.out.println("5 - Porcentagem");
    System.out.println("6 - Raiz quadrada");
    System.out.println("7 - Exponencia��o");
    operacao = input.nextInt();

    // Solicita os n�meros necess�rios para realizar a opera��o
    System.out.println("Digite o primeiro n�mero:");
    num1 = input.nextDouble();

    if (operacao != 6) { // A opera��o de raiz quadrada s� requer um n�mero
        System.out.println("Digite o segundo n�mero:");
        num2 = input.nextDouble();
    } else {
        num2 = 0; // A opera��o de raiz quadrada s� requer um n�mero
    }

    // Realiza a opera��o de acordo com a op��o selecionada
    switch (operacao) {
        case 1:
            resultado = adicao(num1, num2);
            System.out.println("O resultado da adi��o �: " + resultado);
            break;
        case 2:
            resultado = calc.subtracao(num1, num2);
            System.out.println("O resultado da subtra��o �: " + resultado);
            break;
        case 3:
            resultado = calc.multiplicacao(num1, num2);
            System.out.println("O resultado da multiplica��o �: " + resultado);
            break;
        case 4:
            resultado = calc.divisao(num1, num2);
            System.out.println("O resultado da divis�o �: " + resultado);
            break;
        case 5:
            resultado = calc.porcentagem(num1, num2);
            System.out.println("O resultado da porcentagem �: " + resultado);
            break;
        case 6:
            resultado = calc.raizQuadrada(num1);
            System.out.println("O resultado da raiz quadrada �: " + resultado);
            break;
        case 7:
            resultado = calc.exponenciacao(num1, num2);
            System.out.println("O resultado da exponencia��o �: " + resultado);
            break;
        default:
            System.out.println("Op��o inv�lida!");
            break;
    }
    
	
	}
	public static double adicao(double num1, double num2) {
        return num1 + num2;
    }
}
