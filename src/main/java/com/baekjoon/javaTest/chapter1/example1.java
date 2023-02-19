package com.baekjoon.javaTest.chapter1;

import java.util.Scanner;

public class example1 {
    /*
    * 문제
    * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
    * */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //입력할 숫자의 개수
        int number = scanner.nextInt();

        //입력한 값
        String sNumber = scanner.next();
        //입력한 값(String)을 숫자로 변환
        char[] cNumber = sNumber.toCharArray();

        int sum = 0;
        for(int i=0; i<cNumber.length; i++){
            sum += cNumber[i] - '0';
            /*
            * 문자 코드와 숫자 코드의 값 차이는 48이다.
            * ex) 문자 1 = 아스키코드 값 49이므로 문자 '1'을 숫자 1로 변경하려면 '1' - 48 또는 '1' - '0'으로 연산해야 한다.
            * */
        }
        System.out.println(sum);
    }
}
