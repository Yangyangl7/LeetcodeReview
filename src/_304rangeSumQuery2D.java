//Given a 2D matrix matrix, find the sum of the elements inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).
//
//Range Sum Query 2D
//The above rectangle (with the red border) is defined by (row1, col1) = (2, 1) and (row2, col2) = (4, 3), which contains sum = 8.


public class _304rangeSumQuery2D {
	 private int[][] sum;
	    
	 public _304rangeSumQuery2D(int[][] matrix) {
		 if (matrix.length == 0) return;
		 
		 sum = new int[matrix.length + 1][matrix[0].length + 1];
		 
		 for (int i = 1; i < sum.length; i++) {
			 for (int j = 1; j < sum.length; j++) {
				 sum[i][j] = sum[i - 1][j] + sum[i][j - 1] + matrix[i - 1][j - 1] - sum[i - 1][j - 1];
			 }  // the index should be change to index in sum and the edge should be 
			    // carefully determined.
		 }
	 }
	 
	 public int sumRegion(int row1, int col1, int row2, int col2) {
		 return sum[row2 + 1][col2 + 1] - sum[row1][col2 + 1] - sum[row2][col1 - 1] - sum[row1][col1];
	 }
}
