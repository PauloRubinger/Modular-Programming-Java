package assignment09;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite uma data no formato DD/MM/YYYY para o ano de 2024:");
            String dateInput = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("pt-BR"));
            LocalDate formatedDate = LocalDate.parse(dateInput, formatter);

            String dayOfTheWeek = DayOfTheWeek2024.calculateDayOfTheWeek2024(formatedDate);
            String translatedDayOfTheWeekToPortuguese = DayOfTheWeek2024.traslateDayOfTheWeekToPortuguese(dayOfTheWeek);
            System.out.println("A data " + dateInput + " em 2024 será em um(a) " + translatedDayOfTheWeekToPortuguese + ".");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
