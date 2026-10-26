import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? s.indexOf("AB") >= 0 && s.indexOf("BA", s.indexOf("AB") + 2) >= 0 || s.indexOf("BA") >= 0 && s.indexOf("AB", s.indexOf("BA") + 2) >= 0 ? "YES" : "NO" : "");
    }
}
