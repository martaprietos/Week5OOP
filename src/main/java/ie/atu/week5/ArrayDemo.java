package ie.atu.week5;

public class ArrayDemo {
    public static void main(String[] args) {
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

        for(int i = 0;i<10;i++){
            myArray[i] = 100 + (i*100);
            System.out.println(myArray[i]);
        }

    }
}
