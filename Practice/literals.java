public class literals {
    public static void main(String[] args) {
        String s1= "krishna";
        String s2= "krishna";
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        String x1= new String("krishna");
        String x2= new String("krishna");
        System.out.println(System.identityHashCode(x1));
        System.out.println(System.identityHashCode(x2));

    }
}
