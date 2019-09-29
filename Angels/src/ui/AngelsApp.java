package ui;

import java.util.Scanner;
import model.*;

class AngelsApp {

    static final String OPTSMENU = "Ingrese la opcion que desee realizar:\n\n   1. Ingresar arcangeles \n   2. Numero de arcangeles registrados\n   3. Desplegar la informacion del arcangel dado su nombre\n   4. Desplegar la informacion del arcangel dado su poder\n   5. Desplegar las celebraciones a realizar dado un mes\n   6. Desplegar todas las celebraciones\n\n   7. Salir.\n ";
    static final String AT = "AngelsApp 1.0";
    private static Scanner r;
    private MaxSupLegion mLegion;

    AngelsApp() {
        r = new Scanner(System.in);
        mLegion = new MaxSupLegion();
    }

    public static void main(String[] args) {
        AngelsApp aa = new AngelsApp();
        System.out.println(
                AT + "\nBIENVENIDO(A) A ANGELSAPP, TU CONEXION ANGELICAL\n\n");
        int opt;

        do {
            System.out.println(OPTSMENU);
            opt = r.nextInt();
            switch (opt) {

            case 1:
                aa.mLegion.addAngels();
                break;

            case 2:
                aa.mLegion.countArchangels();
                break;

            case 3:
                aa.mLegion.showAngelByName();
                break;

            case 4:
                aa.mLegion.showAngelByPower();
                break;

            case 5:
                aa.mLegion.showAllByMonth();
                break;

            case 6:
                aa.mLegion.superFinalString();
                break;
            }

            System.out.println("\nElija la opcion que desee:\n1. Volver al menu de opciones.\n2. Cerrar AngelsApp.\n");
            opt = r.nextInt();

        } while (opt == 1);

        System.out.println("\nDeveloped by Camilo Cordoba\n\nPowered by my love for the code :3");
     r.close();   
    }
}