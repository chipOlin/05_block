public class passByValue {
    public static void main(String[] args) {
        int x = 3;
        doStuff (x);
        System.out.println("x = " + x);

        Cat A = new Cat ();
        doStuffCat(A);
        System.out.println("Cat A.variable = " + A.variable);
    }

    private static void doStuffCat(Cat B) {
        B.variable += 3;
        System.out.println("Cat B.variable = " + B.variable);
    }

    private static void doStuff(int y) {
        y += 7;
        System.out.println("y = " + y);
    }

    private static class Cat {
        int variable = 5;
    }
}
