/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto.pkg4;

public class Reto4 {

    public static void main(String[] args) {
        // 1. Crear el arreglo de datos desordenados
        int[] datos = {45, 12, 89, 5, 23, 67};
        
        System.out.println("--- PRUEBAS RETO 04: ORDENAMIENTO Y BUSQUEDA ---");
        
        // 2. Mostrar el estado inicial
        System.out.print("Arreglo original: ");
        imprimirArreglo(datos);

        // 3. Ordenar usando el algoritmo de la burbuja
        ordenarBurbuja(datos);
        System.out.print("Arreglo ordenado: ");
        imprimirArreglo(datos);

        // 4. Buscar un elemento que SÍ existe en el arreglo
        int buscarExistente = 23;
        int resultado1 = busquedaBinaria(datos, buscarExistente);
        System.out.println("Buscar elemento " + buscarExistente + ": " + 
            (resultado1 != -1 ? "Encontrado en el indice " + resultado1 : "No encontrado"));

        // 5. Buscar un elemento que NO existe en el arreglo
        int buscarInexistente = 99;
        int resultado2 = busquedaBinaria(datos, buscarInexistente);
        System.out.println("Buscar elemento " + buscarInexistente + ": " + 
            (resultado2 != -1 ? "Encontrado en el índice " + resultado2 : "No encontrado"));
    }

    // Algoritmo de Ordenamiento: Bubble Sort (Ordena de menor a mayor)
    public static void ordenarBurbuja(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    // Intercambiar elementos
                    int temp = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temp;
                }
            }
        }
    }

    // Algoritmo de Búsqueda: Búsqueda Binaria
    public static int busquedaBinaria(int[] arreglo, int objetivo) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == objetivo) {
                return medio; 
            }
            if (arreglo[medio] < objetivo) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return -1; 
    }

    // Método auxiliar para mostrar los elementos por consola
    private static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
