package step1;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class q_10926 {

    /**
     * 준하는 사이트에 회원가입을 하다가 joonas라는 아이디가 이미 존재하는 것을 보고 놀랐다. 준하는 놀람을 ??!로 표현한다.
     * 준하가 가입하려고 하는 사이트에 이미 존재하는 아이디가 주어졌을 때, 놀람을 표현하는 프로그램을 작성하시오.
     *
     * sacnner 보단 bufferd class 가 더빠르다 더 많은 데이터를 처리 할 수 록 빠른처리결과
     * @param args
     */
    public static void main(String[] args) throws IOException {

//        Scanner s =  new Scanner(System.in);
//        String name = s.nextLine();
//        System.out.println(name + "??!");

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(st.nextToken() + "??!");

        bw.close();
        br.close();
        osw.close();
        isr.close();
    }


}
