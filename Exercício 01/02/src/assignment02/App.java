package assignment02;

public class App {
    public static void main(String[] args) throws Exception {
        Arrays arr = new Arrays(5);
        arr.scanArray();
        int[] arrayAux = arr.sumPairs();
        arr.printArray(arrayAux);
    }
}
