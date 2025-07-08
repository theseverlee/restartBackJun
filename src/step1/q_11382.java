package step1;

import java.io.*;
import java.util.StringTokenizer;

public class q_11382 {

    /**
     * 꼬마 정민이는 이제 A + B 정도는 쉽게 계산할 수 있다. 이제 A + B + C를 계산할 차례이다!
     *
     * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 1012)이 공백을 사이에 두고 주어진다.
     *
     * 입력조건을 고려해야한다.
     * @param args
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        StringTokenizer st = new StringTokenizer(br.readLine());
        long result = 0;
        long count = st.countTokens();
        for (long i = count; i > 0; i--) {
//        System.out.println(st.countTokens());
            result += Long.parseLong(st.nextToken());
        }
        bw.write(String.valueOf(result));



        bw.close();
        br.close();
        osw.close();
        isr.close();




    }


}
