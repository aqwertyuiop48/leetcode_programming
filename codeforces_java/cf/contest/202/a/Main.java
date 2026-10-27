import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            && Integer.valueOf(s.chars().max().getAsInt()) instanceof Integer mx
            ? s.chars().filter(c -> c == mx).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()) : "");
    }
}

