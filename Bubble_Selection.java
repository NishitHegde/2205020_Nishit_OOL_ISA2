package OOCAssignment;
import java.util.Scanner;
public class Bubble_Selection 
{
	
	  public void bubbleSort(int[] arr) 
	  {
		  System.out.print("Sorting Array using Bulbble Sort Technique..\n");
	        int n = arr.length;
	        int temp = 0;
	        for(int i = 0; i < n; i++) 
	        {
	            for(int j = 1; j < (n - i); j++) 
	            {
	                if(arr[j - 1] > arr[j]) 
	                {
	                    temp = arr[j - 1];
	                    arr[j - 1] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	        System.out.print("Now the Array after Sorting is :\n");  
	    }
	    
	
	    public void selectionSort(int[] arr) 
	    {
	    	System.out.print("\nSorting Array using Selection Sort Technique..\n"); 
	        int n = arr.length;
	        for(int i = 0; i < n - 1; i++) 
	        {
	            int minIndex = i;
	            for(int j = i + 1; j < n; j++) 
	            {
	                if(arr[j] < arr[minIndex]) 
	                {
	                    minIndex = j;
	                }
	            }
	            int temp = arr[minIndex];
	            arr[minIndex] = arr[i];
	            arr[i] = temp;
	        }
	        System.out.print("Now the Array after Sorting is :\n");  
	    }
	    public void display(int[] arr)
	    {
	    	int n = arr.length;
	    	for(int i=0; i<n; i++)  
		    {  
		        System.out.print(arr[i]+ "  ");  
		    } 
	    }
	    public static void main(String[] args) 
	    {
		    Scanner scan = new Scanner(System.in);  
		      
		    System.out.println("Enter Array Size : ");  
		    int size = scan.nextInt(); 
		    int arr[] = new int[size];
		      
		    System.out.println("Enter Array Elements : ");  
		    for(int i=0; i<size; i++)  
		    {  
		        arr[i] = scan.nextInt();  
		    }
		    
		    Bubble_Selection s = new Bubble_Selection();
		    s.bubbleSort(arr);
		    s.display(arr);
		    s.selectionSort(arr);
		    s.display(arr);
		    
		}
}

