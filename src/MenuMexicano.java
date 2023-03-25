import java.util.Scanner;

public class MenuMexicano {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("------ MENU MEXICANO ------");
      System.out.println("1. Tacos");
      System.out.println("2. Quesadillas");
      System.out.println("3. Pozole");
      System.out.println("4. Tamales");
      System.out.println("5. Salir");
      System.out.print("Elige una opción: ");
      opcion = input.nextInt();
      
      switch (opcion) {
        case 1:
          System.out.println("Has elegido Tacos. ¡Buen provecho!");
          System.out.println("");
          break;
        case 2:
          System.out.println("Has elegido Quesadillas. ¡Buen provecho!");
          System.out.println("");
          break;
        case 3:
          System.out.println("Has elegido Pozole. ¡Buen provecho!");
          System.out.println("");
          break;
        case 4:
          System.out.println("Has elegido Tamales. ¡Buen provecho!");
          System.out.println("");
          break;
        case 5:
          System.out.println("¡Hasta pronto!");
          System.out.println("");
          break;
        default:
          System.out.println("Opción inválida. Inténtalo de nuevo.");
          System.out.println("");
          break;
      }
    } while (opcion != 5);
    input.close();
  }
}