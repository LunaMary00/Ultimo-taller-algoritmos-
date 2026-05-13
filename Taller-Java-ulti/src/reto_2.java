public class reto_2 {

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

    //HAY QUE USAR FOR-EACH Y CAMBIAR 60 POR 30----------------------CAMBIO
//metodo contarAprobados
public static int contarAprobados (int [] notas){
    int sumaAprobados = 0;
    for (int i = 0; i < notas.length; i++) {
        if (notas[i] >= 60) {
            sumaAprobados++;
        }
    }
    return sumaAprobados; 
        }
    // AGREGAR METODO DE ESTADO ARPOBADO Y NO APROBAADO Y ORGANIZAR NOTA MAX, NOTA MIN  Y PROMEDIO-----------------------ARREGLAR

    // metodo mostrarReporte
    public static void mostrarReporte (String [] nombresEstudiantes,int [] notas) {

        System.out.println("nombre:" + "\t" + "nota:" + "\t" + "estado:");
    for (int i = 0; i < nombresEstudiantes.length; i++)
     {
         
       
        System.out.println( nombresEstudiantes[i] + "\t" +notas[i] + "\t");
       /* System.out.println("Promedio: " + calcularPromedio(notas) + "\n" + "Nota maxima: " + buscarMaximo(notas) + "\n" + "Nota minima: " + buscarMinimo(notas) + "\n" + "Cantidad de Aprobados: " + contarAprobados(notas) );
        /*System.out.print("Promedio: " + calcularPromedio(notas));
        System.out.print("estado maximo: " + buscarMaximo(notas));
        System.out.print("estado minimo: " + buscarMinimo(notas));
        System.out.print("Cantidad de Aprobados: " + contarAprobados(notas));*/
    }

}
//main
    public static void main(String[] args) {
        String [] nombresEstudiantes = {"andrea", "luna", "angie", "lucas", "nathaly"};
        int [] notas = {90, 20, 60, 34, 78};
        mostrarReporte(nombresEstudiantes, notas);
    }

}

