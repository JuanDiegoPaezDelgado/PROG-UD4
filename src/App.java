import java.util.Scanner;

import net.salesianos.publications.Magazine;
import net.salesianos.publications.Novel;
import net.salesianos.publications.Textbook;
import net.salesianos.utilities.manager.Manager;
import net.salesianos.utilities.menu.Menu;

public class App {

    public static void main(String[] args) {
        boolean seguir = true;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("***************************************************\n" +
                    "Seleccione una opcion : \n");
            System.out.println(Menu.menu() + "\n*******************************************");

            String opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "a":
                    Magazine magazine = Manager.addMagazine(sc);
                    System.out.println(magazine.toString());

                    break;
                case "b":
                    Textbook book = Manager.addTextbook(sc);
                    System.out.println(book.toString());

                    break;
                case "c":
                    Novel novel = Manager.addNovels(sc);
                    System.out.println(novel.toString());

                    break;
                case "d":
                    Manager.printPublications();
                    break;
                case "e":
                    Manager.taxCalculator(sc);
                    break;
                case "f":
                    seguir = false;
                    break;
                default:
                    System.out.println("Introduzca una opción correcta por favor.");
                    break;
            }

        } while (seguir);

        sc.close();
    }
}