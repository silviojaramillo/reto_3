package reto;
import java.lang.Math;

public class RetoTres {
    float a;
    float b;
    float c;
    public void evaluarCoeficientes(){
        var evaluar = Math.pow(b, 2) - 4*a*c;
        if (evaluar < 0) {
            System.out.println("El polinomio" +
                    " no tiene solución en los" +
                    " números reales.");
        } else if (a == 0 && b != 0) {
            var cortex = -c/b;
            System.out.println("El polinomio" +
                    " ingresado no es de grado" +
                    " 2,\n es de grado 1 y corta" +
                    " en x = " + cortex + "" +
                    " en y  = " + c);
        }else if(a == 0 && b == 0){
            System.out.println("El polinomio" +
                    " ingresado es una recta" +
                    " y = " + c);
        }else if(a != 0 && evaluar >0){
            double resultado1 =
                    (-b + Math.sqrt(evaluar))/(2*a);
            double resultado2 =
                    (-b - Math.sqrt(evaluar))/(2*a);
            System.out.println("El valor de " +
                    "x1 = " + resultado1 +
                    " y el valor de x2 = " + resultado2);
        }else if(a != 0 && evaluar == 0 && b == 0){
            double resultado2 =
                    (b - Math.sqrt(evaluar))/(2*a);
            System.out.println("El valor de x = " + resultado2);
        }else if(a != 0 && evaluar == 0){
            double resultado2 = (-b - Math.sqrt(evaluar))/(2*a);
            System.out.println("El valor de x = " + resultado2);
        }else{
            System.out.println("El polinomio" +
                    " ingresado es una recta y = " + c);
        }
    }

}
