package assignment03;

import java.util.Scanner;

public class Rectangle {
    
    private int width;
    private int height;

    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public void biuldRectangle() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de 'X' da largura do retângulo: ");
        width = sc.nextInt();

        System.out.println("Digite o número de 'X' para a altura do triângulo: ");
        height = sc.nextInt();

        sc.close();
    }

    public void printRectangle() {
        
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print("X");
                } else {
                    if (j == 0 || j == width - 1) {
                        System.out.print("X");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
