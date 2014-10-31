package java;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
        if(word == null || word.length() == 0)
            return true;
        if(board == null || board.length == 0 || board[0].length == 0)
            return false;
        boolean[][] visited = new boolean[board.length][board[0].length];
        for(int i = 0; i < board.length; i ++){
        	for(int j = 0; j < board[0].length; j ++){
        		if(exist(board, visited, i, j, word))
        			return true;
        	}
        }
        return false;
    }
    
    public boolean exist(char[][] board, boolean[][] visited, int rowId, int colId, String word){
        if(word.length() == 0)
            return true;
        if(rowId < 0 || colId < 0 || rowId >= board.length || colId >= board[0].length)
        	return false;
        if(visited[rowId][colId])
        	return false;
        if(board[rowId][colId] != word.charAt(0))
        	return false;
        visited[rowId][colId] = true;
        word = word.substring(1);
        boolean flag = exist(board, visited, rowId - 1, colId, word) || exist(board, visited, rowId + 1, colId, word)
           || exist(board, visited, rowId, colId - 1, word) || exist(board, visited, rowId, colId + 1, word);
        visited[rowId][colId] = false;  
        return flag;
    }
}
