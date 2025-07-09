package step2;

import java.io.*;
import java.util.StringTokenizer;

public class q_1330 {

    /**
     * 두 수 비교하기****
     * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
     *
     * 입력
     * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
     *
     * 출력
     * 첫째 줄에 다음 세 가지 중 하나를 출력한다.
     *
     * A가 B보다 큰 경우에는 '>'를 출력한다.
     * A가 B보다 작은 경우에는 '<'를 출력한다.
     * A와 B가 같은 경우에는 '=='를 출력한다.
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String result = "";
        if (a > b){
            result = ">";
        } else if (a < b){
            result = "<";
        } else {
            result = "==";
        }
        bw.write(result);


        bw.close();
        br.close();
        osw.close();
        isr.close();




    }

}
