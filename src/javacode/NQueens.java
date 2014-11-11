package javacode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
	
	public int totalNQueens(int n) {
        int[] total = {0};
        if(n < 1)
            return total[0];
        int[] columnVal = new int[n];
        totalNQueens(n, 0, total, columnVal);
        return total[0];
	}

    public void totalNQueens(int n, int row, int[] total, int[] columnVal){
        if(row == n)
            total[0] += 1;
        else{
            for(int i = 0; i < n; i ++){
            	//columnVal[row] = i;
                if(validPos(row, i, columnVal)){
                    columnVal[row] = i;
                    totalNQueens(n, row + 1, total, columnVal);
                }
            }
        }
    }
    
    public boolean validPos(int row, int col, int[] columnVal){
        if(row == 0)
            return true;
        for(int i = 0; i < row; i ++){
            if(columnVal[i] == col || Math.abs(col - columnVal[i]) == row - i)
                return false;
        }
        return true;
    }
    
    
	
	public List<String[]> solveNQueens(int n) {
		List<String[]> res = new ArrayList<String[]>();
		if (n < 1)
			return res;
		char[] row = new char[n];
		Arrays.fill(row, '.');
		String[] nQueen = new String[n];
		Arrays.fill(nQueen, String.valueOf(row));
		solveNQueens(n, 0, res, nQueen);
		return res;
	}

	public void solveNQueens(int n, int rowIndex, List<String[]> res,
			String[] nQueen) {
		if (rowIndex == n)
			res.add(nQueen.clone());
		else {
			for (int i = 0; i < n; i++) {
				if (validPos(n, rowIndex, i, nQueen)) {
					nQueen[rowIndex] = nQueen[rowIndex].substring(0, i) + 'Q'
							+ nQueen[rowIndex].substring(i + 1);
					solveNQueens(n, rowIndex + 1, res, nQueen);
					nQueen[rowIndex] = nQueen[rowIndex].substring(0, i) + '.'
							+ nQueen[rowIndex].substring(i + 1);
				}
			}
		}
	}

	public boolean validPos(int n, int row, int col, String[] nQueen){
        if(row == 0)
            return true;
        for(int i = 0; i < row; i ++){
            int diff = row - i;
            if(nQueen[i].charAt(col) == 'Q' || 
                (col - diff >= 0 && nQueen[i].charAt(col - diff) == 'Q') || 
                (col + diff < n && nQueen[i].charAt(col + diff) == 'Q'))
                return false;
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueens nq = new NQueens();
		List<String[]> queens = nq.solveNQueens(4);
//		System.out.println(queens);
		for(String[] queen : queens){
			for(String q : queen){
				System.out.println(q + ",");
			}
			System.out.println();
		}
	}

}
