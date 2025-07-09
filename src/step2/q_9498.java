package step2;

import java.io.*;

public class q_9498 {


    /**
     * 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        int input = Integer.parseInt(br.readLine());
        if (input >= 90 && input <= 100 ){
            bw.write("A");
        } else if (input >= 80) {
            bw.write("B");
        } else if (input >= 70) {
            bw.write("C");
        } else if (input >= 60){
            bw.write("D");
        } else {
            bw.write("F");
        }

        bw.close();
        br.close();
        osw.close();
        isr.close();



    }


}
