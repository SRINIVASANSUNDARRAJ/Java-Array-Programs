package array;
import java.util.*;
public class GameXOX {
        public static char[][] board = new char[3][3];
        public static char currentPlayer = 'X';
        public static boolean gameOver = false;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            initializeBoard();

            while (!gameOver) {
                printBoard();
                playerMove(sc);
                checkGameStatus();
                switchPlayer();
            }
            sc.close();
        }
        public static void initializeBoard() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    board[i][j] = ' ';
                }
            }
        }
        public static void printBoard() {
            for (int i = 0; i < 3; i++) {
                System.out.print("| ");
                for (int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void playerMove(Scanner scanner) {
            int row, col;
            boolean validMove = false;

            while (!validMove) {
                System.out.println("Player " + currentPlayer + ", enter row and column (0, 1, or 2) separated by space:");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ') {
                    board[row][col] = currentPlayer;
                    validMove = true;
                } else {
                    System.out.println("Invalid move! Try again.");
                }
            }
        }
        public static void checkGameStatus() {
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                gameOver = true;
            } else if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                gameOver = true;
            }
        }
        public static boolean checkWin() {
            for (int i = 0; i < 3; i++) {
                if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                    return true;
                }
                if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                    return true;
                }
            }
            if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
                return true;
            }
            if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
                return true;
            }
            return false;
        }
        public static boolean isBoardFull() {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        return false;
                    }
                }
            }
            return true;
        }
        public static void switchPlayer() {
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

