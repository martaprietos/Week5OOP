package ie.atu.week5;
import  java.util.Scanner;
import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);
        arrayList.add(400);
        arrayList.add(500);
        arrayList.add(600);
        arrayList.add(700);
        arrayList.add(800);
        arrayList.add(900);
        arrayList.add(1000);

        for(Integer i : arrayList){
            System.out.println("Element " + x + " is " + i);
            x++;
        }

        try {
            System.out.println("Enter a number: ");
            arrayList.add(sc.nextInt());
        }
        catch (Exception e){
            System.out.println("Something went wrong.");
        }
        x = 0; //reset x
        for(Integer i : arrayList){
            System.out.println("Element " + x + " is " + i);
            x++;
        }
    }
}
