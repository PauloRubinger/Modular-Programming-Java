package assignment01;

import java.util.Scanner;

public class Array {

    private int arr[];
    private int arrayAux[];
    private int size;

    public Array(int size) {
        arr = new int[size];
        arrayAux = new int[size];
        this.size = size;
    }

    public void scanAndReverseArray() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os " + size + " números inteiros que irão compor o vetor");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
            arrayAux[size - (i + 1)] = arr[i];
        }

        sc.close();
    }

    public void printArray() {
        
        System.out.print("[ ");
        
        for (int i = 0; i < size; i++) {
            System.out.print(arrayAux[i] + " ");
        }

        System.out.println("]");
        
    }

}