import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(new Scanner(System.in)).ifPresent(s -> Optional.of(s.nextInt()).ifPresent(n ->
            System.out.println(Stream.generate(s::next).limit(n)
                .filter(w -> Character.isDigit(w.charAt(0)) ? Integer.parseInt(w) < 18 : Set.of("ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE").contains(w))
                .count())));
    }
}





