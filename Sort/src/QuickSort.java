import java.util.Arrays;


public class QuickSort {

	static void quickSort
	(int[]a, int p, int r){            

		if (p < r ){
                                        //sorts left to right or min to max
			int q = partition(a, p, r);
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
		}
	}
	public static int partition( int[]a, int p, int r)
	{
		int x =  a[p];                       //pivot
		int i =p;                           //left or min of the array
		int j = r;                          //right or max of the array
		
		while(true){
			while(a[j]> x){
				j = j-1;                    //right -1
			}
			while(a[i]  < x){
				i = i+1;                   //left +1
			}
			if (i <j) {                    //the swap method is iterated and implemented in the code
				int temp= a[i];            
				a[i]=a[j];
				a[j]= temp;
			}//end swap
			else 
				return j;                //returns right
		}
	}
	

	public static void main(String[] args)
	{
		int a[] = new int[10];                         //array size
		for( int j=0; j<10; j++){                      //fills array
			int n =(int)(java.lang.Math.random()*99);   //array is filled randomly with math random
			a[j]=n;                                     //implements the for loop var and the math random var to create a random array
		}
	    System.out.println("unsorted array =" + " " + Arrays.toString(a));                           //prints the array unsorted.Arrays to string method is used to print quick unsorted array 
		QuickSort.quickSort(a, 0, 9);                                                             //the quick sort takes in the array and the min and the max
		System.out.println("sorted array =" + " " + Arrays.toString(a));                          //Arrays to string method is used to print quick sorted array 

	}// end main
}//end QuickSort