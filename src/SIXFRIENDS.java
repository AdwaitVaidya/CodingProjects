import java.io.*;
import java.util.StringTokenizer;

public class SIXFRIENDS {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(input.readLine());

        for (int t = 0;t<tc;t++ ){
            StringTokenizer sT = new StringTokenizer(input.readLine());
            int X = Integer.parseInt(sT.nextToken());
            int Y = Integer.parseInt(sT.nextToken());
            System.out.println(String.valueOf(Math.min(3*X,2*Y))+"\n");
            //fw.append();
        }
        input.close();

    }
}
