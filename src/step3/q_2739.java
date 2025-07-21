package step3;

import java.io.*;

public class q_2739 {


    public static void main(String[] args) throws IOException {


        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        BufferedReader br = new BufferedReader(isr);
        BufferedWriter bw = new BufferedWriter(osw);



        int a = Integer.parseInt(br.readLine());
        for (int i = 1; i <=9; i++) {
            bw.write("" + a + " * " + i + " = " + (a*i) + "\n");
        }



        bw.close(); br.close(); osw.close(); isr.close();







    }


}
