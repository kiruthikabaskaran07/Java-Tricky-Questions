
import java.util.*;
class Inputcheck 
{
	public static void main(String[] args) 
	{
		int n, i,tocheck;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number of elements: ");
        n = sc.nextInt();
		if(n>0){
		int arr[]=new int[n];
		System.out.println("Enter "+n+" elements of the array: ");
       for( i = 0; i < arr.length; i++) {
            arr [i] = sc.nextInt();
        }
        System.out.println("Array elements are: ");
       for ( i=0; i<arr.length; i++)   
       {  
       System.out.print(arr[i]+" \t ");   
       } 
       System.out.println(" \nEnter the element to check whether it is present or not: "); 
	   tocheck = sc.nextInt();

    boolean present = false;

    for (int num : arr) {
      if (num == tocheck) {
        present = true;
        break;
      }
    }
    
    if(present)
      System.out.println("Element "+tocheck + " is present in the array.");
    else
      System.out.println("Element "+tocheck + " is not present in the array.");
		}
		else
      System.out.println("Enter valid number");
  }
}
