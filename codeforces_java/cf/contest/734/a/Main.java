import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+")[1] instanceof String s
            && Long.valueOf(s.chars().filter(c -> c == 'A').count()) instanceof Long a
            ? (a * 2 > s.length() ? "Anton" : a * 2 < s.length() ? "Danik" : "Friendship") : "");
    }
}
