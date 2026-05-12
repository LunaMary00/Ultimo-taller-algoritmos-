public class reto_1{


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
            } else if (hora <=18 && hora >=23) {
                return "Buenas noches";
            } else {
            return "Hora no válida";
            }
        }

    //metodo saludarCompleto
            public static void saludarCompleto (int hora, String nombre, int edad) {

                System.out.println(obtenerSaludo(hora) + " " + saludar(nombre, edad));
            }


    public static void main(String[] args) {

        // Prueba del método saludar

        String pruebaSaludar = saludar("andrea", 18);
        System.out.println(pruebaSaludar);


        // Prueba del método obtenerSaludo

        String pruebaObtener = obtenerSaludo(20);
        System.out.println(pruebaObtener); 


        // Prueba del método saludarCompleto

        saludarCompleto(12, "luna", 20); 

        
    }}