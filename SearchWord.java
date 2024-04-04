
// 79 question leetcode
// using backtracking and DFS
class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        boolean isVisited[][] = new boolean[row][col];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(search(board, word, i, j, "", isVisited, 0))
                        return true;
                }
            }
        }
        return false;
    }

    static boolean search(char board[][], String word, int row, int col, String s, boolean isVisited[][], int index) {
        if(index == word.length()) return true;
        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || isVisited[row][col] || board[row][col] != word.charAt(index)) {
            return false;
        }
        isVisited[row][col] = true;
        s += board[row][col];
        boolean found = search(board, word, row + 1, col, s, isVisited, index + 1) ||
                        search(board, word, row - 1, col, s, isVisited, index + 1) ||
                        search(board, word, row, col + 1, s, isVisited, index + 1) ||
                        search(board, word, row, col - 1, s, isVisited, index + 1);
        isVisited[row][col] = false;
        return found;
    }
}
