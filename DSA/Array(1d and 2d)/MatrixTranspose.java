import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = mat.length;
        int cols = mat[0].length;
        int[][] trans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = mat[i][j];
            }
        }

        for (int i = 0; i < trans.length; i++) {
            for (int j = 0; j < trans[0].length; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
