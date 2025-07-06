package step1;

import java.util.Scanner;

public class q_1001 {

    /**
     * A - B 사칙연산 2번째
     * @param args
     */

    /**
     * 값을 입력 받고 해당값을 연산
     * @param args
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String num = s.nextLine();
        String[] arr = num.split(" ");

        int result = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr.length-1 == i){
                result -= Integer.parseInt(arr[i]);
            } else {
                result += Integer.parseInt(arr[i]);
            }
        }
        System.out.println(result);




    }

}
