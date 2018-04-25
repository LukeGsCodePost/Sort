
public class BubbleSort {
	public int [] arr;                     //ref to array arr
	private int size;                     //number of data items
	
	public BubbleSort(int max) {
		// TODO Auto-generated constructor stub
		 arr = new int[max];                 //create the array
		 size = 0;                         //no items yet
	}
	 private static void printArray(int[] anArray) { //prints array by implementing stringbuilder
	     StringBuilder sb = new StringBuilder();
	     for (int i = 0; i < anArray.length; i++) {    // runs int i through array length
	        if (i > 0) {
	           sb.append(", ");
	        }
	        sb.append(anArray[i]);              //appends array
	     }
	     System.out.println(sb.toString());
	  }
	 
	 public void insert(int value){
		 arr[size] = value;
		 size++;
	 }
	 public void printArray()
	 {
		 for(int j=0; j<size; j++)
			 System.out.print(arr[j] + " ");
		 System.out.println(" ");
	 }
	 public void bubbleSort(){  
		 int in, out;
		  int nItems = arr.length;
		 
		 for(out= nItems-1; out>1; out--)    // outter loop this is the backward loop
		 for(in=0; in<out; in++)             // inner loop this is the forward loop
			 if( arr[in] > arr[in +1])       // out of order
			   swap(in, in +1);              // swaps elements
		 }
	 
	  public void swap (int first, int second)  
	  {
		  int temp = arr[first];
		  arr[first] = arr[second];
		  arr[second] = temp;
	  }
	 public static void main(String a[]){
	    	
	    	int Size = 10;                           //size of the array 
	    	
	    	BubbleSort myArray = new BubbleSort(Size);  //creates the array object
	    	
	    	myArray.insert(89);
	    	myArray.insert(65);
	    	myArray.insert(56);
	    	myArray.insert(21);
	    	myArray.insert(97);
	    	myArray.insert(43);
	    	myArray.insert(87);
	    	myArray.insert(4);
	    	myArray.insert(32);
	    	myArray.insert(16);
	    	
	    	myArray.printArray();              //prints array
	    	
	    	myArray.bubbleSort();            //bubble sorts array
	    	
	    	myArray.printArray();            //display them again
	    	
	    	
}
}


