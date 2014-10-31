package java;

public class Search2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int targetRow = 0;
        while(target > matrix[targetRow][col-1] && targetRow < row -1){
            targetRow ++;
        }
        for(int i = 0; i < col; i ++){
            if(target == matrix[targetRow][i]){
                return true;
            }
        }
        return false;
    }
	
	public boolean searchMatrixBinary(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m*n -1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            int locX = mid / n;
            int locY = mid % n;
        
            if(matrix[locX][locY] == target){
            return true;
            } else if (matrix[locX][locY] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
