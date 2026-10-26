import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? new StringBuilder(s.substring(0, s.length() / 2)).reverse().append(new StringBuilder(s.substring(s.length() / 2)).reverse()).toString() : "");
    }
}
