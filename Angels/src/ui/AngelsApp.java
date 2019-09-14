package ui;

import javax.swing.JOptionPane;
import model.*;

class AngelsApp {

    static final String OPTSMENU = "Ingrese la opcion que desee realizar:\n\n   1. Ingresar los arcángeles \n   2. Contar los arcángeles ingresados\n   3. Desplegar la información del arcángel dado su nombre\n   4. Desplegar la información del arcángel dado su poder\n   5. Desplegar las celebraciones a realizar dado un mes\n   6. Desplegar todas las celebraciones\n ";

    private MaxSupLegion mLegion;

    AngelsApp() {

        mLegion = new MaxSupLegion();

    }

    public static void main(String[] args) {
        AngelsApp aa = new AngelsApp();
        String aaTittle = "AngelsApp 1.0";
        JOptionPane.showMessageDialog(null,
                "BIENVENIDO(A) A ANGELSAPP, TU CONEXION ANGELICAL\n\nSelecciona 'OK' para continuar\n ", aaTittle, 1);
        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, OPTSMENU, aaTittle, 3));
            switch (opt) {
            case 1:
                
                break;
            }

            System.out.println("   1. Volver al menu principal.\n   2. Cerrar AngelsApp.\n");
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "\nElija la opcion que desee:\n1. Volver al menu principal.\n2. Cerrar AngelsApp.\n", aaTittle, 2));
                   
        } while (opt == 1);

        JOptionPane.showMessageDialog(null,
                "\nDeveloped by Camilo Cordoba ", aaTittle, 1);
    }
}