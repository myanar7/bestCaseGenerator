# Best Case Of QuickSort

It is a method to convert a sorted array to an array which is the best case for quicksort. You must give an sorted array for the first argument of generate method. Second and third parameters represent lower and upper bound of the array. Last parameter always have to be true for initial condition.

Here is an example:
```java
int size = 1000;
int[] array= new int[size];
for(int i=0;i<size;i++){
  array[i]=i;
}
generate(array,0,size-1,true);
```
