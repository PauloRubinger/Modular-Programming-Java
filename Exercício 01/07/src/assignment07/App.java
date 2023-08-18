package assignment07;

public class App {
    public static void main(String[] args) throws Exception {
        Mult11 mult11 = new Mult11();
        short result = mult11.multiply2DigitsNumberBy11();
        mult11.closeScanner();

        System.out.println("O resultado é: " + result);
    }
}
