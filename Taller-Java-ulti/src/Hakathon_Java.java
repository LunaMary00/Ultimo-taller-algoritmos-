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




    //RETO 04



    //RETO 05


    //RETO 06



    //MAIN Y PRUEBAS DE LOS RETOS

    public static void main(String[] args) {

        //PRUEBAS RETO 01
        System.out.println("pruebas del reto 01:");

        // Prueba del método saludar
        String pruebaSaludar = saludar("andrea", 18);
        System.out.println(pruebaSaludar);


        // Prueba del método obtenerSaludo
        String pruebaObtener = obtenerSaludo(20);
        System.out.println(pruebaObtener); 


        // Prueba del método saludarCompleto
       saludarCompleto(12, "luna", 20);

       //PRUEBAS RETO 02
         System.out.println("\n" + "pruebas del reto 02:");

         String [] nombresEstudiantes = {"andrea", "luna", "angie", "lucas", "nathaly"};
        int [] notas = {90, 20, 60, 34, 78};

        mostrarReporte(nombresEstudiantes, notas);
        
    }}
