
class main {
  public static void main(String[] args) {

    Medico Mymedico = new Medico("Carlos Grisales", "Cardiologo");
    System.out.print("\nEl nombre del medico es: " + Mymedico.nameMedico);
    System.out.print("\nLa especialidad es: " + Mymedico.speciality);

    Patient patient = new Patient("Dayanna", "Dayanna@mail.com");
    patient.setWeight(54.6);
    System.out.println(patient.getWeight());

    // uimenu.showMenu();

  }

}