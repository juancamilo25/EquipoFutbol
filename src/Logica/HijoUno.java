package Logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HijoUno extends Padre {

    private String nombreJugadorTitula;
    private String posicionJugadorTitula;
    private String nombreJugadorSuplent;
    private String posicionJugadorSuplent;
  //  protected Padre datosEquipos[];
   // protected int maximoDatos = 100;
    //protected int contadorDatos;
    private List<HijoUno> ListadoJugadoresTitular = new ArrayList<>();
    private List<HijoUno> ListadoJugadoresTitularAux = new ArrayList<>();

    public HijoUno() {
        super();
       // this.maximoDatos = maximoDatos;
        this.nombreEstadio = nombreEstadio;
        this.nombreJugadorTitula = nombreJugadorTitula;
        this.posicionJugadorTitula = posicionJugadorTitula;
      //  this.datosEquipos = new Padre[maximoDatos];
    }

    public List<HijoUno> getListadoJugadoresTitular() {
        return ListadoJugadoresTitular;
    }

    public void setListadoJugadoresTitular(List<HijoUno> listadoJugadoresTitular) {
        ListadoJugadoresTitular = listadoJugadoresTitular;
    }

    @Override
    public String toString() {
        return "HijoUno{" +
                "nombreJugadorTitula='" + nombreJugadorTitula + '\'' +
                ", posicionJugadorTitula='" + posicionJugadorTitula + '\'' +
                ", nombreEquipo='" + nombreEquipo + '\'' +
                ", nombreEstadio='" + nombreEstadio + '\'' +
                ", cantidadTitulos=" + cantidadTitulos +
                '}';
    }

    public void setNombreEstadio(String nombreEstadio) {
        this.nombreEstadio = nombreEstadio;
    }

/**
    public int getMaximoDatos() {
        return maximoDatos;
    }

    public void setMaximoDatos(int maximoDatos) {
        this.maximoDatos = maximoDatos;
    }

    public int getContadorDatos() {
        return contadorDatos;
    }

    public void setContadorDatos(int contadorDatos) {
        this.contadorDatos = contadorDatos;
    }
 */
    public String getNombreJugadorTitular() {
        return nombreJugadorTitula;
    }

    public void setNombreJugadorTitular(String nombreJugadorTitular) {
        this.nombreJugadorTitula = nombreJugadorTitular;
    }

    public String getPosicionJugadorTitular() {
        return posicionJugadorTitula;
    }

    public void setPosicionJugadorTitula(String posicionJugadorTitular) {
        this.posicionJugadorTitula = posicionJugadorTitular;
    }

    public String getNombreJugadorSuplente() {
        return nombreJugadorSuplent;
    }

    public void setNombreJugadorSuplente(String nombreJugadorSuplente) {
        this.nombreJugadorSuplent = nombreJugadorSuplente;
    }

    public String getPosicionJugadorSuplente() {
        return posicionJugadorSuplent;
    }

    public void setPosicionJugadorSuplente(String posicionJugadorSuplente) {
        this.posicionJugadorSuplent = posicionJugadorSuplente;
    }


/**
    public void agregarEquipo(Padre r2) {


        this.datosEquipos[contadorDatos++] = r2;

    }
*/
    public void AgregarJugadorTitular(List<HijoUno> JugadorTitular){

            ListadoJugadoresTitular.addAll(JugadorTitular);



    }

public void MostrarJugadoresTitulares(){


    for (int i = 0; i <ListadoJugadoresTitular.size() ; i++) {
        System.out.println(ListadoJugadoresTitular.get(i));
    }
}

    public void hastaLaVistaBaby() {

        System.out.println("Hasta la Vista Baby :v");
    }
/**
    public void Mostrarequipos() {

        for (int i = 0; i <contadorDatos ; i++) {
            System.out.println(datosEquipos[i]);
        }
    }
 */
}
