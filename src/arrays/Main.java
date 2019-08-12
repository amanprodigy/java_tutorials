package arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArray = new int[10];

        for(int j=0; j<myArray.length; j++){
            myArray[j] = (int) Math.pow(j, 2);
            System.out.println(myArray[j]);
        }

        double[] doubleArray = new double[10];
        doubleArray[3] = 4.5;
        for(int k=0; k<doubleArray.length; k++){
            myArray[k] = (int) Math.pow(k, 2);
            System.out.println(doubleArray[k]);
        }

        int[] myIntArray = new int[5];

        printArray(myArray);
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println("Element " + i + " value is: " + arr[i]);
        }
    }
}
