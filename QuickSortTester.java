public class QuickSortTester {

    public static void main(String[] args){
	QuickSort code = new QuickSort();
	//warming up
	int n = 1000;
	int[] arr;
	System.out.println("Random Pivot:\nSize (n) , Time(Nanoseconds)");

	//measure time for each array generated, takes the average
	while (n <= 100000){
	    //populating new awway
	    arr = new int[n];
	    //This process runs in O(n) for each array generated. It is NOT counted for time.
	    //This process will populate the array with random integers.
	    for( int i = 0; i < n; i++ )
		arr[i] = (int)( 48 * Math.random() );
	
	    //Total time
	    double total = 0.0;
	    //How many arrays of the same length have been tested
	    int counter = 0;

	    //We test arrays of the same length 100 times and take the average to yield accurate results, remove outliers, and in the name of proper data gathering
	    while (counter < 100) {
		code.shuffle(arr);
		long startTime = System.nanoTime();
		code.qsort(arr);
		long endTime = System.nanoTime() - startTime;
		total += endTime;

		counter ++;
	    }
			
	    //Take the average time it took to sort each array of length n
	    total = total / 100.0;
	    System.out.println(n + " , " + total);
	    //Increase the size of the array by 1000
	    n += 1000;

	}
	

    }
}
