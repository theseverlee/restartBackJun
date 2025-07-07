package step1;

import java.io.*;
import java.util.StringTokenizer;

public class q_2588 {

    /**
     * (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
     *        472   1
     *     x  385   2
     *     -------
     *       2360   3
     *      3776    4
     *     1416     5
     *     ------
     *     181720   6
     * (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
     * @param args
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a1));
        bw.newLine();
        bw.write(String.valueOf(a1/100));
        bw.newLine();
        bw.write(String.valueOf(a1/10));
        bw.newLine();
        bw.write(String.valueOf(a1/1));

        bw.newLine();
        bw.write(String.valueOf(b1));



        bw.close();
        br.close();
        osw.close();
        isr.close();





    }


}
