import java.util.Scanner;

public class t2_10 {
    public static int getMax(int[][] matrix) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int max = matrix[0][0];
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static int getCountOfMax(int[][] matrix, int max) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int count = 0;
        for (int i = 0; i < len1; i++) {
            for (int j = 0; j < len2; j++) {
                if (max == matrix[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int[][] removerowcol(int[][] matrix, int row, int col) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        int[][] resMatr = new int[len1-1][len2-1];
        int p = 0;
        for( int i = 0; i < len1; ++i)
        {
            if ( i == row)
                continue;
            int q = 0;
            for( int j = 0; j < len2; ++j)
            {
                if ( j == col)
                    continue;
                resMatr[p][q] = matrix[i][j];
                ++q;
            }
            ++p;
        }
        return resMatr;
    }

    public static int[][] removeMaxRowCol(int[][] matrix, int max) {
        int len1 = matrix.length;
        int len2 = matrix[0].length;
        for(int row = 0; row < len1; row++) {
            for (int col = 0; col < len2; col++) {
                if(matrix[row][col] == max){
                    matrix = removerowcol(matrix,row,col);
                    len1 = matrix.length;
                    len2 = matrix[0].length;
                    if (row == len1 || col == len2){
                        break;
                    }
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int m, n, i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        m = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        n = scanner.nextInt();
        int[][] array = new int[m][n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < m; i++)
            for (j = 0; j < n; j++)
                array[i][j] = scanner.nextInt();
        System.out.println("Elements of the array are: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
        System.out.println("Max element is " + Integer.toString(getMax(array)));
        System.out.println("Count of that element is " + Integer.toString(getCountOfMax(array, getMax(array))));
        int[][] newArr = removeMaxRowCol(array,getMax(array));
        for (i = 0; i < newArr.length; i++) {
            for (j = 0; j < newArr[0].length; j++)
                System.out.print(newArr[i][j] + " ");
            System.out.println();
        }
    }
}
