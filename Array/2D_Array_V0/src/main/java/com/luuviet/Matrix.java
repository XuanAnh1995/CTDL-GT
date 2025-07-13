package com.luuviet;

import java.util.Random;

public class Matrix {

    int n;

    int[][] matrixA, matrixB;

    public Matrix(int n) {
        this.n = n;
        matrixA = new int[n][n];
        matrixB = new int[n][n];
        initValue();
    }

    public void initValue(){
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = r.nextInt(10);
                matrixB[i][j] = r.nextInt(10);
            }
        }
    }

    public void printMatrix(int[][] matrix){
        System.out.println("Matrix: -------------------------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrixA(){
        printMatrix(matrixA);
    }

    public void printMatrixB(){
        printMatrix(matrixB);
    }

    public int[][] sumMatrix(){
        int[][] sumMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return sumMatrix;
    }

    public int[][] multiplyMatrix(){
        int[][] multiplyMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    multiplyMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return multiplyMatrix;
    }


    public static void main(String[] args) {
        Matrix m = new Matrix(3);

        System.out.println("Ma trận A:");
        m.printMatrixA();

        System.out.println("Ma trận B:");
        m.printMatrixB();

        System.out.println("A + B = ");
        m.printMatrix(m.sumMatrix());
        System.out.println("-----------------------------");
        System.out.println("A * B = ");
        m.printMatrix(m.multiplyMatrix());

    }
}