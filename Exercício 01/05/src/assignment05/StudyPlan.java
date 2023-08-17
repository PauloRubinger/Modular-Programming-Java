package assignment05;

import java.util.Scanner;

public class StudyPlan {
    
    private int subjects;
    private int hours;
    private int minutes;
    private Scanner sc;

    public StudyPlan() {
        subjects = 0;
        hours = 0;
        minutes = 0;
    }

    public int getSubjects() {
        return subjects;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void buildStudyPlan() {
        sc = new Scanner(System.in);
        
        float hoursPerDay = 0;
        float hoursPerSubject = 0;
        int integerPartOfHour = 0;
        float fractionalPartOfHour = 0;
        float breakTime = 0;

        System.out.println("Digite o número de disciplinas que está cursando: ");
        setSubjects(sc.nextInt());
        System.out.println("Digite o número de horas disponíveis para estudar esta semana (deve ser um número inteiro): ");
        setHours(sc.nextInt());
        System.out.println("Digite o número de minutos disponíveis para estudar esta semana (deve ser um número inteiro): ");
        setMinutes(sc.nextInt());

        // Total hours of study per day based on the hours and minutes entered by the user
        hoursPerDay = (float)(getHours() + ((float)getMinutes()/60))/7;
        // Total hours per subject
        hoursPerSubject = (float)hoursPerDay/subjects;
        // Integer part of the hours
        integerPartOfHour = (int)hoursPerSubject;
        // Fractional part of the hours
        fractionalPartOfHour = hoursPerSubject - integerPartOfHour;
        // Converting the fractional part of the hour to minutes and attributing this time to the breaks between the subjects
        breakTime = fractionalPartOfHour*60/subjects; 
        
        if (integerPartOfHour < 1) {
            System.out.println("Você deve reservar " + (int)(fractionalPartOfHour*60) + " minutos por dia para cada disciplina");
        } else {
            System.out.println("Você deve reservar " + integerPartOfHour + " hora(s) por dia para cada disciplina, com intervalos de " + (int)breakTime + " minuto(s).");
        }
    }

    public void closeScanner() {
        sc.close();
    }
}
