public List<Integer> spiralOrder(int[][] matrix){
	List<Integer> res = new ArrayList<Integer>();
	if(matrix == null|| matrix.length==0; matrix[0].length == 0){
		return res;
	}
	int cols = matrix[0].length;
	int rows = matrix.length;
	int start = 0;
	while(cols>2*start&& rows>2*start){
		spiralOrder(matrix, rows, cols, start, res);
		start++;
	}
	return res;
}
private spiralOrder(int[][] matrix, int rows, int cols, int start, List<Integer> res){
	int endX = cols-start-1;
	int endY= rows-start-1;
	for(int i = start; i< endX; i++){
		int number = matrix[start][i];
		res.add(number);
	}
	if(start<endY){
		for(int i = start+1; i<=endY; i++){
			int number = matrix[i][endX];
			res.add(number);
		}
	}
	if(start<endY&& start< endX){
		for(int i = endX-1; i>=start; i--){
			int number = matrix[endY][i];
			res.add(number);
		}
	}
	if(start<endX&& start<endY-1){
		for(int i = endY-1; i>=start+1; i--){
			int number = matrix[i][start];
			res.add(number);
		}
	}
}