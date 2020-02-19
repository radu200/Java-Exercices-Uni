import java.util.Scanner;
public class Powers {
    public static void main(String[] args) {
        printPowers(2);
        printPowers(-1);
        printPowers(10);
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printPowers(n);
    }
    
    public static void printPowers(int n) {
        System.out.println("Powers of " + n);
         final int P = 15;
         long result = 1;
        
         for(int i = 1; i <= P; i++ ){
             result *= n;
             System.out.println(result);
         }
  
    }    
}