import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner sc
            && Integer.valueOf(sc.nextInt()) instanceof Integer n
            && Stream.generate(sc::next).limit(n).toList() instanceof List<String> ins
            ? (ins.stream().filter(s -> s.length() == 4 || (s.contains("U") && s.contains("L")) || (s.contains("D") && s.contains("R"))).count() + 1)
                * (ins.stream().filter(s -> s.length() == 4 || (s.contains("U") && s.contains("R")) || (s.contains("D") && s.contains("L"))).count() + 1)
            : 0);
    }
}
