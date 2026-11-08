public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println(new String(System.in.readAllBytes()).trim().split("\\s+") instanceof String[] t
            && Double.valueOf(Double.parseDouble(t[0])) instanceof Double n && Double.valueOf(Double.parseDouble(t[1])) instanceof Double r
            ? String.format(java.util.Locale.US, "%.12f", n * r * r * Math.sin(Math.PI / n) * Math.sin(Math.PI / (2 * n)) / Math.sin(3 * Math.PI / (2 * n))) : "");
    }
}
