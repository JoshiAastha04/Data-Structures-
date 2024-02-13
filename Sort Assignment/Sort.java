class Sort {
	
	public static void swap(int[] arr, int j) {
		int tmp = arr[j+1];
		arr[j+1] = arr[j];
		arr[j] = tmp;
	}
	
	public static void swap(int[] arr, int minIndex, int i) {
		int tmp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = tmp;
	}

	// O(n^2)
	public static void bubbleSort(int[] arr) {		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j);
				}				
			}			
		}		
	}
	
	// O(n^2)
	// Insertion Sort
	public static void insertionSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;			
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;			
		}	
	}
	
	// O(n^2)
	// Selection Sort
	public static void selectionSort(int[] arr) {	
		for(int i = 0; i < arr.length-1; i++) {
			int minIndex = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}						
			}			
			swap(arr, minIndex, i);		
		}	
	}
	
	// add heapSort to sort integers

}