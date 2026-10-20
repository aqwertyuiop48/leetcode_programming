import java.util.*;
import java.util.function.*;
import java.util.concurrent.atomic.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(new java.io.BufferedReader(new java.io.InputStreamReader(System.in)).lines().flatMap(l -> Collections.list(new StringTokenizer(l)).stream()).map(Object::toString).iterator() instanceof Iterator<String> it && Long.valueOf(it.next()) instanceof Long x && Long.valueOf(it.next()) instanceof Long y && Long.valueOf(it.next()) instanceof Long a && Long.valueOf(it.next()) instanceof Long b
            && Long.valueOf(x / java.math.BigInteger.valueOf(x).gcd(java.math.BigInteger.valueOf(y)).longValue() * y) instanceof Long l ? b / l - (a - 1) / l : "");
    }
}
