public class SistemaInventario {

    public static void main(String[] args) {
        //  Llamamos a la función de prueba para demostrar todo el sistema
        probarInventario();
    }


    //  Función contenedora para probar todas las funcionalidades
    public static void probarInventario() {
        // Declaración de los arreglos paralelos en main (origen de datos)
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Audífonos"};
        int[] precios = {2500000, 45000, 120000, 890000, 200000};

        System.out.println("=== 1. INVENTARIO INICIAL ===");
        // Tarea 25: Mostrar inventario original
        mostrarInventario(productos, precios);

        System.out.println("\n=== 2. ESTADÍSTICAS DEL INVENTARIO ===");
        // Calcular valor total
        double valorTotal = calcularValorTotal(precios);
        System.out.printf("Valor total del inventario: $%,.2f\n", valorTotal);

        // Buscar el producto más caro
        String masCaro = productoMasCaro(productos, precios);
        System.out.println("Producto más costoso:        " + masCaro);

        System.out.println("\n=== 3. BÚSQUEDA DE PRODUCTO ===");
        // Buscar un producto por nombre (caso exitoso y no exitoso)
        String buscar = "Teclado";
        int indice = buscarProducto(productos, buscar);
        System.out.println("Buscando '" + buscar + "'... Encontrado en índice: " + indice);
        
        System.out.println("\n=== 4. FILTRADO POR PRECIO ===");
        //  Filtrar precios menores o iguales a $200,000
        int precioMaximo = 200000;
        int[] preciosFiltrados = filtrarPorPrecio(precios, precioMaximo);
        System.out.println("Precios menores o iguales a $" + precioMaximo + ":");
        for (int p : preciosFiltrados) {
            System.out.printf("- $%,d\n", p);
        }

        System.out.println("\n=== 5. APLICACIÓN DE DESCUENTO (10%) ===");
        // Aplicar 10% de descuento (modifica el arreglo original)
        aplicarDescuento(precios, 10.0);
        // Volvemos a mostrar para verificar los cambios
        mostrarInventario(productos, precios);
    }

    //  Muestra la tabla formateada con alineación y formato moneda
    public static void mostrarInventario(String[] prods, int[] precios) {
        System.out.println("-------------------------------------------------");
        System.out.printf("%-4s | %-12s | %-15s\n", "No.", "Producto", "Precio");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < prods.length; i++) {
            
            System.out.printf("%-4d | %-12s | $%,d\n", (i + 1), prods[i], precios[i]);
        }
        System.out.println("-------------------------------------------------");
    }

    //  la suma total de todos los precios
    public static double calcularValorTotal(int[] precios) {
        double total = 0;
        for (int precio : precios) {
            total += precio;
        }
        return total;
    }

    //  Retorna el índice del producto usando equalsIgnoreCase
    public static int buscarProducto(String[] prods, String nombre) {
        for (int i = 0; i < prods.length; i++) {
            if (prods[i].equalsIgnoreCase(nombre)) {
                return i; // Retorna la posición en la que lo encontró
            }
        }
        return -1; // Retorna -1 si el producto no existe en la lista
    }

    //  Retorna el nombre del producto con mayor precio
    public static String productoMasCaro(String[] prods, int[] precios) {
        int indiceMaximo = 0;
        int maxPrecio = precios[0];

        for (int i = 1; i < precios.length; i++) {
            if (precios[i] > maxPrecio) {
                maxPrecio = precios[i];
                indiceMaximo = i; // Guardamos el índice para saber a qué producto pertenece
            }
        }
        return prods[indiceMaximo]; // Usamos el índice para sacar el nombre del arreglo paralelo
    }

    //  Filtra los precios según un máximo (Siguiendo la pista exacta)
    public static int[] filtrarPorPrecio(int[] precios, int maximo) {
        // PISTA Paso 1: Contar cuántos elementos cumplen la condición para saber el tamaño del nuevo array
        int contador = 0;
        for (int precio : precios) {
            if (precio <= maximo) {
                contador++;
            }
        }

        
        int[] resultado = new int[contador];

        
        int indiceResultado = 0;
        for (int precio : precios) {
            if (precio <= maximo) {
                resultado[indiceResultado] = precio;
                indiceResultado++; // Avanzamos la posición del nuevo arreglo
            }
        }
        return resultado;
    }

    // Modifica el array original aplicando el porcentaje dado
    public static void aplicarDescuento(int[] precios, double porcentaje) {
        for (int i = 0; i < precios.length; i++) {
           
            double factor = 1.0 - (porcentaje / 100.0);
            precios[i] = (int) (precios[i] * factor); 
        }
    }
}