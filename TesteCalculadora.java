public class TesteCalculadora{
    public static void main(String[] args){
        Calculadora operacao1 = new Calculadora(20.0, 2.0);
        Calculadora operacao2 = new Calculadora();

	System.out.println("Operações do primeiro objeto: \n");
        System.out.println("Soma: " + operacao1.somar(operacao1.num1, operacao1.num2));
	System.out.println("Subtração: " + operacao1.subtrair(operacao1.num1, operacao1.num2));
	System.out.println("Multiplicação: " + operacao1.multiplicar(operacao1.num1, operacao1.num2));
	System.out.println("Divisão: " + operacao1.dividir(operacao1.num1, operacao1.num2));
        
	System.out.println("\nOperações do segundo objeto: \n");
        System.out.println("Soma: " + operacao2.somar(operacao2.num1, operacao2.num2));
        System.out.println("Subtração: " + operacao2.subtrair(operacao2.num1, operacao2.num2));
        System.out.println("Multiplicação: " + operacao2.multiplicar(operacao2.num1, operacao2.num2));
        System.out.println("Divisão: " + operacao2.dividir(operacao2.num1, operacao2.num2));

	operacao2.setNum(30.0, 3.0);
	System.out.println("\nNúmero 2 alterado.\n-----------------------\n");
	System.out.println("\nOperações do segundo objeto: \n");
        System.out.println("Soma: " + operacao2.somar(operacao2.num1, operacao2.num2));
        System.out.println("Subtração: " + operacao2.subtrair(operacao2.num1, operacao2.num2));
        System.out.println("Multiplicação: " + operacao2.multiplicar(operacao2.num1, operacao2.num2));
        System.out.println("Divisão: " + operacao2.dividir(operacao2.num1, operacao2.num2));
	
    }
}
