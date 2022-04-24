import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CHEAPFOOD {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(input.readLine());

        for (int t = 0;t<tc;t++ ){
            int X = Integer.parseInt(input.readLine());
            System.out.println(String.valueOf((int)Math.max(0.1*X,100.00)));
            //fw.append();
        }
        input.close();

    }
}
