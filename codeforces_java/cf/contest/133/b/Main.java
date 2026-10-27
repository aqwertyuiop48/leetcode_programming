import java.util.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in).nextLine()).ifPresent(s -> System.out.print(s.chars().filter(c -> "><+-.,[]".indexOf(c) >= 0).reduce(0, (v, c) -> (v * 16 + "><+-.,[]".indexOf(c) + 8) % 1000003)));
    }
}

