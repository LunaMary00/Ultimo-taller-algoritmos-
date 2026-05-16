public class rule_2 {

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
    
//main
    public static void main(String[] args) {

        String [] nombresEstudiantes = {"andrea", "luna", "angie", "lucas", "nathaly"};
        int [] notas = {90, 20, 60, 34, 78};

        mostrarReporte(nombresEstudiantes, notas);
    }

}
