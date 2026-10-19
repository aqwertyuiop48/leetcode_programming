import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && (s.startsWith("http") ? "http" : "ftp") instanceof String p
            && s.substring(p.length()) instanceof String rest
            && Integer.valueOf(rest.indexOf("ru", 1)) instanceof Integer idx
            ? p + "://" + rest.substring(0, idx) + ".ru" + (rest.length() > idx + 2 ? "/" + rest.substring(idx + 2) : "") : "");
    }
}
