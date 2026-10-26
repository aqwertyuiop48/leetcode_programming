import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? IntStream.range(0, s.length()).mapToObj(i -> String.valueOf(i == 0 && s.charAt(0) == '9' ? 9 : Math.min(s.charAt(i) - '0', 9 - (s.charAt(i) - '0')))).collect(Collectors.joining()) : "");
    }
}
