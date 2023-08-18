package assignment12;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = "files/test.txt";
        Files files = new Files(filePath);
        Phrase phrase = new Phrase();

        String strLine = files.readStringFile();

        while (!strLine.equals("fim")) {
            phrase.setPhrase(strLine);
            String reversedPhrase =  phrase.reversePhrase();
            System.out.println("Frase original: " + strLine);
            System.out.println("Frase invertida: " + reversedPhrase);
            strLine = files.readStringFile();
        }

        files.closeFile();
    }
}
