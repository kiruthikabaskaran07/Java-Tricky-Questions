import java.util.*;
class Inputreverse
{
	public static void main(String[] args) 
	{
		int n,i,j=0;
		Scanner sc=new Scanner (System.in);
		
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
		if(n>0){
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter " +n +" element of the array: ");
       for( i = 0; i < arr1.length; i++) {
            arr1 [i] = sc.nextInt();
        }
       System.out.println("Input array elements are: ");
       for ( i=0; i<arr1.length; i++)   
       {  
       System.out.print(arr1[i]+" \t ");  
       } 
      for( i =arr2.length-1;i>=0; i--) {
		  arr2[i]=arr1[j];
		  j++;
	  }
	  System.out.println("\nReverse array elements are: ");
	  for( i = 0; i < arr2.length; i++){ 
            
        System.out.print(arr2[i]+"\t ");
	  }
		}
else
       System.out.println("Enter valid number");
	}
	
	}