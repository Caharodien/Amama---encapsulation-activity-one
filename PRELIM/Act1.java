import java.util.Scanner;

 public class Act1{
   public static void main (String[] args){
   
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Enter a number: ");
   int Number = sc.nextInt();
   
   if (Number % 2 == 0)
   System.out.println("Even number");
   
   else
   System.out.println("Odd number");
   }
}