import java.util.Arrays;

public class Hakathon_Java {

//RETO 01 

    // metodo saludar

            public static String saludar (String nombre, int edad) {
            return "Hola " + nombre + ", tienes " + edad + " años.";
            }

    // metodo obtenerSaludo

            public static String obtenerSaludo (int hora) { 
            if (hora <= 11) {
                return "Buenos días";
            } if (hora <= 17 && hora >= 12) {
                return "Buenas tardes";
            } else if (hora <= 23 && hora >= 18) {
                return "Buenas noches";
            } else {
            return "Hora no válida";
            }
        }

    //metodo saludarCompleto

            public static void saludarCompleto (int hora, String nombre, int edad) {

                System.out.println(obtenerSaludo(hora) + " " + saludar(nombre, edad));
            }


//RETO 02

    // metodo calcularPromedio

    public static double calcularPromedio (int [] notas){ 
    double sumatoria = 0;
    for (int i = 0 ; i < notas.length; i++) {
        sumatoria += notas[i];
    }
    double promedio = sumatoria / notas.length;
    return promedio;
    }

    // metodo buscarMaximo

    public static int buscarMaximo (int [] notas){
    int maximo = notas[0];
    for (int i = 1; i < notas.length; i++) {
        if (notas[i] > maximo) {
            maximo = notas[i];
        }
    }
    return maximo;
    }

    //metodo buscarMinimo

    public static int buscarMinimo (int [] notas){
    int minimo = notas [0];
    for (int i = 1; i < notas.length; i++) {
        if(notas[i] < minimo) {
            minimo = notas[i];
        }
    }
    return minimo;
    }

    //metodo contarAprobados

    public static int contarAprobados (int [] notas){
    int sumaAprobados = 0;
    for (int i = 0; i < notas.length; i++) {
        if (notas[i] >= 30) {
            sumaAprobados++;
        }
    }
    return sumaAprobados; 
        }

    public static String estado (int nota) {
    if (nota >= 30) {
        return "Aprobado";
    } else {
        return "Reprobado";
    }
    }

    // metodo mostrarReporte

    public static void mostrarReporte (String [] nombresEstudiantes,int [] notas) {

      System.out.println("Nombre:" + "\t" + "\t" + "Nota:" + "\t" + "Estado:");
      System.out.println("*******************************");
                for (int i = 0; i < nombresEstudiantes.length; i++)
    {   
     System.out.println( nombresEstudiantes[i] + "\t" + "\t" + notas[i] + "\t" + estado(notas[i]));
    }
    System.out.println("*******************************");
    System.out.println("Nota maxima: " + buscarMaximo(notas) + "\s" + "--" + " Nota minima: " + buscarMinimo(notas) + "\n" + "Promedio: " + calcularPromedio(notas) + "\n" + "Aprobados: " + contarAprobados(notas));
    }

//RETO 03
    
    // Verificar longitud de la contraseña

    public static boolean tieneLongitudMinima(String pass, int min) {
        return pass.length() >= min;  
    }

    // Validar letra mayúscula en la contraseña

