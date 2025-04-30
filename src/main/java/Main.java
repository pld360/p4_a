/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/

import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Scanner scanner = new Scanner(System.in);
      Service s = new Service();

      while (true) {
        System.out.println("1. Dodaj studenta");
        System.out.println("2. Wyświetl wszystkich studentów");
        System.out.println("3. Wyjście");
        System.out.print("Wybierz opcję: ");

        int wybor = scanner.nextInt();
        scanner.nextLine();

        switch (wybor) {
          case 1:
            System.out.print("Podaj imię studenta: ");
            String imie = scanner.nextLine();

            System.out.print("Podaj nazwisko studenta: ");
            String nazwisko = scanner.nextLine();

            System.out.print("Podaj wiek studenta: ");
            int wiek = scanner.nextInt();

            System.out.print("Podaj rok urodzenia studenta: ");
            String rokUro = scanner.next();
            if (Integer.parseInt(rokUro) < 1 || Integer.parseInt(rokUro) > 3000) {
              System.out.println("Nieprawidłowy rok urodzenia. Podaj rok ponownie.");
              rokUro = scanner.nextLine();
            }

            System.out.print("Podaj miesiąc urodzenia studenta: ");
            String miesUro = scanner.next();
            if (Integer.parseInt(miesUro) < 1 || Integer.parseInt(miesUro) > 12) {
              System.out.println("Nieprawidłowy miesiąc urodzenia. Podaj miesiąc ponownie.");
              miesUro = scanner.nextLine();
            }

            System.out.print("Podaj dzień urodzenia studenta: ");
            String dzienUro = scanner.next();
            if (Integer.parseInt(dzienUro) < 1 || Integer.parseInt(dzienUro) > 31) {
              System.out.println("Nieprawidłowy dzień urodzenia. Podaj dzień ponownie.");
              dzienUro = scanner.nextLine();
            }
            scanner.nextLine();
            
            s.addStudent(new Student(imie, nazwisko, wiek, rokUro, miesUro, dzienUro));
            System.out.println("Student dodany.");
            break;

          case 2:
            var students = s.getStudents();
            if (students.isEmpty()) {
              System.out.println("Brak studentów.");
            } else {
              System.out.println("\nLista studentów:");
              for (Student current : students) {
                System.out.println(current.ToString());
              }
            }
            break;

          case 3:
            System.out.println("Koniec programu.");
            break;

          default:
            System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            break;
        }

        if (wybor == 3) {
          break;
        }
      }

      scanner.close();
    } catch (IOException e) {

    }
  }
}