package step1;

import java.io.*;
import java.util.StringTokenizer;

public class q_10430 {

    /**
     * (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
     *
     * (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
     *
     * 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
     * @param args
     */
    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

//        boolean flag1 = (A+B)%C == ((A%C) + (B%C))%C;
//        boolean flag2 = (A*B)%C == ((A%C) * (B%C))%C;

        bw.write(String.valueOf((A+B)%C) +"\n");
        bw.write(String.valueOf(((A%C) + (B%C))%C) +"\n");
        bw.write(String.valueOf((A*B)%C) +"\n");
        bw.write(String.valueOf(((A%C) * (B%C))%C));

        bw.close(); 
        br.close();
        osw.close();
        isr.close();

    }


}
