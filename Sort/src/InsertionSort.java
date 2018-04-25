
public class InsertionSort {
	public int [] arr;                     //ref to array arr
	private int size;                     //number of data items
	
	 InsertionSort(int m) {               //constructor
		 arr = new int[m];                 //create the array
		 size = 0;                         //no items yet
		// TODO Auto-generated constructor stub
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
	 
	 public void insert(int value){        //inserts value
		 arr[size] = value;
		 size++;
	 }
	 public void printArray()            
	 {
		 for(int j=0; j<size; j++)
			 System.out.print(arr[j] + " ");
		 System.out.println(" ");
	 }
	 public void insertionSort(){  
		 int in, out;
		  int size = arr.length;
		 
		 for(out=2; out<size; out++)    // out is the dividing line of the array
		 {
			 int temp = arr[out];         //this is the removed elements that are marked.
			 in = out;                   
		 while(in>0 && arr[in -1] >= temp){ //until one is smaller.
			 arr[in] = arr[in-1];           //shifts and moves element to the right.
			 --in;                          //this makes the array go left one position.
		 }
		 arr[in] = temp;                    //insert marked item.
		 }
	 }
	    
	 public static void main(String a[]){
	    	
	    	int maxSize = 10;
	    	
	    	InsertionSort myArray = new InsertionSort(maxSize);
	    	
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
	    	
	    	myArray.printArray();
	    	
	    	myArray.insertionSort();
	    	
	    	myArray.printArray();
	    	
	    	
}
}
