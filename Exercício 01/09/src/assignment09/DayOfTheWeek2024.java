package assignment09;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DayOfTheWeek2024 {
    
    private String dayOfTheWeek;

    public DayOfTheWeek2024() {

    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public static String traslateDayOfTheWeekToPortuguese(String dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case "MONDAY":
                return "Segunda-feira";
            case "TUESDAY":
                return "Terça-feira";
            case "WEDNESDAY":
                return "Quarta-feira";
            case "THURSDAY":
                return "Quinta-feira";
            case "FRIDAY":
                return "Sexta-feira";
            case "SATURDAY":
                return "Sábado";
            case "SUNDAY":
                return "Domingo";
            default:
                return "";
        }
    }

    public static String calculateDayOfTheWeek2024(LocalDate data) {
        DayOfWeek diaDaSemana = data.getDayOfWeek();
        return diaDaSemana.toString();
    }
}
