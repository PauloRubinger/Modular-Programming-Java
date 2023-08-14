package assignment04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Phrase phrase = new Phrase();
        String str = phrase.scanPhrase(sc);

        while (!str.equals("fim")) {
            String reversedPhrase = phrase.reversePhrase();
            System.out.println("\nA frase invertida é: ");
            phrase.printPhrase(reversedPhrase);
            str = phrase.scanPhrase(sc);
        }

        sc.close();
    }
}
