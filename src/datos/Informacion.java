package datos;

/**
 *
 * @author Darkar
 */
public class Informacion {
    String nombre;
    String carrera;
    int semestre;

    public Informacion(String nombre, String carrera, int semestre) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.semestre = semestre;
        
    }

    public String getNombre() {
        return "El nombte del alumno es: "+ nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return "La carrera que el alumno esta cursando es "+carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String  getSemestre() {
        return "El semestre que el alumno cursa es: "+ semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    public void MostrarDatos(){
    System.out.println("Nombre: "+nombre);
    System.out.println("Carrera: "+ carrera);
    System.out.println("Semestre: "+ semestre);
    }
    
}
