public class Calculadora {
	public double num1, num2;

	public Calculadora(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public Calculadora(){
		this.num1 = 9.0;
                this.num2 = 5.0;
	}

    public double somar(double num1, double num2){
        return num1 + num2;
    }

    public double subtrair(double num1, double num2){
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2){
        return num1 * num2;
    }

    public double dividir(double num1, double num2){
        return num1 / num2;
    }

	public void setNum(double num1, double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
}
