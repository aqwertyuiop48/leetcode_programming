import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() instanceof String t && Integer.valueOf(s.nextInt()) instanceof Integer n
            ? t.chars().mapToObj(c -> String.valueOf((char) (Character.toLowerCase(c) - 'a' < n ? Character.toUpperCase(c) : Character.toLowerCase(c)))).collect(Collectors.joining()) : "");
    }
}

