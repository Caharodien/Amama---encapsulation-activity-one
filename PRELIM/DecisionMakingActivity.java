import java.util.Scanner;
public class DecisionMakingActivity{   
   public static void main(String[] a){ 
   Scanner sc = new Scanner(System.in);
   
   System.out.println("Route to Moalboal");
   
   System.out.print("Is Barili Route 4.1 is obstructed? (Yes = 1 or No = 0): ");
   int isBariliRouteObstructed = sc.nextInt();
   
   if(isBariliRouteObstructed == 0)
      System.out.println("Default Route:");
      System.out.println("Mingla ... (Route 1)");
      System.out.println("San Fer ... (Route 2)");
      System.out.println("Carcar ... (Route 3)");
      System.out.println("Dumanjug ... (Route 4.1)");
      System.out.println("Alcantara ... (Route 4.1.1)");
      System.out.println("Moalboal ... (Route 4.1.2)");     
   
   System.out.print("Is Dumanjug Route 4.2.1 obstructed? (Yes = 1 or No = 0): ");
   int isDumanjugObstructed = sc.nextInt();
   
   if(isDumanjugObstructed == 1)
      System.out.println("Recommended Route:");
      System.out.println("Mingla ... (Route 1)");
      System.out.println("San Fer ... (Route 2)");
      System.out.println("Carcar ... (Route 3)");
      System.out.println("Sibonga ... (Route 4.2)");
      System.out.println("Argao ... (Route 5)");
      System.out.println("Ronda ... (Route 5.1)");
      System.out.println("Moalboal ... (Route 4.1.2)");
    }
}