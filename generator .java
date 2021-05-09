public static void generate(int[] arr, int begin, int end,Boolean part)		/// Best Case Generator for QuickSort
  {
    int count = end - begin+1;
    if(count < 3)
      return;

    //Find a middle element index
    //This will be the pivot element for the part of the array [begin; end)
    int middle = begin + (count-1) / 2;

	// PART: 
	// 		RIGHT:true
	//		LEFT:false
	//		INITIAL:true
    //Make the right part best-case, too: (middle; end)
    generate(arr, middle+1, end,false);

	//Make the left part best-case first: [begin; middle)
    generate(arr, begin, middle-1,true);
	
	if(count==arr.length){
		shiftRight(arr, middle, end);
	}
	else if(part)
		shiftRight(arr, middle, end);
	else
		shiftLeft(arr, begin, middle);
  }
  public static void shiftRight(int[] arr, int begin, int end)		/// Best Case Generator for QuickSort
  {
    int temp=arr[begin];
	if(begin-1<0)
		System.out.println("shift edilemez başında 0  -1 e gitmek istiyor");
	for (int i = begin+1; i <= end; i++) {
		arr[i-1]=arr[i];
	}
	arr[end]=temp;
  }
  
 
  public static void shiftLeft(int[] arr, int begin, int end)		/// Best Case Generator for QuickSort
  {
    int temp=arr[end];
	if(end+1>arr.length)
		System.out.println("shift edilemez başında sondaki  +1 e gitmek istiyor");
	for (int i = end-1; i >= begin; i--) {
		arr[i+1]=arr[i];
	}
	arr[begin]=temp;
  }