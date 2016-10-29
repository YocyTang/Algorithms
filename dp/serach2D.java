public class Solition{
	public boolean search(int[][] matrix, int target){
		if(matrix == null){
			return false;
		}
		int n = matrix.length-1;
		int m = matrix[0].length-1;
		int row = 0;
		while(row<=n&&m>=0){
			if(matrix[row][n] target){
				return true;
			}else if(matric[row][n] < target){
				row++;
			}else {
				m--;
			}
		}
		return false;
	}
}