package DataStructure.JavaArrays.Array;


public class TransposeMatrix {

    public int [][] transposeMatrix(int[][]matrix){
        int row = matrix.length;
        int column= matrix[0].length;
        int [][]tMatrix = new int [column][row];
        for(int i = 0;i<row;i++){
            for (int j =0;j < column;j++){
                tMatrix[j][i] = matrix[i][j];
            }
        }
        return tMatrix;
    }
    public static void main(String [] args){
        TransposeMatrix tm = new TransposeMatrix();
        ArrayManipulation am = new ArrayManipulation();
        int[][] matrix = am.createArray();
        int [][] transposeMatrix = tm.transposeMatrix(matrix);
        am.displayArrayData(transposeMatrix);

    }

}
