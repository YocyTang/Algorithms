public int IslandPerimeter(int[][] grid){
	int n = grid.length;
	int m = grid[0].length;
	int sum = 0;
	for(int i = 0; i< n; i++){
		for(int j = 0; j < m; j++){
			if(grid[i][j] == 0) continue;
			int index = 4;
			if(i>=1&&grid[i-1][j] == 1){
				index--;
			}
			if(i<n-1&&grid[i+1][j] == 1){
				index--;
			}
			if(j<m-1&&grid[i][j+1] == 1){
				index--;
			}
			if(j>=1&&grid[i][j-1] == 1){
				index--;
			}
			sum += index;
		}
	}
	return sum;
}