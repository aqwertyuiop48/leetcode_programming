import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && s.next() != null
            ? Pattern.compile("([LR])([.]*)(?=([LR]))").matcher("L" + s.next() + "R").results()
                .mapToInt(r -> r.group(1).equals("L") && r.group(3).equals("R") ? r.group(2).length() : r.group(1).equals("R") && r.group(3).equals("L") ? r.group(2).length() % 2 : 0).sum() : 0);
    }
}
