import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();
        boolean u = false, l = false, d = false;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) u = true;
            else if (Character.isLowerCase(c)) l = true;
            else if (Character.isDigit(c)) d = true;
        }
        System.out.println(s.length() >= 5 && u && l && d ? "Correct" : "Too weak");
    }
}
