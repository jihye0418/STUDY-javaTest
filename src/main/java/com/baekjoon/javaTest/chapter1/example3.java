package com.baekjoon.javaTest.chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class example3 {
    /*
    * 문제
    * 수 N개가 주어졌을 때 i번째 수에서 j번째 수까지의 합을 구하는 프로그램
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //데이터의 개수(number), 질의 개수(count)
        int number = scanner.nextInt();
        int count = scanner.nextInt();

        long[] arr = new long[number+1];

        //합 배열 생성
        for(int i=1; i<=number; i++){
            arr[i] = arr[i-1] + scanner.nextInt();
        }

        for(int j=0; j<count; j++){
            //구간의 합 시작(start), 구간의 합 끝(end)
            int start = scanner.nextInt();
            int end = scanner.nextInt();
            System.out.println(arr[end] - arr[start-1]);
        }
    }
}
