package back0706_0712;

import java.util.Scanner;

public class q_1008 {

    /**
     * 1008번 a/b
     * 몫을 구하는 문제
     *
     * 연산처리시에는 고려해야할점들이 있다.
     * 특히 숫자의 경우 타입을 지정하기 떄문에 확인을 해야한다.
     *
     * 정말 정밀한 계산이 필요한경우에는 BigDecimal 이라는 타입을 사용하자
     * @param args
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Double result = 0.0;

        result = s.nextDouble() / s.nextDouble();

        System.out.println(result);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MAX_VALUE+1);
//        System.out.println(Integer.MIN_VALUE);


    }

}
