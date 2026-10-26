import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? (1L << s.length()) - 1 + Long.parseLong(s.replace('4', '0').replace('7', '1'), 2) : 0);
    }
}
