import java.util.*;
class Inputprint
{
	public static void main(String[] args) 
	{
		int i,n;
		Scanner sc=new Scanner (System.in);
		
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
		if(n>0){
		int arr[]=new int[n];
		System.out.println("Enter " +n +" element of the array: ");
       for( i = 0; i < arr.length; i++) {
            arr [i] = sc.nextInt();
        }
       System.out.println("Array elements are: ");
       for ( i=0; i<arr.length; i++)   
       {  
       System.out.print(arr[i]+" \t ");  
       } 
		}
		else
       System.out.println("Enter valid number");
}  
}  

