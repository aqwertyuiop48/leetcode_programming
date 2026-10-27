import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).map(s -> s.nextLine().trim()).map(l -> IntStream.rangeClosed(1, 1440).map(i -> (Integer.parseInt(l.substring(0, 2)) * 60 + Integer.parseInt(l.substring(3, 5)) + i) % 1440).mapToObj(t -> String.format("%02d:%02d", t / 60, t % 60)).filter(x -> x.charAt(0) == x.charAt(4) && x.charAt(1) == x.charAt(3)).findFirst().get()).ifPresent(System.out::println);
    }
}

