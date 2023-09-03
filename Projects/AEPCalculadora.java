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
    
    // Solicita a operação desejada
    System.out.println("Digite a operação desejada:");
    System.out.println("1 - Adição");
    System.out.println("2 - Subtração");
    System.out.println("3 - Multiplicação");
    System.out.println("4 - Divisão");
    System.out.println("5 - Porcentagem");
    System.out.println("6 - Raiz quadrada");
    System.out.println("7 - Exponenciação");
    operacao = input.nextInt();

    // Solicita os números necessários para realizar a operação
    System.out.println("Digite o primeiro número:");
    num1 = input.nextDouble();

    if (operacao != 6) { // A operação de raiz quadrada só requer um número
        System.out.println("Digite o segundo número:");
        num2 = input.nextDouble();
    } else {
        num2 = 0; // A operação de raiz quadrada só requer um número
    }

    // Realiza a operação de acordo com a opção selecionada
    switch (operacao) {
        case 1:
            resultado = adicao(num1, num2);
            System.out.println("O resultado da adição é: " + resultado);
            break;
        case 2:
            resultado = calc.subtracao(num1, num2);
            System.out.println("O resultado da subtração é: " + resultado);
            break;
        case 3:
            resultado = calc.multiplicacao(num1, num2);
            System.out.println("O resultado da multiplicação é: " + resultado);
            break;
        case 4:
            resultado = calc.divisao(num1, num2);
            System.out.println("O resultado da divisão é: " + resultado);
            break;
        case 5:
            resultado = calc.porcentagem(num1, num2);
            System.out.println("O resultado da porcentagem é: " + resultado);
            break;
        case 6:
            resultado = calc.raizQuadrada(num1);
            System.out.println("O resultado da raiz quadrada é: " + resultado);
            break;
        case 7:
            resultado = calc.exponenciacao(num1, num2);
            System.out.println("O resultado da exponenciação é: " + resultado);
            break;
        default:
            System.out.println("Opção inválida!");
            break;
    }
    
	
	}
	public static double adicao(double num1, double num2) {
        return num1 + num2;
    }
}
