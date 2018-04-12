import java.util.Scanner;

public class BinarySearch {

	static int counter, num, item, array[], first, last, middle;
	static Scanner input = new Scanner(System.in);
	

	public static void main(String args[]){
		BinarySearch sobj=new BinarySearch();
		sobj.input();
		sobj.bsearch();
	} 

	public void input(){

	      System.out.println("Enter number of elements:");
	      num = input.nextInt(); 			//accept array size
	      array = new int[num];

	      System.out.println("Enter " + num + " integers:");
	      for (counter = 0; counter < num; counter++)
	      	array[counter] = input.nextInt(); 	//put entered values in array


		
               //selection sort for array

      
		for(int i=0;i<array.length-1;i++)
		{
 		int next=i;
		for(int j=i+1;j<array.length;j++)
   		{
     		if(array[j]<array[next])
      			{
      			next=j;
      			}
		}	     		
		int s=array[next];
     		array[next]=array[i];
     		array[i]=s;
    		
                }  
                
                System.out.println("Sorted Array:");
                for(int k=0;k<array.length;k++)
                 {
                 System.out.println(array[k]);
                 }
		

	      
  	      System.out.println("Enter the search value:");
	      item = input.nextInt();			//accept value to be searched
	      first = 0;
	      last = num - 1;
	      middle = (first + last)/2;
	    }



  	public void bsearch(){
	   while( first <= last ){			//for all elements
//compare with mid; if value is small, search left subarray, else search right
	
      	if ( array[middle] < item )		
	         first = middle + 1;
	      else if ( array[middle] == item ){
	         System.out.println(item + " found at location " + (middle + 1) + ".");
	         break;
	      }
	      else
	         last = middle - 1;
	      middle = (first + last)/2;
	   }
	   if ( first > last )
	      System.out.println(item + " is not found.\n");
}
}
/*
lenovo@lenovo-Lenovo-ideapad-510-15IKB:~$ javac BinarySearch.java 
lenovo@lenovo-Lenovo-ideapad-510-15IKB:~$ java BinarySearch 
Enter number of elements:
7
Enter 7 integers:
7
6
5
4
1
2
3
Sorted Array:
1
2
3
4
5
6
7
Enter the search value:
5
5 found at location 5.
lenovo@lenovo-Lenovo-ideapad-510-15IKB:~$ 
//
