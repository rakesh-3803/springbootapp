package sjb.TimeComplexity;

public class Bsearch {
	public int binarySearch(int[]arr,int ele) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==ele) {
				return mid;
			}
			
			if(arr[mid]<ele) { 
				low=mid+1;
			}
			else {
			  high=mid-1;
			  
				}
		}
			return -1;
			}
	}


