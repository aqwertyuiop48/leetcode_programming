import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Scanner(System.in) instanceof Scanner s && (Integer) s.nextInt() instanceof Integer n
            && "zero one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen".split(" ") instanceof String[] small
            && "x x twenty thirty forty fifty sixty seventy eighty ninety".split(" ") instanceof String[] tens
            ? n < 20 ? small[n] : tens[n / 10] + (n % 10 == 0 ? "" : "-" + small[n % 10]) : "");
    }
}
