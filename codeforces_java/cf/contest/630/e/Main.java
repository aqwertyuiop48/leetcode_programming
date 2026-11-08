public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Long.valueOf(Long.parseLong(t[2]) - Long.parseLong(t[0])) instanceof Long dx && Long.valueOf(Long.parseLong(t[3]) - Long.parseLong(t[1])) instanceof Long dy
            ? (dx / 2 + 1) * (dy + 1) - (dy + 1) / 2 : 0);
    }
}
