import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Integer.valueOf(it.next()) instanceof Integer n
            ? IntStream.range(0, n).mapToObj(i -> java.time.LocalDate.parse(it.next())).filter(d -> d.getDayOfMonth() == 13 && d.getDayOfWeek() == java.time.DayOfWeek.FRIDAY).count() : "");
    }
}
