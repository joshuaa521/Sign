public class Main {
    public static void main(String[] args) {
        Sign sign = new Sign("ABC222DE", 3);
        Sign sign2 = new Sign("ABCD", 10);
        Sign sign3 = new Sign("ABCDEF", 6);
        Sign sign4 = new Sign("", 4);
        Sign sign5 = new Sign("AB_CD_EF", 2);
        System.out.println(sign.numberOfLines());
        System.out.println(sign2.numberOfLines());
        System.out.println(sign3.numberOfLines());
        System.out.println(sign4.numberOfLines());
        System.out.println(sign5.numberOfLines());
        System.out.println(sign.getLines());
        System.out.println(sign2.getLines());
        System.out.println(sign3.getLines());
        System.out.println(sign4.getLines());
        System.out.println(sign5.getLines());
    }
}