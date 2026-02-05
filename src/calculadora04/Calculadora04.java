package calculadora04;

public class Calculadora04 {
	
	public int sumar(int a, int b){
		return a+b;
	}
	public int restar(int a, int b) {
		 return a-b;
	}
	public int multiplicar(int a, int b) {
		 return a * b;
	}
	public double dividir(int a, int b) {
		 if (b == 0) {
		 System.out.println("Error: división entre cero");
		 return 0;
		 }
		 return (double) a / b;
		}
		 
}
