import java.util.Scanner;
import java.util.Arrays;

public class ArrayExercises
{
    public static void main(String[] args) 
    {
        final int SIZE = 5;
        int[] array = new int[SIZE];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print("Please enter whole number " + (i + 1) + ": ");
            int input = scanner.nextInt(); // get input from the user
            array[i] = input; // store the value in the array
        }    
        printArray("Input array:", array);
        // call method sum and print out the result
        int sum = sum(array);
        System.out.println("The sum of elements is " + sum);
        // call method repeat and print out the result
        int[] trebled = repeat(array);
        System.out.println("The repeated array is " + trebled);
        // INSERT THE CODE FOR PRINTING HERE
    }    
    public static void printArray(String msg, int[] array)
    {
        System.out.println(msg + " " + Arrays.toString(array));
    }
    public static int sum(int[] array) 
    {
        int s = 0;
        for (int i = 0; i < array.length; i++)
            s += array[i];
        return s;    
    }    
    public static int[] repeat(int[] array) 
    {
        final int size = array.length;
      
       int[] newArray = new int[size];
       
        // for(int i = 0; i <= 3; i++){
        //     newArray[i] = 3;
        // }
        // // System.out.print(newArray);
        // // return newArray;
        // return newArray;
        // INSERT YOU CODE HERE
        
    }    
}