import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s ? Character.toUpperCase(s.charAt(0)) + s.substring(1) : "");
    }
}
