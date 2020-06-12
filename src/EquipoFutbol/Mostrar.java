package EquipoFutbol;

import Logica.HijoUno;

import java.io.*;
import java.util.*;


public class Mostrar {

    public static void main(String[] args) {

         List<HijoUno> ListadoJugadoresTitular = new ArrayList<>();
         List<HijoUno> ListadoJugadoresTitularAux = new ArrayList<>();
        HijoUno t1 = new  HijoUno();
        int cantidadEquipos;
        int opcion = 0;
        Scanner reader = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bInput = new BufferedReader(input);
        String nomEquipo;


        while (opcion !=4) {
            System.out.println( "1.Agregar Equipos de Futbol" +
                    "\n2.Reporte Basico" +
                    "\n3.Reporte Detallado" +
                    "\n4.Salir");
            opcion = reader.nextInt();

            switch (opcion){


                case 1:



                    System.out.println("¿Cuantos equipos de futbol quiere almacenar?");
                     cantidadEquipos = reader.nextInt();

try {
    for (int j = 0; j < cantidadEquipos; j++) {


        HijoUno r1 = new  HijoUno();

        System.out.println("Indique el nombre del equipo");
        nomEquipo = bInput.readLine();

        int canTitulos = getRespuesta(reader, "¿Cuantos Titulos(campeonatos) ha ganado el equipo?");

        System.out.println("Indique el nombre del Estadio");
        String nomEstadio = bInput.readLine();

        r1.setNombreEquipo(nomEquipo);
        r1.setNombreEstadio(nomEstadio);
        r1.setCantidadTitulos(canTitulos);

        ListadoJugadoresTitularAux.add(r1);
        int respuesta = getRespuesta(reader, "¿Desea Agregar Jugadores al " + nomEquipo + "?"+
                "\n1. Si " +
                "\n2. No");

        if(respuesta == 1) {
            int cantidadJugadoresTitulares = getRespuesta(reader, "Indique la cantidad de jugadores titulares");
            for (int i = 0; i < cantidadJugadoresTitulares; i++) {
               HijoUno r3 = new HijoUno();

                System.out.println("Indique nombre");
                String nombreTitula = bInput.readLine();
                System.out.println("Indique Posición");
                String posicionTitula = bInput.readLine();


                r3.setNombreJugadorTitular(nombreTitula);
                r3.setPosicionJugadorTitula(posicionTitula);

                t1.AgregarJugadorTitular(r3);


            }

        }


        ListadoJugadoresTitular.addAll(ListadoJugadoresTitularAux);

    }
} catch (IOException e) {
    e.printStackTrace();
}

break;
                case 2:


                    System.out.println("Mostrar Almacenado");
             t1.getListadoJugadoresTitular();

                    break;
                case 3:

                    System.out.println("Mostrar Jugadores Titulares");
                    t1.MostrarJugadoresTitulares();
                    for(int i = 0; i< ListadoJugadoresTitular.size(); i++)
                        System.out.println(ListadoJugadoresTitular.get(i));
                    break;

                case 4:
                    t1.hastaLaVistaBaby();
                    break;
                default:
                    System.out.println("Nel opción incorrecta we");

            }

        }


    }

    private static int getRespuesta(Scanner reader, String s) {
        System.out.println(s);
        return reader.nextInt();
    }
}
