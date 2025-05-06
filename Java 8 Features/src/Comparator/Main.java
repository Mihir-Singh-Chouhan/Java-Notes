package Comparator;

import java.util.*;

public class Main {
 public static void main(String[] arg){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 1 for descending order sorting:::");
     int n = sc.nextInt();
     DescendingOrderSorting obj = new DescendingOrderSorting();
     switch (n){
         case 1:
             obj.SortingUsingLambdaExpression();
             break;
         default:
             System.out.println("Select between the Range only ");
             break;
     }

 }
}

