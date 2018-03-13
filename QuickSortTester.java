public class QuickSortTester {

public static void main(String[] args){
	QuickSort code = new QuickSort();
	//warming up
	int n = 1000;
  int[] arr;
  System.out.println("Size (n) , Time(Nanoseconds)");

  //measure time for each array generated, takes the average
	while (n <= 9999999){
      //populating new awway
	    arr = new int[n];
      for( int i = 0; i < n; i++ )
      arr[i] = (int)( 48 * Math.random() );

      double total = 0.0;
			int counter = 0;
      while (counter < 1000) {
      long startTime = System.nanoTime();
		  code.qsort(arr);
      long endTime = System.nanoTime() - startTime;
      total += endTime;

      counter ++;
    }
      total = total / 1000.0;
      System.out.println(n + " , " + total);
      n += 1000;

	}

	}
}
