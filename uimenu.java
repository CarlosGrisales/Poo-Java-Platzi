import java.util.Scanner;

public class uimenu {

    static void showMenu() {
        System.out.print("Bienvenido al menu ");
        System.out.print("Seleccionona la opcion deseada ");

        int response = 10;
        do {
            System.out.print("1. Doctor ");
            System.out.print("2. Paciente ");
            System.out.print("0. salir ");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.print("Doctor ");
                    break;

                case 2:
                    System.out.print("Paciente ");
                    break;

                case 0:
                    System.out.print("saliste del sistema ");
                    break;

                default:
                    System.out.print("Debes seleccionar una opcion correcta ");
            }
        } while (response != 0);

       
    }

    static void showPatienMenu() {
        int response = 0;

        System.out.print("Menu Del paciente");
        System.out.print("Seleccione una Opcion");

        do {
            System.out.print("1. Historial medico");
            System.out.print("2. Cita Medica");
            System.out.print("0. salir del sistema");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.print("Historia Medica");
                    break;
                case 2:
                    System.out.print("Cita Medica");
                    break;
                case 0:
                    System.out.print("Saliste del sistema");
                    break;
                default:
                    System.out.print("Debes seleccionar una opcion correcta");

            }
        } while (response != 0);

    }

}
