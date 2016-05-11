package prueba;

public class holaalvaro {

	public static void main(String[] args) {
		String saludo1 = "Hola";
		String saludo2 = "Hola";

		if (saludo1 == saludo2) {
		    System.out.println("Son la misma dirección, el mismo objeto del pool de String");
		} 
		else {
		    System.out.println("Son distintas direcciones de memoria, diferentes objetos");
		}

		if (saludo1.equals(saludo2)) {
		    System.out.println("Son valores iguales, pero diferentes objetos");
		} 
		else {
		    System.out.println("Son diferentes valores");
		}
	}
}