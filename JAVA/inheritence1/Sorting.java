
public abstract class Sorting implements Comparable{
	
	
	private void merge(Sorting[] arr, int first, int mid, int last) {
		
		//The end of Left & Right
		int len1 = mid - first + 1;
		int len2 = last - mid;
		
		//Fill left and right
        Sorting Left[] = new Sorting[len1];
        Sorting Right[] = new Sorting[len2];
        for (int i = 0; i < len1; i++)
            Left[i] = arr[first + i];
        for (int j = 0; j < len2; j++)
            Right[j] = arr[mid + 1 + j];
        
        //'Pointers'
        int i = 0, j = 0;
        int k = first;
        
        //While go over
        while(i < len1 && j < len2) {
        	if(Left[i].compareTo(Right[j]) >= 1) {
        		arr[k] = Left[i];
        		i++;
        	}else {
        		arr[k]= Right[j];
        		j++;
        	}
        	k++;
        }
        //While ends
        while(i < len1) {
        	arr[k] = Left[i];
        	i++; k++;
        }
        while(j < len2) {
        	arr[k] = Right[j];
        	j++; k++;
        }
	}
	
	public void mergeSort(Sorting[] arr, int first, int last) {
		if(first < last) {
			int mid = (first + last) / 2;
			mergeSort(arr,first,mid);
			mergeSort(arr, mid + 1, last);
			
			merge(arr, first, mid, last);
		}
	}
	
	public void Sort(Sorting[] sortingArray) {
		Sorting temp;
		for(int i = 0; i < sortingArray.length - 1; i++) {
			for(int j = 0; j < sortingArray.length - i - 1; j++) {
				if(sortingArray[j].compareTo(sortingArray[j + 1]) < 1) {
					temp = sortingArray[j];
					sortingArray[j] = sortingArray[j+1];
					sortingArray[j+1] = temp;
				}
			}
		}
	}
}
