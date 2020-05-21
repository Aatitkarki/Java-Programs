package DataStructure.JavaArrays;
import java.util.Scanner;

public class ArrayManipulation {

    public int[][] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of row for array: ");
        int row = sc.nextInt();
        System.out.print("Enter the length of column for array: ");
        int column = sc.nextInt();
        int [][] array = new int[row][column];
        for (int i =0;i < row;i++){
            System.out.print("Enter the data of row "+ i+" :");
            for(int j =0; j<column;j++){
                array[i][j]=sc.nextInt();
            }
        }
        return array;
    }

    public void displayArrayData(int [] [] arrays){
        int row = arrays.length;
        int column = arrays[0].length;
        for (int i = 0 ;i < row;i++){
            for (int j = 0;j< column;j++){
                System.out.print(arrays[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void arrayAddition(int[][] array1,int[][] array2){
        int rowOfArray1 = array1.length;
        int rowOfArray2 = array2.length;
        int columnOfArray1 = array1[0].length;
        int columnOfArray2 = array2[0].length;
        int [][] resultArray = new int[rowOfArray1][columnOfArray1];
        if(rowOfArray1 == rowOfArray2 && columnOfArray1 ==columnOfArray2){
            for (int i = 0;i< rowOfArray1;i++){
                for(int j=0;j<columnOfArray1;j++){
                    resultArray[i][j] = array1[i][j] + array2[i][j];
                }
            }
            displayArrayData(resultArray);
        }else{
            System.out.print("You cannot add two matrix of different number of rows and columns");
        }

    }

    public void arraySubtraction(int[][] array1,int[][] array2){
        int rowOfArray1 = array1.length;
        int rowOfArray2 = array2.length;
        int columnOfArray1 = array1[0].length;
        int columnOfArray2 = array2[0].length;
        int[][] resultArray = new int[rowOfArray1][columnOfArray2];

        if(rowOfArray1 == rowOfArray2 && columnOfArray1 == columnOfArray2){
            for(int i =0; i<rowOfArray1;i++){
                for (int j =0;j<columnOfArray1;j++){
                    resultArray[i][j] = array1[i][j]-array2[i][j];
                }
            }
            displayArrayData(resultArray);
        }else{
            System.out.print("Cannot subtract two matrices with different number of rows and columns");
        }
    }

    public void arrayMultiplication(int[][] array1,int[][] array2) {
        int rowOfArray1 = array1.length;
        int rowOfArray2 = array2.length;
        int columnOfArray1 = array1[0].length;
        int columnOfArray2 = array2[0].length;
        int[][] resultArray = new int[rowOfArray1][columnOfArray2];

        if(columnOfArray1 == rowOfArray2){
            int k = 0;
            while(k<rowOfArray1){
                for(int i = 0; i<columnOfArray2;i++){
                    System.out.println("value of i: "+i);
                    int multipliedValue = 0;
                    for(int j =0; j<columnOfArray1;j++){
                        System.out.println("value of j: "+j);
                        System.out.println("value of k: "+k);
                        multipliedValue += (array1[k][j] * array2[j][i]);
                        System.out.println(multipliedValue);
                    }
                    System.out.println(multipliedValue +" is added");
                    System.out.print("");
                    resultArray[k][i] = multipliedValue;
                }
                k++;
            }

            displayArrayData(resultArray);

        }else{
            System.out.println("Two multiply two matrices the column of first matrix must be equal to row of second matrix");
        }

    }
    public static void main(String args[]){
        ArrayManipulation am = new ArrayManipulation();
        int [] [] first2dArray = am.createArray();
        int [] [] second2dArray = am.createArray();
        System.out.print("What operation do you want to perform: ");
        System.out.print("Press 1 to add,2 to subtract and 3 to multiply: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num==1){
            System.out.print("The result of addition is: ");
            System.out.println();
            am.arrayAddition(first2dArray,second2dArray);

        }else if(num == 2){
            System.out.print("The result of subtraction is: ");
            System.out.println();
            am.arraySubtraction(first2dArray,second2dArray);

        }else if(num == 3){
            System.out.print("The result of multiplication is: ");
            System.out.println();
            am.arrayMultiplication(first2dArray,second2dArray);
        }

    }
}
