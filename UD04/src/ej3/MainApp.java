package ej3;

public class MainApp {

	public static void main(String[] args) {
		
		int x=2, y=6;
		double n=10.5, m= 7.5;
		
		System.out.println("El valor de la variable X es "+x);
		System.out.println("El valor de la variable Y es "+y);
		System.out.println("El valor de la variable N es "+n);
		System.out.println("El valor de la variable M es "+m);
		
		System.out.println(x+" + "+y+ " = "+ (x+y));
		
		System.out.println(x+" - "+y+ " = "+ (x-y));
		
		System.out.println(x+" * "+y+ " = "+ (x*y));
		
		System.out.println(x+" / "+y+ " = "+ (x/y));
		
		System.out.println(x+" % "+y+ " = "+ (x%y));
		
		System.out.println(n+" + "+m+ " = "+ (n+m));
		
		System.out.println(n+" - "+m+ " = "+ (n-m));
		
		System.out.println(n+" * "+m+ " = "+ (n*m));
		
		System.out.println(n+" / "+m+ " = "+ (n/m));
		
		System.out.println(n+" % "+m+ " = "+ (n%m));
		
		System.out.println(x+" + "+n+ " = "+ (x+n));
		
		System.out.println(y+" / "+m+ " = "+ (y/m));
		
		System.out.println(y+" / "+m+ " = "+ (y%m));
		
		System.out.println("El doble de "+x+ " es "+(2*x));
		System.out.println("El doble de "+y+ " es "+(2*y));
		System.out.println("El doble de "+n+ " es "+(2*n));
		System.out.println("El doble de "+m+ " es "+(2*m));
		
		System.out.println(x+" + "+y+ " + " + n+ " + " +n+ " = "+ (x+y+n+m));
		
		System.out.println(x+" * "+y+ " * " + n+ " * " +n+ " = "+ (x*y*n*m));
	}

}
