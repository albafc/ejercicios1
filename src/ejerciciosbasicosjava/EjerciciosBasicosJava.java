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
    
      public int multa(int velocidad, boolean birthday) {
        if (birthday) { //si es mi cumple el guardia me quita 5 de velocidad
            velocidad -= 5;
        }
        if (velocidad <= 60) {
            return 0;
        }
        if (velocidad > 60 && velocidad <= 80) {
            return 1;
        }
        return 2; //el resto de casos, que voy a mas de 80
    }
      public boolean multiplosOnce(int numero){
          if (numero % 11 == 0 || (numero-1) % 11 == 0){
              return true;
          }
          return false;
      }

      public boolean contesta(boolean matinal, boolean madre, boolean dormido){
          if (dormido){
              return false;
          }
          else if (matinal && !madre){
              return false;
          }
          else{
          return true;
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
        ejercicios.multa(30,false);
        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(90, false));
        ejercicios.multiplosOnce(100);
        System.out.println(ejercicios.multiplosOnce(100));
        System.out.println(ejercicios.contesta(true, true, true));
        
    }

}