    public static boolean tieneMayuscula(String pass) {
        for (char c : pass.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }

    // Validar letra minúscula en la contraseña
    
    public static boolean tieneMinuscula(String pass) {
        for (char c : pass.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
    // Validar uso de núemero en la ontraseña 
    
    public static boolean tieneDigito(String pass) {
        for (char c : pass.toCharArray()) {
                       if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

   // Validar caracter especial en la contraseña
    
    public static boolean tieneCaracterEspecial(String pass) {
        String especiales = "!@#$%&*";  
        for (char c : pass.toCharArray()) {
           
            if (especiales.contains(String.valueOf(c))) {
                return true;
            }
        }
        return false;  
    }

    // Validar longitud de la contraseña 
    public static String evaluarContrasena(String pass) {
        int longitudMinimaRequerida = 8; 
        if (!tieneLongitudMinima(pass, longitudMinimaRequerida)) {
            return "Débil"; 
        }

    // Verificar reglas cumplidas para idenificar seguridad de la contraseña 
        
        int reglasCumplidas = 0;
        if (tieneMayuscula(pass))        reglasCumplidas++;
            if (tieneMinuscula(pass))        reglasCumplidas++;
        if (tieneDigito(pass))           reglasCumplidas++;
        if (tieneCaracterEspecial(pass)) reglasCumplidas++;


        if (reglasCumplidas == 4) {
            return "Fuerte";
        } else if (reglasCumplidas >= 2) {
            return "Media";
        } else {
            return "Débil";
        }
    }

//RETO 04

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
    



//RETO 05

     // 31. En main() (o llamado desde él) crea probarInventario() que llame a todas las anteriores
    public static void probarInventario() {
        System.out.println( "PRUEBA INVENTARIO");
        
        // 24. Declarar en main  los arreglos paralelos
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor", "Audífonos"};
        int[] precios = {2500000, 45000, 120000, 890000, 200000};

        // 25. Mostrar inventario inicial
        System.out.println("Inventario Inicial:");
        mostrarInventario(productos, precios);

        // 26. Calcular valor total
        double total = calcularValorTotal(precios);
        System.out.println("\nValor total del inventario: $" + total);

        // 27. Buscar un producto
        String buscar = "Monitor";
        int indice = buscarProducto(productos, buscar);
        System.out.println("Búsqueda de '" + buscar + "': Índice encontrado -> " + indice);

        // 28. Producto más caro
        String masCaro = productoMasCaro(productos, precios);
        System.out.println("El producto más caro es: " + masCaro);

        // 29. Filtrar por precio máximo
        int maximoFiltrar = 200000;
        int[] filtrados = filtrarPorPrecio(precios, maximoFiltrar);
        System.out.println("Precios menores o iguales a $" + maximoFiltrar + ": " + Arrays.toString(filtrados));

        // 30. Aplicar descuento del 10%
        System.out.println("\nAplicando 10% de descuento a todo el inventario...");
        aplicarDescuento(precios, 10.0);
        
        // Mostrar inventario final para demostrar los cambios
        mostrarInventario(productos, precios);
    }

    // 25. Crea void mostrarInventario — muestra tabla formateada
    public static void mostrarInventario(String[] prods, int[] precios) {
        System.out.println(String.format("%-2s | %-12s | %-10s", "N°", "Producto", "Precio"));
        System.out.println("---------------------------------");
        for (int i = 0; i < prods.length; i++) {
            // %02d formatea el número a dos dígitos (01, 02...)
            // %-13s alinea el texto a la izquierda con 13 espacios
            System.out.println(String.format("%02d | %-13s | $%d", (i + 1), prods[i], precios[i]));
        }
    }

    // 26. Crea double calcularValorTotal — retorna la suma de los precios
    public static double calcularValorTotal(int[] precios) {
        double total = 0;
        for (int precio : precios) {
            total += precio;
        }
        return total;
    }

    // 27. Crea int buscarProducto — retorna el índice (ignora mayúsculas/minúsculas)
    public static int buscarProducto(String[] prods, String nombre) {
        for (int i = 0; i < prods.length; i++) {
            if (prods[i].equalsIgnoreCase(nombre)) {
                return i; // Retorna la posición de inmediato si lo encuentra
            }
        }
        return -1; // Retorna -1 si el producto no existe en el arreglo
    }

    // 28. Crea String productoMasCaro — retorna el nombre del de mayor precio
    public static String productoMasCaro(String[] prods, int[] precios) {
        if (precios.length == 0) return "";
        int indiceMax = 0; // Asumimos que el primero es el más caro
        for (int i = 1; i < precios.length; i++) {
            if (precios[i] > precios[indiceMax]) {
                indiceMax = i; // Actualizamos el índice del mayor encontrado
            }
        }
        return prods[indiceMax];
    }

    // 29. Crea int[] filtrarPorPrecio — retorna nuevo array con precios <= maximo
    public static int[] filtrarPorPrecio(int[] precios, int maximo) {
        int contador = 0;
        
        // Primer bucle: Contar cuántos elementos cumplen la condición
        for (int precio : precios) {
            if (precio <= maximo) {
                contador++;
            }
        }

        // Inicializar el nuevo arreglo con el tamaño exacto calculado
        int[] resultado = new int[contador];
        int indice = 0;

        // Segundo bucle: Llenar el nuevo arreglo con los valores filtrados
        for (int precio : precios) {
            if (precio <= maximo) {
                resultado[indice] = precio;
                indice++;
            }
        }
        return resultado;
    }

    // 30. Crea void aplicarDescuento — modifica el array original reduciendo el porcentaje
    public static void aplicarDescuento(int[] precios, double porcentaje) {
        for (int i = 0; i < precios.length; i++) {
            // Se calcula el nuevo precio y se castea a (int) porque los precios son enteros
            precios[i] = (int) (precios[i] * (1 - (porcentaje / 100)));
        }
    }


//MAIN Y PRUEBAS DE LOS RETOS

    public static void main(String[] args) {

//PRUEBAS RETO 01
        System.out.println("--- PRUEBAS RETO 01: SALUDADOR INTELIGENTE ---" + "\n");

        // Prueba del método saludar
        System.out.println("saludo 1:");
        String pruebaSaludar = saludar( "andrea", 18);
        System.out.println(pruebaSaludar);

        // Prueba del método obtenerSaludo
        System.out.println("\n" + "saludo 2:");
        String pruebaObtener = obtenerSaludo(20);
        System.out.println(pruebaObtener); 

        // Prueba del método saludarCompleto
        System.out.println("\n" + "saludo 3:");
       saludarCompleto(12, "luna", 20);

//PRUEBAS RETO 02
         System.out.println("\n" + "--- PRUEBAS RETO 02: ESTADISTICAS DE NOTAS ---" + "\n");

         String [] nombresEstudiantes = {"andrea", "luna", "angie", "lucas", "nathaly"};
        int [] notas = {90, 20, 60, 34, 78};

        mostrarReporte(nombresEstudiantes, notas);

 //PRUEBAS RETO 03

        System.out.println("\n" + "--- PRUEBAS RETO 03: VALIDADOR DE CONTRASEÑAS ---" + "\n");

        System.out.println("=== ValidadordeContraseñas ===");
        System.out.println("12345: "      + evaluarContrasena("12345"));
        System.out.println("sololetras: " + evaluarContrasena("sololetras"));
        System.out.println("Clave123: "   + evaluarContrasena("Clave123"));
        System.out.println("Admin2026: "  + evaluarContrasena("Admin2026"));
        System.out.println("Prog*2026!: " + evaluarContrasena("Prog*2026!"));

//PRUEBAS RETO 04

          // 1. Crear el arreglo de datos desordenados
        int[] datos = {45, 12, 89, 5, 23, 67};
        
        System.out.println("\n" + "--- PRUEBAS RETO 04: ORDENAMIENTO Y BUSQUEDA ---" + "\n");
        
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

 //PRUEBAS RETO 05
         System.out.println("\n" + "--- PRUEBAS RETO 05: SISTEMA DE INVENTARIO MODULAR ---");

         // El método main solo coordina la llamada de prueba del inventario
        probarInventario();
        
    }}
