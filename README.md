# Team Wapples
<ul>
<li> (Larry Wong, Joshua Weiner, Eric Wong)</li>
 <li> APCS2 pd8</li>
 <li>L01 -- What Does the Data Say?</li>
<li>2018-03-13</li>
	
</ul>
<p align="center">
<b>Timing QuickSort</b>
</p>

# Hypothesis
<p> Our search algorithim will run, on average, in O(nlogn) logarithmic time. </P>

# Background
<p> QuickSort seemed to provide an alternative sort that could possibly sort a list as fast as, if not faster, than mergesort, which was the fastest sort we have thus far learned. Because of this, and the fact that QuickSort may use less memory than mergesort, warranted testing of QuickSort and its runtime.</p>

# Runtime Classification
<ul>
	<li> Best Case: O(nlogn) </li>
	<li> Average Case: O(nlogn) </li>
	<li> Worst Case: O(n^2) </li>
</ul>
<b>Pivot Selection and Data Arrangement </b>
<p> The point chosen as the pivot can impact runtime. The optimal pivot is either random or the median (middle index) of a paritioned section. These pivots will give the greatest chance for creating two partitioned lists ("halves") following each recursive call of partition. This will lead to O(nlogn). If one were to choose a pivot that is on either end of the list, and the list is sorted, then runtime will be greater because every time partition is called, there is only one partitioned side.
	For example, a list sorted from least to greatest, with the pivot at the last index. Every partiton will create a new list with the pivot at the end, since there are no elements greater than the last element of the pivot. The list to be sorted therefore only decreases by 1 for each call to partition, leading to O(n^2) runtime. Thus, depending on the choice of pivot and how the data is arranged, run-time can be greatly affected. 
	

# Experiment Methodology
<ol>
	<li>  <p> Step 1:Populate an array with integers iterating by 1000, starting at 1000 going to 100000.</p> </li>
	<li>  <p> Step 2: Start timer. The timer will time, in nanoseconds, the amount of time the each search takes, of which we will do 100 trials. After 100 trials, average the amount of time it took for each trial. This will be the average amount of time it takes to sort a list of a certain size</p> </li>
	<li>  <p> Step 3: Increment size by 100 and repeat Steps 1 and 2. Keep repeating until size reaches 100000. This ensures that we will be testing arrays of each size from 1000-100000 (incremented by 1000) and each sized array tested 100 times. </p> </li>

</ol>

# Results
<h2 align="center"> Graph </h2>
    <img src="https://github.com/ewong11/wapples/blob/master/quicksortData.png" >
    <p> Link to our Google Spreadsheet: https://docs.google.com/spreadsheets/d/1rLJW9wGxqFKBiSrYIaNkXJ835zDR4oddDjg8YMyOBWg/edit#gid=1395060798</p>
<h3> Observations </h3>
<p> This graph appears to have a logarithmic trend. this would agree with our hypothesis, which was that our experiment ran in O(nlogn) linear time. </p>
<p> The graph shows the average runtime (100 trials) of each size (1000-100000;increments of 1000) to ensure the most accurate and precise results. </p>

# Conclusions
<ul>
	<li> Analysis </li>
	     <ul>
		<li> <p>Our code runs in logarithmic time.</p> </li>
		<li> <p>The Big-O runtime of this sort is the same as mergesort, but this does not require the creation of a new array, which saves memory. Compared ot other sorts, QuickSort is both fast and efficient (memory-wise). We conclude that quick sort has many benefits over the other sorts that we learned, and should be considered as our main way to sort an array.</p> </li>
	     </ul>
	<li> Unresolved Issues </li>
	     <ul>
		<li> <p>The code seems to run as expected. </p>
		     <p> However, there are slight data spikes, but nothing too major. More trials may smooth this out.</li>
			     <li> <p>The biggest obstacle to testing QuickSort came not from the methods contained in QuickSort themselves (which were the only things timed), but actually from the time it took to populate arrays with random numbers in QuickSortTester. We had to do this in order to populate consistently random arrays (and get accurate results). However this process runs at O(n), meaning that we could not afford to actually test the time it took to populate these arrays - hence why this process was contained in the Tester class and not the Sort class. However, the amount of time this took, especially as the arrays increased in size, was very large and discouraged us from testing even more arrays of even greater length. This is less an issue with the sorting algorithm or our results, moreso an issue that arises with the quest to achieve accurate data.</p></li>
</ul>
