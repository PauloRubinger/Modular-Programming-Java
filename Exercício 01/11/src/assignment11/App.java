package assignment11;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = "files/test.txt";
        DateVerifier dateVerifier = new DateVerifier();
        Files files = new Files(filePath);
        short qntLines = 0;

        qntLines = (short) Integer.parseInt(files.readStringFile());

        for (int i = 0; i < qntLines; i++) {
            String date = (files.readStringFile());
            System.out.println("Data informada: " + date);
            dateVerifier.setDate(date);
            boolean result = dateVerifier.verifyDate();

            if (result) {
                System.out.println("A data é válida!");
            } else {
                System.out.println("A data informada é inválida!");
            }
        }

        files.closeFile();
    }
}
