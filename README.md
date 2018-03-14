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

# Experiment Methodology
<ol>
	<li>  <p> Step 1:Populate an array with integers iterating by 1000, starting at 1000 going to 9999999.</p> </li>
	<li>  <p> Step 2: Start timer. The timer will time, in nanoseconds, the amount of time the each search takes, of which we will do 1000 trials. After 10000, average the amount of time it took for each trial. This will be the average amount of time it takes to sort a list of a certain size</p> </li>
	<li>  <p> Step 3: Increment size by 1000 and repeat Steps 1 and 2. Keep repeating until size reaches 1000000. This ensures that we will be testing arrays of each size from 1000-1000000 (incremented by 1000) and each sized array tested 1000 times. </p> </li>

</ol>

# Results
<h2 align="center"> Graph </h2>
    <img src="https://github.com/ewong11/wapples/blob/master/quicksortData.png" >
    <p> Link to our Google Spreadsheet: https://docs.google.com/spreadsheets/d/1rLJW9wGxqFKBiSrYIaNkXJ835zDR4oddDjg8YMyOBWg/edit#gid=1395060798</p>
<h3> Observations </h3>
<p> This graph appears to have a linear trend. this would agree with our hypothesis, which was that our experiment ran in O(n) linear time. </p>
<p> The graph shows the average runtime (10,000 trials) of each size (1000-10000;increments of 100) to ensure the most accurate and precise results. </p>

# Conclusions
<ul>
	<li> Analysis </li>
	     <ul>
		<li> <p>Our code runs in logarithmic time.</p> </li>
		<li> <p>The data seems to change in increments - the change in runtime between each size increment of 100 is relatively constant.</p> </li>
	     </ul>
	<li> Unresolved Issues </li>
	     <ul>
		<li> <p> There are sometimes random spikes (outliers) for random sizes in the data, which is strange, since the average of 10,000 trials should not return any outliers. </p> </li>
	     </ul>
</ul>
