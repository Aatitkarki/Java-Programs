package Assignment;

// consider all matrix has uniform number of columns in all cases
public class MatrixChallenge {

    /*
        build and return identity matrix of given row and column
        Note: If you don't know about identity matrix, search it in your favorite search engine
              If you cannot build identity matrix with given number of row and column, return null
     */
    public static int[][] buildIdentityMatrix(int row, int col) {
        if (row <= 0 || col <= 0) return null;
        // to be done by student
        if (row != col) return null;
        int[][] result = new int[row][col];
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (i == j) result[i][j] = 1;
            }
        }
        return result;
    }

    // return true if given matrix is a square matrix, false otherwise
    // Constraint: assume, the number of columns are uniform for all rows
    public static boolean isSquareMatrix(int[][] matrix) {
        // to be done by student
        int row = matrix.length;
        for (int i = 0; i < row; ++i) {
            if (matrix[i].length != row) return false;
        }
        return true;
    }

    // return true if given matrix is upper triangular matrix, false otherwise
    public static boolean isUpperTriangularMatrix(int[][] matrix) {
        // to be done by student
        if (!isSquareMatrix(matrix)) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 1; i < row; ++i) {
            for (int j = 0; j < col-1; ++j) {
                if (j == i) break;
                if (matrix[i][j] == 0) continue;
                else return false;
            }
        }
        return true;
    }

    // return true if given matrix is lower triangular matrix, false otherwise
    public static boolean isLowerTriangularMatrix(int[][] matrix) {
        // to be done by student
        if (!isSquareMatrix(matrix)) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row-1; ++i) {
            for (int j = 1; j < col; ++j) {
                if (i >= j) continue;
                if (matrix[i][j] == 0) continue;
                else return false;
            }
        }
        return true;
    }

    // return specific row from a matrix (if possible), otherwise return null
    // Note: row number starts from 1 (for the user), meaning row = 1 is actually index 0
    // So, getRow(matrix, 1) means getRow of matrix at index 0
    public static int[] getRow(int[][] matrix, int row) {
        // to be done by student
        if (matrix.length < row) return null;
        row -= 1;
        int[] temp = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; ++i)
            temp[i] = matrix[row][i];
        return temp;
    }

    // return specific column from a matrix (if possible), otherwise return null
    // Note: col number starts from 1 (for the user), meaning col = 1 is actually index 0
    // So, getCol(matrix, 1) means getCol of matrix at index 0
    public static int[] getColumn(int[][] matrix, int col) {
        // to be done by student
        if (matrix[0].length < col) return null;
        col -= 1;
        int[] temp = new int[matrix.length];
        for (int i = 0; i < matrix.length; ++i)
            temp[i] = matrix[i][col];
        return temp;
    }

    // replace all occurrence of initialValue with finalValue
    /*
        Example: matrix = [1,2,3]
                          [4,3,6]
                 replace(matrix, 3, 10)
                 new matrix = [1,2,10]
                              [4,10,6]
     */
    public static void replace(int[][] matrix, int initialValue, int finalValue) {
        // to be done by student
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (matrix[i][j] == initialValue)
                    matrix[i][j] = finalValue;
            }
        }
    }

    /***********************************ALL THE BEST***************************************/

    public static void main(String[] args) {
        int[][] mat1 = buildIdentityMatrix(2,2);
        printMatrix(mat1);
        int[][] mat2 = buildIdentityMatrix(5, 5);
        printMatrix(mat2);
        int[][] mat3 = buildIdentityMatrix(10, 10);
        printMatrix(mat3);
        int[][] mat4 = buildIdentityMatrix(10,5); // NULL
        printMatrix(mat4);

        System.out.println(isSquareMatrix(mat1)); // true
        System.out.println(isSquareMatrix(mat3)); // true
        int[][] m1 = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println(isSquareMatrix(m1)); // true
        int[][] m2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(isSquareMatrix(m2)); // false

        int[][] matrix = {{1,2,3,4}, {0,1,2,3}, {0,0,1,2}, {0,0,0,1}};
        System.out.println(isUpperTriangularMatrix(matrix)); // true
        System.out.println(isUpperTriangularMatrix(mat3)); // true
        int[][] matrix1 = {{1,2,3}, {0,1,2}, {1,2,3}};
        System.out.println(isUpperTriangularMatrix(matrix1)); // false

        int[][] matrix2 = {{1,0,0}, {1,1,0}, {1,2,3}};
        System.out.println(isLowerTriangularMatrix(matrix2)); // true
        System.out.println(isLowerTriangularMatrix(mat1)); // true
        int[][] matrix3 = {{1,0,0,0}, {1,2,0,0}, {1,2,3,0}, {1,2,3,4}};
        System.out.println(isLowerTriangularMatrix(matrix3)); // true
        int[][] matrix4 = {{1,0,0}, {1,0,2}, {12,13,14}};
        System.out.println(isLowerTriangularMatrix(matrix4)); // false

        printMatrix(getRow(matrix3, 4)); // 1 2 3 4
        printMatrix(getRow(matrix3, 5)); // NULL
        printMatrix(getRow(m1, 2)); // 4 5 6

        printMatrix(getColumn(matrix3, 3)); // 0 0 3 3
        printMatrix(getColumn(matrix3, 5)); // NULL
        printMatrix(getColumn(matrix4, 1)); // 1 1 12

        replace(matrix4, 0, 10);
        printMatrix(matrix4);
        replace(matrix2, 1, 7);
        printMatrix(matrix2);
    }

    private static void printMatrix(int[][] mat) {
        if (mat == null) {
            System.out.println("NULL");
            return;
        }
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    private static void printMatrix(int[] val) {
        if (val == null) {
            System.out.println("NULL");
            return;
        }
        System.out.print("[ ");
        for (int a: val)
            System.out.print(a + " ");
        System.out.print("]\n");
    }
}
