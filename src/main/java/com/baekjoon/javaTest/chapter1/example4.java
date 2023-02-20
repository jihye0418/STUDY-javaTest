package com.baekjoon.javaTest.chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class example4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        //2차원 배열의 크기
        int n = Integer.parseInt(stringTokenizer.nextToken());
        //질의 수
        int qna = Integer.parseInt(stringTokenizer.nextToken());

        //2차원 배열 만들기
        int[][] A = new int[n+1][n+1];

        //i는 세로
        for(int i = 1; i <=n; i++){
            //j는 가로
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            for(int j =1; j <= n; j++){
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
            System.out.println("A=>" + Arrays.deepToString(A));
        }

        //구간 합 배열 만들기
        int[][] D = new int[n+1][n+1];
        //i는 세로
        for(int i = 1; i <=n; i++){
            for(int j =1; j <= n; j++){
                //구간합
                D[i][j] = D[i][j-1] + D[i-1][j] - D[i-1][j-1] + A[i][j];
            }
        }
        System.out.println("D=>" + Arrays.deepToString(D));

        //원하는 부분의 합 구하기
        for(int i=0; i<qna; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            //구간 합
            int result = D[x2][y2] - D[x1-1][y2] - D[x2][y1-1]+ D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
