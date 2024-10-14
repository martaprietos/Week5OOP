package ie.atu.week5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int i = 0, number = 0;
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;
        myArray[7] = 800;
        myArray[8] = 900;
        myArray[9] = 1000;

        for(i = 0;i<10;i++){
            myArray[i] = 100 + (i*100);
            System.out.println(myArray[i]);
        }

        try {
            System.out.println("Enter a number: ");
            sc.nextInt(myArray[10]);
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }

    }
}
