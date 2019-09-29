package model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class manages the entire legion
 * 
 * @author Camilo Cordoba.
 * @since 1.0
 */
public class MaxSupLegion {

    //Constants
    private final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    private final String[] SIZECANDLE = { "Pequnio", "Mediano", "Grande" };

    //Scanner class's relation
    private Scanner r;

    //Relation's vector
    private ArrayList<Angel> angels;

    //Constructor method
    public MaxSupLegion() {
        angels = new ArrayList<Angel>();
        r = new Scanner(System.in);
    }



    public ArrayList<Angel> getAngels() {
        return angels;
    }

    public void setAngels(ArrayList<Angel> angels) {
        this.angels = angels;
    }


    /**
     * This method add new arcangel 
     * <b>pre:</b> num1 and num2 are valids parameters <br>
     * <b>post:</b> The divition was made <br>
     * @author Camilo Cordoba
     */
    public void addAngels() {

        //Params to creation of a new Angel objetc
        String name, type, photo, prayer, cMonth, cDay, power, color, essence, size;
        double lighting;

        //Auxiliar variable for the menu
        boolean aux = false;
        
        do {
            do {
                System.out.println(
                        "Nombre (Recuerde que el nombre de los Arcangeles empieza por mayuscula y termina en 'el'.):\n");
                name = r.nextLine();
                if (name.charAt(name.length() - 1) == 'l' && name.charAt(name.length() - 2) == 'e') { //Termination verification of name
                    aux = true;
                } else {
                    System.err.println("El nombre no termina en 'el'.\n   Intente nuevamente\n");
                }
            } while (aux == false);
            type = "Arcangel";
            System.out.println("Link de la foto:\n");
            photo = r.nextLine();
            System.out.println("Ingrese la oracion:\n");
            prayer = r.nextLine();
            System.out.println("Mes de celebracion:\n");

            for (int i = 0; i < MONTHS.length; i++) {
                System.out.println((i + 1) + " " + MONTHS[i]);
            }

            cMonth = MONTHS[r.nextInt() - 1];
            System.out.println("\nDia de celebracion (dd):\n");
            cDay = r.next();
            System.out.println("\nPoder (Todo en minusculas):\n");
            power = r.next();
            System.out.println("\nColor de la vela\n");
            color = r.next();
            System.out.println("\nTamanio de la vela\n");

            for (int i = 0; i < SIZECANDLE.length; i++) {
                System.out.println((i + 1) + " " + SIZECANDLE[i]);
            }
            size = SIZECANDLE[r.nextInt() - 1];
            System.out.println("\nEsencia de la vela\n");
            essence = r.next();
            System.out.println("Candela (0 a 1000)");
            lighting = r.nextDouble();
            angels.add(new Angel(name, type, photo, prayer, cMonth, cDay, power,
                    new Candle(color, essence, lighting, size)));
            System.out.println("\nARCANGEL REGISTRADO EXITOSAMENTE\n");
            System.out.println("\n   1. Agregar un nuevo arcangel.\n   2. volver al menu principal.\n");

        } while (r.nextInt() == 1);

    }

    /**
     * This method returns the number of registred archangels
     * <b>pre:</b> Nothing :3 <br>
     * <b>post:</b> The list was printed <br>
     * 
     */
    public void countArchangels() {
        System.out.println("\n   Hay " + angels.size() + " Arcangeles registrados\n ");
    }

    /**
     * This method return the potition of a archangel searched by name
     * <b>pre:</b> The param string is a valid string <br>
     * <b>post:</b> position is found. If not found return -1 <br>
     * 
     * @param name is a valid String != null
     * @return int that containing the required potition
     */
    public int searchByName(String name) {
        int index = -1;
        for (int i = 0; i < angels.size(); i++) {
            if (angels.get(i).getName().equals(name) == true) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Show angel's information by name
     * <b>pre:</b> Nothig again <br>
     * <b>post:</b> information was printed <br>
     * 
     */
    public void showAngelByName() {
        System.out.println("Nombre (No olvide que la primera letra va en mayuscula): \n");
        String name = r.next();
        if (searchByName(name) == -1) {
            System.err.println("\nANGEL NO ENCONTRADO\n");
        } else {
            System.out.println(angels.get(searchByName(name)).toString());
        }

    }

    /**
     * This method return the potition of a archangel searched by pwer
     * <b>pre:</b> The param string is a valid string <br>
     * <b>post:</b> position is found. If not found return -1 <br>
     * 
     * @param power is a valid String != null
     * @return int that containing the required potition
     */
    public int searchByPower(String power) {
        String aux = power;
        int index = -1;
        for (int i = 0; i < angels.size(); i++) {
            if (angels.get(i).getPower().equals(aux) == true) { // Search and index assignment
                index = i;
            }
        }
        return index;
    }

    /**
     * This method show infortamtion's angel by power
     * <b>pre:</b> Nothing <br>
     * <b>post:</b> Information was printed <br>
     */
    public void showAngelByPower() {
        System.out.println("\nPoder (No olvide que empieza por minuscula): \n");
        String power = "";
        power += r.next();
        if (searchByName(power) == -1) {
            System.err.println("\nANGEL NO ENCONTRADO\n");
        } else {
            System.out.println(angels.get(searchByName(power)).toString());
        }
    }

    /**
     * This method search angels by month
     * <b>pre:</b> The param string is a valid string <br>
     * <b>post:</b> positions are found.  <br>
     * 
     * @param cMonth is a valid String != null, is the name of de month dah
     * @return array that containing all angels by month
     */
    public int[] searchAllByMonth(String cMonth) {

        ArrayList<Integer> index = new ArrayList<Integer>();

        for (int i = 0; i < angels.size(); i++) {
            if (angels.get(i).getcMonth().equals(cMonth) == true) {
                index.add(i);
            }
        }
        int[] in = new int[index.size()];
        for (int j = 0; j < in.length; j++) {
            in[j] = Integer.parseInt(String.valueOf(index.get(j))); // this is magic
        }
        return in;
    }

    /**
     * This method is the ultimate wonder of the modern engennering
     * <b>pre:</b> Nothing <br>
     * <b>post:</b> Information was printed <br>
     * 
     */
    public void showAllByMonth() {
        String cMonth;
        System.out.println("Mes de celebracion:\n");
        for (int i = 0; i < MONTHS.length; i++) {
            System.out.println((i + 1) + " " + MONTHS[i]);
        }
        cMonth = MONTHS[r.nextInt() - 1];
        cMonth.toUpperCase();
        String allByMonth = cMonth + ":\n\n";
        int[] index = searchAllByMonth(cMonth);
        for (int i = 0; i < index.length; i++) {
            allByMonth += angels.get(index[i]).byMonth();
        }
        if (allByMonth.equals(cMonth + ": \n\n") == true) {
            System.err.println("\nNO HAY REGISTROS PARA ESTE MES\n");
        } else {
            System.out.println(allByMonth);
        }
    }

    /**
     * This method print absolutly all
     * <b>pre:</b> Noting of nothing my friend <br>
     * <b>post:</b> Information was printed <br>
     */
    public void superFinalString() {
        String superString = "\nTodos los registros: \n";
        for (int i = 0; i < angels.size(); i++) {
            superString += angels.get(i).toFinalString();
        }
        if (superString.equals("Todos los registros: \n") == true) {
            System.err.println("\nNO HAY REGISTROS EN ESTE MOMENTO\n");
        } else {
            System.out.println(superString);
        }
    }

}