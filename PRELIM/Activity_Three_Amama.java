import java.util.Scanner;

public class Activity_Three_Amama{
  
  final static double c1MealPrice = 109.00;
  final static double c2MealPrice = 153.00;
  final static double c3MealPrice = 250.00;
  final static double c4MealPrice = 499.00;
  final static double c5MealPrice = 699.00;
  final static double r1MealPrice = 35.00;
  final static double r2MealPrice = 50.00;
  final static double pesoToDollar = 56.00;
  
  
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   
    System.out.println("Menu Selection     Add ons");
    System.out.println("C1 = P109.00       R1 = P35.00");
    System.out.println("C2 = P153.00       R2 = P50.00");
    System.out.println("C3 = P250.00                  ");
    System.out.println("C4 = P499.00                  ");
    System.out.println("C5 = P699.00             "+"\n");
    
    System.out.println("Number C1 Meal: ");
    int numberOfC1 = sc.nextInt();
    
    System.out.println("Number of C2 Meal: ");
    int numberOfC2 = sc.nextInt();
    
    System.out.println("Number of C3 Meal: ");
    int numberOfC3 = sc.nextInt();
    
    System.out.println("Number of C4 Meal: ");
    int numberOfC4 = sc.nextInt();
    
    System.out.println("Number of C5 Meal: ");
    int numberOfC5 = sc.nextInt();
    System.out.print("\n");
        
    System.out.println("Number of C1: "+numberOfC1);
    System.out.println("Number of C2: "+numberOfC2);
    System.out.println("Number of C3: "+numberOfC3);
    System.out.println("Number of C4: "+numberOfC4);
    System.out.println("Number of C5: "+numberOfC5+"\n");
        
    double c1TotalPrice = numberOfC1 * c1MealPrice;
    double c2TotalPrice = numberOfC2 * c2MealPrice;
    double c3TotalPrice = numberOfC3 * c3MealPrice;
    double c4TotalPrice = numberOfC4 * c4MealPrice;
    double c5TotalPrice = numberOfC5 * c5MealPrice;
    
    System.out.println("Total C1 Price: "+c1MealPrice);
    System.out.println("Total C2 Price: "+c2MealPrice);
    System.out.println("Total C3 Price: "+c3MealPrice);
    System.out.println("Total C4 Price: "+c4MealPrice);
    System.out.println("Total C5 Price: "+c5MealPrice+"\n");
    
    double c1PriceToDollar = c1MealPrice / pesoToDollar;
    double c2PriceToDollar = c2MealPrice / pesoToDollar;
    double c3PriceToDollar = c3MealPrice / pesoToDollar;
    double c4PriceToDollar = c4MealPrice / pesoToDollar;
    double c5PriceToDollar = c5MealPrice / pesoToDollar;
    
    System.out.println("Total C1 Price in Dollar: "+c1PriceToDollar);
    System.out.println("Total C2 Price in Dollar: "+c2PriceToDollar);
    System.out.println("Total C3 Price in Dollar: "+c3PriceToDollar);
    System.out.println("Total C4 Price in Dollar: "+c4PriceToDollar);
    System.out.println("Total C5 Price in Dollar: "+c5PriceToDollar+"\n");  
    
    System.out.println("Add Ons");
   
    System.out.println("Number of R1 Meal: ");
    int numberOfR1 = sc.nextInt();
    
    System.out.println("Number of R2 Meal: ");
    int numberOfR2 = sc.nextInt();
    System.out.println();
    
    System.out.println("Number of R1: "+numberOfR1);
    System.out.println("Number of R2: "+numberOfR2+"\n");
    
    double r1TotalPrice = numberOfR1 * r1MealPrice;
    double r2TotalPrice = numberOfR2 * r2MealPrice;
    
    System.out.println("Total R1 Price: "+r1MealPrice);
    System.out.println("Total R2 Price: "+r2MealPrice+"\n");
    
    double r1PriceToDollar = r1MealPrice / pesoToDollar;
    double r2PriceToDollar = r2MealPrice / pesoToDollar;
    
    System.out.println("Total R1 Price in Dollar: "+r1PriceToDollar);
    System.out.println("Total R2 Price in Dollar: "+r2PriceToDollar);
      
      

    }
 
}

   
   
  
  

