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


}
