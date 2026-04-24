import java.util.Scanner;

public class TesteCalculadora{
    public static void main(String[] args){
        Calculadora operacao = new Calculadora();

        System.out.println("\n|    Calculadora Básica     |\n----------------------------\n");

	double num1;
	double num2;
	int escolha;
	boolean exit = false;
        Scanner input = new Scanner(System.in);

	while(!exit){
	System.out.print("----------------------------------\nEscolha uma operação para ser efetuada:\n[1] Soma\n[2] Subtração\n[3] Multiplicação\n[4] Divisão\n[9] Sair\n>");
        escolha = input.nextInt();

	if(escolha == 9){break;}

        System.out.print("Insira primeiro número: ");
        num1 = input.nextDouble();

	System.out.print("Insira o segundo número: ");
	num2 = input.nextDouble();

	System.out.println("\nResultado da operação:");

	switch(escolha){
	case 1:
		System.out.println(operacao.somar(num1, num2));
		break;

	case 2:
		System.out.println(operacao.subtrair(num1, num2));
		break;

	case 3:
		System.out.println(operacao.multiplicar(num1, num2));
		break;

	case 4:
		System.out.println(operacao.dividir(num1, num2));
		break;
	}
	}

    }
}
