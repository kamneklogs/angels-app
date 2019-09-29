package model;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSupLegion {

    private final String[] MONTHS = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
            "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    private final String[] SIZECANDLE = { "Pequnio", "Mediano", "Grande" };

    private Scanner r;

    private ArrayList<Angel> angels;

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

    public void addAngels() {
        String name, type, photo, prayer, cMonth, cDay, power, color, essence, size;
        double lighting;
        boolean aux = false;
        int opt;

        do {
            do {
                System.out.println(
                        "Nombre (Recuerde que el nombre de los Arcangeles empieza por mayuscula y termina en 'el'.):\n");
                name = r.nextLine();
                if (name.charAt(name.length() - 1) == 'l' && name.charAt(name.length() - 2) == 'e') {
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

    public void countArchangels() {
        System.out.println("\n   Hay " + angels.size() + " Arcangeles registrados\n ");
    }

    public int searchByName(String name) {
        int index = -1;
        for (int i = 0; i < angels.size(); i++) {
            if (angels.get(i).getName().equals(name) == true) {
                index = i;
            }
        }
        return index;
    }

    public void showAngelByName() {
        System.out.println("Nombre (No olvide que la primera letra va en mayuscula): \n");
        String name = r.next();
        if (searchByName(name) == -1) {
            System.err.println("\nANGEL NO ENCONTRADO\n");
        } else {
            System.out.println(angels.get(searchByName(name)).toString());
        }

    }

    public int searchByPower(String power) {
        int index = -1;
        for (int i = 0; i < angels.size(); i++) {
            if (angels.get(i).getPower().equals(power) == true) {
                index = i;
            }
        }
        return index;
    }

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

    public int[] searchAllByMonth(String cMonth) {
        ArrayList<Integer> index = new ArrayList<Integer>();

        for (int i = 0; i < angels.size(); i++) {
            if (angels.get(i).getcMonth().equals(cMonth) == true) {
                index.add(i);
            }
        }
        int[] in = new int[index.size()];
        for (int j = 0; j < in.length; j++) {
            in[j] = Integer.parseInt(String.valueOf(index.get(j)));
        }
        return in;
    }

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