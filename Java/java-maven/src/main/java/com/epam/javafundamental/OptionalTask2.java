package com.epam.javafundamental;

import java.util.Random;

public class OptionalTask2 {

    public static int[][] createMatrix(int rows, int columns, int bound){
        int[][] mat = new int[rows][columns];
        Random rand = new Random();//to generate random numbers.
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                mat[i][j]=rand.nextInt(bound);
            }
        }
        return mat;
    }

    public static void sortColumn(int array[][], int e) {
        for (int i = 0; i < array.length; i++)
            for (int k = i + 1; k < array[0].length; k++) {
                if (array[i][e] > array[k][e]) {
                    for (int j = 0; j < array[0].length; j++) {
                        int temp = array[i][j];
                        array[i][j] = array[k][j];
                        array[k][j] = temp;
                    }
                }
            }
    }

    private static void printMatrix(int[][] matrix) {
        for(int i = 0; i< matrix.length; i++)
        {
            for(int j = 0; j< matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getMaxValue(int[][] numbers) {
        int maxValue = numbers[0][0];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }

    public static int[][] replaceValue(int[][] numbers, int value, int newValue) {
        for (int j = 0; j < numbers.length; j++) {
            for (int i = 0; i < numbers[j].length; i++) {
                if (numbers[j][i] == value) {
                    numbers[j][i] = newValue;
                }
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        //Create multi dimension array and print.
        int rows=3, columns=3, bound=10, col = 2, newValue=0;
        int[][] matrix = createMatrix(rows,columns, bound);
        printMatrix(matrix);

        //4 . Find the maximum element in a matrix and remove all rows and columns from the matrix that contain it

        int maxValue = getMaxValue(matrix);
        System.out.println("Max value from array: "+ maxValue);
        System.out.println(String.format("Replace %s with %s",maxValue, newValue));
        replaceValue(matrix, maxValue, newValue);
        printMatrix(matrix);

        //1. Arrange the rows (columns) of the matrix in ascending order of the values of the elements of the k-th column (row).

        System.out.println("Sort Matrix based on column: "+ col);
        sortColumn(matrix,col-1);
        printMatrix(matrix);


    }
}
