package com.baekjoon.javaTest.chapter1;

import java.util.Scanner;

public class exmaple {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //입력할 과목 수
        int subjectNumber = scanner.nextInt();
        //각 과목 점수
        int subjectScore[] = new int[subjectNumber];

        //입력한 과목수만큼 점수 입력할 수 있도록 함
        for(int i = 0; i < subjectNumber; i++){
            subjectScore[i] = scanner.nextInt();
        }

        long sum = 0;
        long max = 0;

        for(int i = 0; i < subjectNumber; i++){
            if(subjectScore[i] > max) max = subjectScore[i];
            sum += subjectScore[i];
        }

        //총합 * 100 / 최고점수 / 과목 수
        System.out.println(sum * 100.0 / max / subjectNumber);
    }
}
