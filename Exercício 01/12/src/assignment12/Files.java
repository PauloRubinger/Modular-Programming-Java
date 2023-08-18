package assignment12;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;

public class Files {

    private BufferedReader bufferedReader;

    public Files(String filePath) {
        try {
            FileReader fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public String readStringFile() {
        
        String line = null;

        try {
            line = bufferedReader.readLine();
        } catch (EOFException exception) { // Exceção de final de arquivo.
            line = null;
        } catch (IOException exception) {
            System.out.println("Erro de leitura: " + exception);
            line = null;
        } return line;

    }

    public void closeFile() {
        try {
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
