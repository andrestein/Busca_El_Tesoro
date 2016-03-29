package mundo.busca_el_tesoro;

/**
 * Created by LENOVO on 21/03/2016.
 */
public class Jugador {

    //Atributos
    private String nombre;
    private int puntaje;

    //Constructores
    public Jugador(){
        nombre="jugador";
    }

    public Jugador(String nombre){
        this.nombre= nombre;

    }

    //Metodos accesores
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
}
