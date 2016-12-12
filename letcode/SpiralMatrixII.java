public int[][] generateMatrix(int n){
	int len = Math.abs(n);
	int [][] res = new int[len][len];
	if(len == 0){
		return res;
	}
	int endIndex = (s+1)/2;
	int start= 0;
	int index = 1;
	buildMatrix(start, endIndex, index, res, len);
	return res;
}
private void buildMatrix(int start, int endIndex, int index, int[][] res, int len){
	if(start> endIndex){
		return;
	}
	int end  =len-start-1;
	for(int i = start; i<=end; i++){
		res[start][i] = index++;
	}
	if(start<end){
		for(int i = start+1; i<=end;i++){
			res[i][end] = index++;
		}
		for(int i = end-1; i>=start; i--){
			res[end][i] = index++;
		}
		if(start<end-1){
			for(int i = end-1; i>=start+1; i--){
				res[i][start] = index++;
			}
		}
	}
	start= start+1;
	buildMatrix(start, endIndex, index, res, len);
}