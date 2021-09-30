import java.util.*;
class Frontback
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
       boolean read=true;
		int j=arr.length-1;
		for(i=0;i<arr.length/2;i++)
			if (arr[i]!=arr[j])
			{
			read =false;
			break;
			}
			else
				j--;
			if(read)
      System.out.println("\nArray elements are same from front and back");
    else
      System.out.println("\nArray element are not same from front and back");
		}
			
		else
       System.out.println("Enter valid number");
}  
}  

