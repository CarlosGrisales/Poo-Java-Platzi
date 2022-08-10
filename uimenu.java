import java.util.Scanner;

public class uimenu {

    public static String[] MONTH = {"Enero", "Febrero", "Marzo" , "Abril", "Mayo", "Junio" , "Julio", "Agosto", "Septiembre" , "Octubre", "Noviembre", "Diciembre"};

    static void showMenu() {
        System.out.print("Bienvenido al menu \n");
        System.out.print("Seleccionona la opcion desead○ \n ");

        int response = 10;
        do {
            System.out.print("MENU PRINCIPAL \n ");
            System.out.print("1. Doctor \n ");
            System.out.print("2. Paciente  \n");
            System.out.print("0. salir \n ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.print("Doctor \n");
                    break;

                case 2:
                    System.out.print("Paciente \n");
                    response = 0;
                    showPatienMenu();
                    break;

                case 0:
                    System.out.print("saliste del sistema \n");
                    break;

                default:
                    System.out.print("Debes seleccionar una opcion correcta \n");
                }
            } while (response != 0);

       
    }

    static void showPatienMenu() {
        int response = 0;

        System.out.print("Menu Del paciente\n");
        System.out.print("Seleccione una Opcion\n");

        do {
            System.out.print("MENU PACIENTE \n ");
            System.out.print("1. Mes de cita medica\n");
            System.out.print("2. Cita Medica\n");
            System.out.print("0. Retornar\n");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.print("Mes de cita Medica\n");
                    for (int i = 1; i<4; i++) 
                    System.out.print(i + ". " + MONTH [i]+ "\n ");
                    break;
                case 2:
                    System.out.print("Historial\n");
                    break;
                case 0:
                    System.out.print("\n");
                    showMenu();
                    break;
                default:
                    System.out.print("Debes seleccionar una opcion correcta\n");

            }
        } while (response != 0);

    }

}
