public class GetNumberOfK{
	public int core(int[] data, int k){
		if(data == null || data.length=0){
			return 0;
		}
		int number = 0;
		int first = getFirst(data, k, 0, data.length-1);
		int end = getLast(data, k, data.length-1);
		if(first>-1&&end >-1){
			number = last-first+1;
		}
		return number;
	}
	private int getFirst(int[] data, int k, int start, int end){
		if(start>end){
			return -1;
		}
		ind mid = (start+end)/2;
		int middleData = data[mid];
		if(middleData ==k){
			if(mid>0&&data[mid-1]!=k||mid==0)
				return mid;
			else
				end = mid-1;
		}else if(middleData>k){
			end = mid-1;
		}else{
			start = mid+1;
		}
		return getFirst(data, k, start, end);
	}
	private int getLast(int[] data, int k, int start, int end){
		if(start>end){
			return -1;
		}
		int mid =(start+end)/2;
		int middleData = data[mid];
		if(middleData== k){
			if(mid<end&&data[mid+1]!=k||mid == end){
				return mid;
			}else{
				start = mid+1;
			}
		}else if(middleData<k){
			start = mid-1;
		}else {
			end = mid-1;
		}
		return getLast(data, k, start, end);
	}
}