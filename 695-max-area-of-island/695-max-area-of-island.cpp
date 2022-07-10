class Solution {
	int dfs(int i, int j, int rows, int cols, vector<vector<int>>& grid, vector<vector<bool>>& isVisited, int& count) {
		if (i < 0 || i >= rows || j < 0 || j >= cols)
			return 0;
		if (grid[i][j] == 0 || isVisited[i][j] == true)
			return 0; 
		isVisited[i][j] = true; 
		if (dfs(i - 1, j, rows, cols, grid, isVisited, count))
			count++;
		if (dfs(i + 1, j, rows, cols, grid, isVisited, count))
			count++;
		if (dfs(i, j-1, rows, cols, grid, isVisited, count))
			count++;
		if (dfs(i, j + 1, rows, cols, grid, isVisited, count))
			count++;
		return 1; 
		
	}
public:
	int maxAreaOfIsland(vector<vector<int>>& grid) {
		int rows = grid.size();
		int cols = grid[0].size();
		vector<vector<bool>> isVisited;
		isVisited.resize(rows); 
		for (int i = 0; i < rows; i++) {
			isVisited[i].resize(cols); 
		}
		int maxArea = INT_MIN; 
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] == 0)
					continue; 
				if (grid[i][j] == 1) {
					int currentArea = 1;
					dfs(i, j, rows, cols, grid, isVisited, currentArea);
					maxArea = max(maxArea, currentArea);
				}
			}
		}
		return (maxArea == INT_MIN ? 0 : maxArea);  
	}
};