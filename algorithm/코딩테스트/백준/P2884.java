package algorithm.코딩테스트.백준;

import java.io.*;
import java.util.StringTokenizer;
public class P2884  {
    public static void main(String [] args) throws IOException { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer((br.readLine()));
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        M -= 45;

        if (M < 0) {
            M += 60;
            H -= 1;
        }

        if (H < 0) {
            H += 24;
        }
        
        bw.write(H + " " + M);
        bw.newLine();
        bw.flush();

        br.close();
        bw.close();
        
    }
}