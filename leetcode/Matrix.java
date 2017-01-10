public class Mutrix{
	public static int[][] multi(int[][] a, int[][] b){
		int n = a.length;
		int[][] res = new int[n][n];
		for(int i = 0; i< n; i++){
			for(int j =0 ; j< n; j++){
				int sum = 0;
				for(int k = 0; k< n; k++){
					sum += a[i][k]*b[k][j];
				}
				res[i][j] = sum;
			}
		}
		return res;
	}
}