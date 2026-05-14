
package ejercicio1;

    class Alumno implements Usuario{
    public String getPermisos(){
        return "Permisos básicos";
    }
}

    class Profesor implements Usuario {
        public String getPermisos(){
        return "Permisos avanzados";
    }
}
    
    class UsuarioFactory {
        public static Usuario crearUsuario(String tipo){
            if(tipo.equalsIgnoreCase("alumno")){
                return new Alumno();
            } else if (tipo.equalsIgnoreCase("profesor")){
                return new Profesor();
            }
            throw new IllegalArgumentException("Tipo no valido");
        }
    }


public class Ejercicio1 {
    public static void main(String[] args) {

            // 1. Creamos un Alumno usando la Factory
            Usuario user1 = UsuarioFactory.crearUsuario("alumno");
            System.out.println("Usuario 1: " + user1.getPermisos());

            // 2. Creamos un Profesor usando la Factory
            Usuario user2 = UsuarioFactory.crearUsuario("profesor");
            System.out.println("Usuario 2: " + user2.getPermisos());
            
    }
}
