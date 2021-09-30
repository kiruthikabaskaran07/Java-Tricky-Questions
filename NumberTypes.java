import java.util.*;
class NumberTypes
{

	public static void main(String[] args) 
	{
		int i,n,pos=0,neg=0,odd=0,even=0,zero=0;
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter number of elements: ");
        n = sc.nextInt();
		if(n>0){
		int arr[]=new int[n];
		System.out.print("Enter " +n+" elements of the array: ");
       for( i = 0; i < arr.length; i++) {
            arr [i] = sc.nextInt();
        }
 
 System.out.println("Array elements are: ");
       for ( i=0; i<arr.length; i++)   
       {  
       System.out.print(arr[i]+" \t ");  
       }
  
for ( i=0; i<arr.length; i++)   
       {
if(arr[i]>0){
pos++;}
else if(arr[i]<0){
neg++;}
else{
zero++;}
if(arr[i]>0 && arr[i]%2==0){
	even++;}  
else if(arr[i]>0&& arr[i]%2!=0){
	odd++;}
	   }
System.out.println("\nPositive Numbers: "+pos +"\nNegative numbers: "+neg+"\nZeros: "+zero +"\nEven Numbers: "+even +"\nOdd Numbers: "+odd ); 
	
	   }
else
       System.out.println("Enter valid number");

	}
}