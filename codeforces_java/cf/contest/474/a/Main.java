import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.next().charAt(0)).ifPresent(d -> Optional.of("qwertyuiopasdfghjkl" + (char) 59 + "zxcvbnm,./").ifPresent(kb -> System.out.print(s.next().chars().mapToObj(c -> String.valueOf(kb.charAt(kb.indexOf(c) + (d == 'R' ? -1 : 1)))).collect(Collectors.joining())))));
    }
}
