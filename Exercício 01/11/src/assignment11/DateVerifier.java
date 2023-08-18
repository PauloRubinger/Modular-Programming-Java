package assignment11;

import java.util.Scanner;

public class DateVerifier {

    private String date;
    private Scanner scanner;

    public DateVerifier() {

    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void scanDate() {
        scanner = new Scanner(System.in);
        System.out.println("Digite a data no formato DD/MM/AAAA");
        setDate(scanner.nextLine());
    }

    public boolean leapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verifyDate() {
        String dayString;
        String monthString;
        String yearString;
        String[] separatedString = getDate().split("/");

        int day;
        int month;
        int year;

        dayString = separatedString[0];
        monthString = separatedString[1];
        yearString = separatedString[2];

        day = Integer.parseInt(dayString);
        month = Integer.parseInt(monthString);
        year = Integer.parseInt(yearString);

        if (year >= 1 && year <= 9999) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day >= 1 && day <= 31) {
                    return true;
                } else {
                    System.out.println("Erro: O dia informado não existe!");
                    return false;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day >= 1 && day <= 30) {
                    return true;
                } else {
                    System.out.println("Erro: O dia informado não existe!");
                    return false;
                }
            } else if (month == 02 && leapYear(year)) {
                if (day >= 1 && day <= 29) {
                    return true;
                } else {
                    System.out.println("Erro: O dia informado não existe!");
                    return false;
                }
            } else if (month == 2 && !leapYear(year)) {
                if (day >= 1 && day <= 28) {
                    return true;
                } else {
                    System.out.println("Erro: O dia informado não existe!");
                    return false;
                }
            } else {
                System.out.println("Erro: O mês informado não existe!");
                return false;
            }
        } else {
            System.out.println("Erro: o ano informado não existe!");
            return false;
        }
    }

    public void closeScanner() {
        scanner.close();
    }
}
