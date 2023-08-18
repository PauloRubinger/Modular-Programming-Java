package assignment10;

public class App {
    public static void main(String[] args) throws Exception {
        String filePath = "text/test.txt";
        String strLine;
        Files files = new Files(filePath);

        strLine = files.readStringFile();

        while (strLine != null) {
            String[] separatedValues = strLine.split(";");
            Arrays arrays = new Arrays(separatedValues.length);
            int[] intArray = arrays.arrayStringToInt(separatedValues);
            arrays.printArray(intArray);
            int[] arrayAux = arrays.sumPairs(intArray);
            arrays.printArrayAux(arrayAux);
            strLine = files.readStringFile();
        }
        files.closeFile();
    }
}
