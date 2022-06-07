package reto;

/* ENUNCIADO
* Solicitar al usuario el ingreso de los coeficientes de
* un polinomio de grado dos. Teniendo en cuenta la condición de
* existencia de las raíces,determinar su existencia.
* Nota: evitar las divisiones por cero; en caso de ser un
* polinomio de grado menor que dos mostrar sus puntos de corte
* con los ejes.
* */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RetoTres valor = new RetoTres();
        System.out.println("Ingrese ser el valor de a");
        valor.a = sc.nextFloat();
        System.out.println("Ingrese ser el valor de b");
        valor.b = sc.nextFloat();
        System.out.println("Ingrese ser el valor de c");
        valor.c = sc.nextFloat();
        valor.evaluarCoeficientes();

    }
}
