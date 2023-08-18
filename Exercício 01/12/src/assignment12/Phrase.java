package assignment12;

import java.util.Scanner;

public class Phrase {

    private String phrase;

    public Phrase() {
        phrase = "";
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String scanPhrase(Scanner scanner) {

        System.out.println("Digite a frase desejada: ");
        phrase = scanner.nextLine();  

        return phrase;
    }

    public String reversePhrase() {
        char[] charArray = getPhrase().toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }

    public void printPhrase(String string) {
        System.out.println(string);
        System.out.println();
    }
}
