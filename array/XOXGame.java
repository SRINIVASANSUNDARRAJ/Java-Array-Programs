package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.*;

public class XOXGame {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[][] a = new String[3][3];
        boolean loop = true;
        while (loop) {
            String player1 = matrix(a);
            printMatrix(a);
            String player2 = matrix(a);
            printMatrix(a);
            if (findWin(a)) {
                loop = false;
            }
        }
    }

    public static String matrix(String[][] a) {
        System.out.println("1. 0 row 1 st Column" +
                "\n2. 0 row 2 st Column" +
                "\n3. 0 row 3 st Column" +
                "\n4. 1 row 0 st Column" +
                "\n5. 1 row 1 st Column" +
                "\n6. 2 row 2 st Column" +
                "\n7. 2 row 0 st Column" +
                "\n8. 2 row 1 st Column" +
                "\n9. 2 row 2 st Column");
        System.out.print("Enter the Option :");
        int n = sc.nextInt();
        System.out.print("Choose any one(X/O) :");
        switch (n) {
            case 1: {
                a[0][0] = sc.next();
                break;
            }
            case 2: {
                a[0][1] = sc.next();
                break;
            }
            case 3: {
                a[0][2] = sc.next();
                break;
            }
            case 4: {
                a[1][0] = sc.next();
                break;
            }
            case 5: {
                a[1][1] = sc.next();
                break;
            }
            case 6: {
                a[1][2] = sc.next();
                break;
            }
            case 7: {
                a[2][0] = sc.next();
                break;
            }
            case 8: {
                a[2][1] = sc.next();
                break;
            }
            case 9: {
                a[2][2] = sc.next();
                break;
            }
            default:
                System.out.println("Choose the correct one");
        }
        return null;
    }

    public static boolean findWin(String[][] a) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i + j == 3 - 1) {
                    if (a[i][j] == "X") {
                        list.add("X");
                        if (list.size() == 3) {
                            return true;
                        }
                    } else if (a[i][j] == "O") {
                        list1.add("O");
                        if(list.size() == 3){
                            return true;
                        }
                    }
//                if (i == j) {
//                    if (a[i][j]=="X") {
//
//                    } else if (a[i][j]=="O") {
//                        return true;
//                    }
//                }
                }
            }

        }
        return false;
    }
    public static void printMatrix(String[][] a){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
