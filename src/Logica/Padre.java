package Logica;

public class Padre {


    protected String nombreEquipo;
    protected String nombreEstadio;
    protected int cantidadTitulos;


    public Padre() {
        this.nombreEquipo = nombreEquipo;
        this.nombreEstadio = nombreEstadio;
        this.cantidadTitulos = cantidadTitulos;
    }


    @Override
    public String toString() {
        return "{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", nombreEstadio='" + nombreEstadio + '\'' +
                ", cantidadTitulos=" + cantidadTitulos +
                '}';
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getNombreEstadio() {
        return nombreEstadio;
    }
    public int getCantidadTitulos() {
        return cantidadTitulos;
    }

    public void setCantidadTitulos(int cantidadTitulos) {
        this.cantidadTitulos = cantidadTitulos;
    }



}
