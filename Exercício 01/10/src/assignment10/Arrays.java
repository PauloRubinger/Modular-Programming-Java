package assignment10;

import java.util.Scanner;

public class Arrays {

    private int arr[];
    private int size;

    public Arrays(int size) {
        arr = new int[size];
        this.size = size;
    }

    public void scanArray() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os " + size + " números inteiros que irão compor o vetor");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    public int[] arrayStringToInt(String[] stringArray) {

        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }
        return intArray;
    }

    public int[] sumPairs(int[] arr) {

        if (size % 2 == 0) {
            int arrayAux[] = new int[size/2];
            int j = 0;

            for (int i = 0; i < size/2; i++) {
                arrayAux[i] = arr[j] + arr[j + 1];
                j += 2;
            }

        return arrayAux;

        } else {
            int arrayAux[] = new int[(size/2) + 1];
            int j = 0;

            for (int i = 0; i < size/2; i++) {
                arrayAux[i] = arr[j] + arr[j + 1];
                j += 2;
            }

            arrayAux[size/2] = arr[size - 1]*2;

            return arrayAux;
        }

    }

    public void printArray(int[] arr) {
        System.out.print("O vetor original, é: [ ");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");
        
    }

    public void printArrayAux(int[] arrayAux) {
        
        System.out.print("O segundo vetor, composto pela soma de cada par dos elementos vizinhos do vetor original, é: [ ");
        
        for (int i = 0; i < arrayAux.length; i++) {
            System.out.print(arrayAux[i] + " ");
        }

        System.out.println("]");
        
    }

}