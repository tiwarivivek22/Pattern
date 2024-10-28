//Hollow Triangles
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        System.out.println("Enter the value ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                if ((i == j)||i==size||j==0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    }
