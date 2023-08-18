package assignment08;

public class App {
    public static void main(String[] args) throws Exception {
        DateVerifier dateVerifier = new DateVerifier();
        dateVerifier.scanDate();
        boolean verificationResult = dateVerifier.verifyDate();
        dateVerifier.closeScanner();

        if (verificationResult) {
            System.out.println("A data informada é válida!");
        }
    }
}
