package assignment06;

import java.util.Scanner;

public class Sweepstake {

    private String luckyNumber;
    private Scanner sc;
    
    public Sweepstake() {
        this.luckyNumber = null;
    }

    public String getLuckyNumber() {
        return luckyNumber;
    }

    public void setLuckyNumber(String luckyNumber) {
        this.luckyNumber = luckyNumber;
    }

    public void winningNumber() {
        sc = new Scanner(System.in);

        String firstLotteryNumber;
        String secondLotteryNumber;

        System.out.println("Digite o primeiro prêmio da loterial federal: ");
        firstLotteryNumber = sc.next();
        // Pulling out the dot "."
        String cleanedFirstNumber = firstLotteryNumber.replace(".", "");
        // Converting the string into an array of char
        char[] arrayOfFirstLotteryNumber = cleanedFirstNumber.toCharArray();

        System.out.println("Digite o segundo prêmio da loteria federal: ");
        secondLotteryNumber = sc.next();
        // Pulling out the dot "."
        String cleanedSecondNumber = secondLotteryNumber.replace(".", "");
        // Converting the string into an array of char
        char[] arrayOfSecondLotteryNumber = cleanedSecondNumber.toCharArray();
        // Concatenating array of char into a string
        String concatenatedString = String.valueOf(arrayOfSecondLotteryNumber[0]) + String.valueOf(arrayOfSecondLotteryNumber[1]) + String.valueOf(arrayOfSecondLotteryNumber[2]) + "." +
        String.valueOf(arrayOfFirstLotteryNumber[2]) + String.valueOf(arrayOfFirstLotteryNumber[3]) + String.valueOf(arrayOfFirstLotteryNumber[4]);

        setLuckyNumber(concatenatedString);
        System.out.println("O número vencedor é: " + getLuckyNumber());
    }

    public void closeScanner() {
        sc.close();
    }
}
