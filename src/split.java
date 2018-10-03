public class split {
    public static void main(String args[]) {
        String Str = new String("Some text.su");

        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 2)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 3)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("-", 0)) {
            System.out.println(retval);
        }
        System.out.println();
        System.out.println("Возвращаемое значение: ");
        for (String retval : Str.split("\\.", 0)) {
            System.out.println(retval);
        }
    }
}
