import java.util.Scanner;
public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
      return((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
       
    }
    public static void printLeapYear(int year) 
    {
        System.out.println("Year " + year + " is" + (isLeapYear(year) ? "" : " not") + " a leap year");
    }    
    
    public static void main(String[] args) 
    {
        printLeapYear(2020);
        printLeapYear(2000);
        printLeapYear(1900);
        System.out.println("Enter a year: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        printLeapYear(year);
    }  // end of method main  
} // end of class