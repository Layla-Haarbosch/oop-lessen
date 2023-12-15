package O6_1;

public class Main {
    public static void main(String[] args) {
        String s1 = "route" + 6 + 6;
        String s2 = 6 + 6 + "route";
        String s3 = "concert" + "piano";
        String s4 = "concertpiano";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.length());
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println(s4.charAt(0));

        String s5 = "boom";
        String s6 = "roos";

        System.out.println(s5.compareTo(s6));
    }
}
