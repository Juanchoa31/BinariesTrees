package arbolesbinarios;

import java.util.Scanner;

public class ArbolesBinarios {

    public static void main(String[] args) {
        AB arbolbinario = new AB();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tamanio inicial del arbol: " + arbolbinario.tamanio);
        System.out.println("¿Es válido el árbol?: " + arbolbinario.validar());

        System.out.print("¿Cuántos numeros desea insertar? ");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese un numero para insertar en el arbol: ");
            int numero = scanner.nextInt();
            arbolbinario.insertar(numero);
        }

        System.out.println("Tamanio final del arbol: " + arbolbinario.tamanio);
        System.out.println("¿Es valido el arbol ahora?: " + arbolbinario.validar());

        scanner.close();

        cantidad = arbolbinario.contarHojas(arbolbinario.raiz);
        System.out.println("Cantidad de hojas: " + cantidad+"\n");

        System.out.println("Recorrido Preorden");
        arbolbinario.imprimirPreorden();

        System.out.println("\nRecorrido Inorden");
        arbolbinario.imprimirInorden();

        System.out.println("\nRecorrido Posorden");
        arbolbinario.imprimirPosorden();
    }
}
