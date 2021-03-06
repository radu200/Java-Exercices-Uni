import java.util.Scanner;
public class BalancedParentheses {
    public static void main(String[] args) {
        checkParentheses("((a + b) * t/2 * (1 - t)");
        checkParentheses("(a + b) * t)/(2 * (1 - t)");
        checkParentheses("a + ((a + b) * t)/(2 * (1 - t))");
        System.out.println("Enter an expression: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        checkParentheses(s);
    }
    public static void checkParentheses(String s) {
        System.out.println(s + " is " 
                             + (isBalanced(s) ? "" : "not ") 
                             + "parentheses balanced");
    }
    public static boolean isBalanced(String s) {    
        int counter = 0;        
        for(int i = 0; i < s.length()  && counter >= 0; i++){
           char c = s.charAt(i); 
           if(c == '(' ){
             counter++;
          } else if(c == ')') {
             counter--;
          }
        }
        return counter == 0;        
    }    
}