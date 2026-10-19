import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in).next() instanceof String s
            ? IntStream.concat(IntStream.range(0, s.length()).filter(i -> s.charAt(i) == 'r'), IntStream.range(0, s.length()).map(i -> s.length() - 1 - i).filter(i -> s.charAt(i) == 'l')).mapToObj(i -> String.valueOf(i + 1)).collect(Collectors.joining("\n")) : "");
    }
}
