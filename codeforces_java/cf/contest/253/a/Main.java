import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && Integer.valueOf(s.nextInt()) instanceof Integer n && Integer.valueOf(s.nextInt()) instanceof Integer m
            && Character.valueOf(n > m ? 'B' : 'G') instanceof Character f && Character.valueOf(n > m ? 'G' : 'B') instanceof Character o
            ? IntStream.range(0, 2 * Math.min(n, m)).mapToObj(i -> String.valueOf(i % 2 == 0 ? f : o)).collect(Collectors.joining())
                + String.valueOf(f).repeat(Math.abs(n - m)) : "");
    }
}
