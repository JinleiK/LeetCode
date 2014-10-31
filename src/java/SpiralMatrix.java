package java;
import java.util.ArrayList;
import java.util.List;


public class SpiralMatrix {
	
	public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        if(matrix == null || matrix.length < 1 || matrix[0].length < 1)   return spiral;
        int m = matrix.length;
        int n = matrix[0].length;
        int level = Math.min(m, n);
//        System.out.println(level / 2);
        for(int i = 0; i < level / 2; i ++){
            for(int j = i; j < level - i; j ++){
                spiral.add(matrix[i][j]);
//                System.out.println(matrix[i][j]);
            }
            for(int j = i + 1; j < level - i; j ++)
                spiral.add(matrix[j][level - 1 - i]);
            for(int j = level - 2 - i; j >= i; j --)
                spiral.add(matrix[level - 1 - i][j]);
            for(int j = level - 2 - i; j > i; j --){
                spiral.add(matrix[j][i]);
//                System.out.println(matrix[j][i]);
            }
        }
        if(level % 2 == 1){
            if(level == m){
                for(int j = level / 2; j < n - level / 2; j ++)
                    spiral.add(matrix[level / 2][j]);
            } else{
                for(int j = level / 2; j < m - level / 2; j ++)
                    spiral.add(matrix[j][level / 2]);
            }
        }
        return spiral;
    }
	
	public int[][] generateMatrix(int n) {
        if(n < 1)   return new int[0][0];
        int[][] matrix = new int[n][n];
        int num = 1;
        for(int i = 0; i < n / 2; i ++){
            for(int j = 0; j < n - i; j ++){
                matrix[i][j] = num ++;
                System.out.println(matrix[i][j]);
            }
            for(int j = i + 1; j < n - i; j ++)
                matrix[j][n - 1 - i] = num ++;
            for(int j = n - 2 -i; j >= i; j --)
                matrix[n - 1 - i][j] = num ++;
            for(int j = n - 2 - i; j > i; j --)
                matrix[j][i] = num ++;
        }
        if(n % 2 == 1){
            matrix[n / 2][n / 2] = num;
        }
        return matrix;
    }

	public static void main(String[] args) {
		SpiralMatrix sm = new SpiralMatrix();
//		int[] A = {1, 2};
//		int[] B = {3, 4};
//		int[][] m = {A, B};
//		List<Integer> ss = sm.spiralOrder(m);
//		for(int s : ss){
//			System.out.println(s);
//		}
		
		sm.generateMatrix(2);
	}

}
