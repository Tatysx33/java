import java.io.*;


public class Proyecto_TatianaRamirez {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;

        public static void main(final String[] args) throws Exception {

        String elEquipo;
        int puntajePartido=0;
        int numJuegos=0;
        int numOponentes=0;
        double puntajeDeJuegos =0;
        double puntajeNumeroDeOponentes = 0;
      //  double totalDeJuegosEjecutados = 0 ;
      //  double division =1.0/3.0 , 2.0/3.0, 1;
        System.out.println ("Bienvenido Usuario");
        System.out.println ("Digite el nombre del equipo:");
        elEquipo = in.readLine().toLowerCase();
        System.out.println ("Puntaje del equipo: ");
        puntajePartido = Integer.parseInt(in.readLine());
        System.out.println ("Numero de juegos ejecutados: ");
        numJuegos = Integer.parseInt(in.readLine());
        System.out.println ("Numero de oponentes diferentes: ");
        numOponentes = Integer.parseInt(in.readLine());

        if (numJuegos >= 5) {
            puntajeDeJuegos = 1;
        }
        else if (numJuegos <5){
           puntajeDeJuegos = (Math.sqrt(numJuegos) / 2.25);
            }

        if (numOponentes >= 3) {
              puntajeNumeroDeOponentes = (1);
            }
        else if (numOponentes == 2) {
              puntajeNumeroDeOponentes = 2.0/3.0;
          }
        else if (numOponentes == 1) {
              puntajeNumeroDeOponentes = 1.0/3.0;
          }

        out.println("El Equipo: " + elEquipo + " Obtuvo " + puntajePartido);
        out.println("Puntaje por juegos es de: " + puntajeDeJuegos);
        out.println("Puntaje por número de Oponentes es de: " + puntajeNumeroDeOponentes);
        double puntajeTotal = (puntajePartido+puntajeDeJuegos+puntajeNumeroDeOponentes);
        out.println("El total de puntos que obtuvo "+ elEquipo + " es: " + puntajeTotal);

        }
    }
