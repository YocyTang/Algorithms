public class InversePairs{
	public int inverserNum(int[] data){
		if(data == null){
			return 0;
		}
		int n = data.length;
		int[] copy = new int[n];
		for(int i = 0; i<length; i++){
			copy[i] = data[i];
		}
		int count = InversePairsCore(data, copy, 0, n-1);
	}
	public int InversePairsCore(int[] data, int[] copy, int start, int end){
		if(start == end){
			copy[start] = data[start];
			return 0;
		}
		int len  = (end-start)/2;
		int left = InversePairsCore(copy, data, start, start+len);
		int right = InversePairsCore(copy, data, start+len+1, end);

		int i = start+length;
		int j = end;
		int indexCopy = end;
		int count = 0;
		while(i>=start && j>=start+len+1){
			if(data[i]>data[j]){
				copy[indexCopy--] = data[i--];
				count += j-start-len;
			}else{
				copy[indexCopy--] = data[j--];
			}
		}
		for(;i>=start; i--){
			copy[indexCopy--] = data[i];
		}
		for(; j>=start+len+1;j--){
			copy[indexCopy--] = data[j];
		}
		return left+right+count;
	}
}