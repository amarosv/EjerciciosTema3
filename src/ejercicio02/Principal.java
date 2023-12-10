package ejercicio02;

import java.util.Scanner;

public class Principal {
	
	// Creamos el Scanner estático para poder usuarlo en las funciones
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable donde se almacenará la opció
		int opc;
		
		// Variable donde se almacenará el ancho
		double ancho;
		
		// Variable donde se almacenará el alto
		double alto;
		
		// Pedimos los números al usuario
		ancho = pideAncho();
		alto = pideAlto();
		
		// Mostramos el menú y obtenemos la opción elegida
		opc = menu();
		
		// Creamos un nuevo objeto Rectangulo con el alto y ancho obtenidos
		Rectangulo rectangulo = new Rectangulo(alto, ancho);
		
		// Según la opción elegida, mostramos el mensaje y resultado
		switch(opc) {
			case 1:
				System.out.println("El resultado del permitro es: " + rectangulo.perimetro());
				break;
			case 2:
				System.out.println("El resultado del permitro es: " + rectangulo.area());
				break;
			case 0:
				System.out.println("¡Hasta pronto!");
				break;
		}
		
		// Cerramos el Scanner
		sc.close();
		
	}

	public static int menu() {
		// Variable donde se almacenará la opción elegida
		int opc;
		
		// Mostramos el menú con las diferentes opciones
		System.out.println("El elige una opción\n"
				+ "1. Perímetro\n"
				+ "2. Área\n"
				+ "0. Salir");
		
		// Leemos la opción elegida por el usuario
		opc = sc.nextInt();
		
		// Devolvemos la opción elegida
		return opc;
	}

	public static double pideAncho() {
		// Variable donde se almacenará el ancho introducido
		double ancho = 0;
		
		// Pedimos el ancho y lo almacenamos
		System.out.println("Introduzca el ancho");
		ancho = sc.nextDouble();
		
		// Devolvemos el ancho introducido
		return ancho;
	}
	
	public static double pideAlto() {
		// Variable donde se almacenará el alto introducido
		double alto = 0;
		
		// Pedimos el alto y lo almacenamos
		System.out.println("Introduzca el alto");
		alto = sc.nextDouble();
		
		// Devolvemos el alto
		return alto;
	}

}