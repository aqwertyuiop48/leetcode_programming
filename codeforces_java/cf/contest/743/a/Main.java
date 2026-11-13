public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("[ \\n\\r\\t]+") instanceof String[] t
            ? (t[3].charAt(Integer.parseInt(t[1]) - 1) == t[3].charAt(Integer.parseInt(t[2]) - 1) ? 0 : 1) : 0);
    }
}
