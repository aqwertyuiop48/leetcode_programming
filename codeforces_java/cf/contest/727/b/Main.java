import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new Scanner(System.in).nextLine().trim() instanceof String s
            && Long.valueOf(Pattern.compile("[0-9][0-9.]*").matcher(s).results().mapToLong(r -> r.group().length() >= 3 && r.group().charAt(r.group().length() - 3) == '.'
                ? Long.parseLong(r.group().substring(0, r.group().length() - 3).replace(".", "")) * 100 + Long.parseLong(r.group().substring(r.group().length() - 2))
                : Long.parseLong(r.group().replace(".", "")) * 100).sum()) instanceof Long tot
            ? String.valueOf(tot / 100).replaceAll("(?<=\\d)(?=(\\d{3})+$)", ".") + (tot % 100 > 0 ? String.format(".%02d", tot % 100) : "") : "");
    }
}
