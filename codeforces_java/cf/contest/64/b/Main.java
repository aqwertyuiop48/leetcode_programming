import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
        Optional.of(Pattern.compile("\\s*(\\d+)\\s*([+-])\\s*(\\d+)\\s*").matcher(new Scanner(System.in).nextLine())).filter(Matcher::matches).ifPresent(mt ->
            System.out.println(mt.group(2).equals("+") ? Long.parseLong(mt.group(1)) + Long.parseLong(mt.group(3)) : Long.parseLong(mt.group(1)) - Long.parseLong(mt.group(3))));
    }
}



