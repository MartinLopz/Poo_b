package datos;
/**
 *
 * @author Darkar
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar objeto y asignar argumentos o valores
        Informacion info = new Informacion ("Martin ","sistemas ",3);
        // encapsular 
        String NumCon = info.getNombre()+""+info.getCarrera()+""+info.getSemestre()+"";
        System.out.println("Datos del alumno: "+NumCon);
        /* 
       Informacion info = new Informacion ("","",0);
       info.setNombre("martin");
       info.setCarrera("ing. informatica");
       info.setSemestre(3);
       info.MostrarDatos();
        System.out.println("\n");
      */  
    }
    
}
