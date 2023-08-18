package assignment07;

import java.util.Scanner;

public class Mult11 {
    
    private short numberToBeMultipliedBy11;
    private Scanner sc;

    public Mult11() {
        
    }

    public short getNumberToBeMultipliedBy11() {
        return numberToBeMultipliedBy11;
    }

    public void setNumberToBeMultipliedBy11(short numberToBeMultipliedBy11) {
        this.numberToBeMultipliedBy11 = numberToBeMultipliedBy11;
    }

    public short multiply2DigitsNumberBy11() {
        sc = new Scanner(System.in);
        System.out.println("Digite o número inteiro de 2 dígitos que deseja multiplicar por 11: ");
        setNumberToBeMultipliedBy11(sc.nextShort());

        String shortToString = Integer.toString(getNumberToBeMultipliedBy11());
        char[] arrayOfString = shortToString.toCharArray();
        // Spliting the digits and then converting to short subtracting the value of 0 in the Unicode table 
        short firstDigit = (short) (arrayOfString[0] - '0');
        short secondDigit = (short) (arrayOfString[1] - '0');
        short sumOf2Digits = (short) (firstDigit + secondDigit);
        
        String resultString = "";
        short result = 0;

        if (sumOf2Digits <= 9) {
            resultString = String.valueOf(firstDigit) + sumOf2Digits + String.valueOf(secondDigit);
            result = (short) (Integer.parseInt(resultString));
        } else {
            firstDigit = (short) (arrayOfString[0] - '0' + 1);
            // Converting the sum of the 2 digits of the number to an array of char and then keeping only the second digit of the sum
            char[] setOfTen = String.valueOf(sumOf2Digits).toCharArray();

            resultString = String.valueOf(firstDigit) + String.valueOf(setOfTen[1]) + String.valueOf(secondDigit);
            result = (short) (Integer.parseInt(resultString));
        }
        
        return result;
    }

    public void closeScanner() {
        sc.close();
    }
}
