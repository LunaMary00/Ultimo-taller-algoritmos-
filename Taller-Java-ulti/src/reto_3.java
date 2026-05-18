public class ValidadordeContrasenas {

    // Definir las variables para seridad de la contraseña
    
    public static void main(String[] args) {
       
        System.out.println("=== ValidadordeContraseñas ===");
        System.out.println("12345: "      + evaluarContrasena("12345"));
        System.out.println("sololetras: " + evaluarContrasena("sololetras"));
        System.out.println("Clave123: "   + evaluarContrasena("Clave123"));
        System.out.println("Admin2026: "  + evaluarContrasena("Admin2026"));
        System.out.println("Prog*2026!: " + evaluarContrasena("Prog*2026!"));
    }

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
}
