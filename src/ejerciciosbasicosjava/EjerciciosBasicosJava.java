package ejerciciosbasicosjava;

/**
 *
 * @author xp
 */
public class EjerciciosBasicosJava {

    public boolean fiestaArdillas(int numeroBellotas, boolean finDeSemana) {
        if (finDeSemana == true) {
            return true;
        } else if (numeroBellotas >= 40 && numeroBellotas <= 60) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosBasicosJava ejercicios = new EjerciciosBasicosJava();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, true));
        System.out.println(ejercicios.fiestaArdillas(70, true));
    }

}
