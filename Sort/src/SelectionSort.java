
public class SelectionSort {
	private int [] arr;  
	 SelectionSort() {
		// TODO Auto-generated constructor stub
	}
	 private static void printArray(int[] anArray) { //prints array by implementing stringbuilder
	     StringBuilder sb = new StringBuilder();
	     for (int i = 0; i < anArray.length; i++) {
	        if (i > 0) {
	           sb.append(", ");
	        }
	        sb.append(anArray[i]);
	     }
	     System.out.println(sb.toString());
	  }
	 public static void selectionSort(int[] arr){  
	     for (int i = 0; i < arr.length - 1; i++)   //outer loop of selection sort
	     {  
	         int index = i;  
	         for (int j = i + 1; j < arr.length; j++){   //inner loop of selection sort
	             if (arr[j] < arr[index]){               
	                 index = j;//searching for minimum of the index  
	             }  
	         }  
	         int smallestplace = arr[index];   
	         arr[index] = arr[i];  
	         arr[i] = smallestplace;  
	     }  //end for(outer)
	 }      
	 public static void main(String a[]){
	    	
	    	int myArray[] = { 40,8,6,5,24,68,42,9,10 }; //first array to be tested
	    	                                
	    	SelectionSort selection = new SelectionSort(); //creates an object of the class
	    	selectionSort(myArray);
	    	printArray(myArray);
	    	
	       
}
}
