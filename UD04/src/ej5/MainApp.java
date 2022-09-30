package ej5;

public class MainApp {

	public static void main(String[] args) {
		
		int a=1, b=5, c=3, d=7, aux;
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
		
		aux=b;
		b=c;
		c=a;
		a=d;
		d=aux;
		
		
		System.out.println("Después del cambio B=C, C=A, A=D, D=B");
		System.out.println("A = "+a+" B = "+b+" C = "+c+" D = "+d);
	}

}
