package com.example.myFirstJavaPackage.classes.nestedClasses.localInnerClass;

/*
* Such classes are used very rarely
 */
public class LocalInner1 {

    public static void main(String[] args) {

        Math math = new Math();
        math.getRusult();
        // Division division Cannot resolve symbol 'Division'
    }
}

class Math {

    private String privateString = "Secret";

    public void getRusult() {

        int abcde = 5;

        class Division {

            private int divisible;
            private int divider;

            public int getDivisible() {
                // abcde = 12; Error: Variable 'abcde' is accessed from within inner class, needs to be final or effectively final
                // Division class creates a copy of var 'abcde', so compiler says, that these copy must match the actual value,
                // so it must be final or effectively final.
                return divisible;
            }

            public void setDivisible(int divisible) {
                this.divisible = divisible;
            }

            public int getDivider() {
                return divider;
            }

            public void setDivider(int divider) {
                this.divider = divider;
            }

            public int getQuotient() {
                return divisible / divider;
            }
            public int getLeftover() {
                return divisible % divider;
            }
        }

        Division division = new Division();
        division.setDivisible(21);
        division.setDivider(4);
        System.out.println("Divisible = " + division.getDivisible());
        System.out.println("Divider = " + division.getDivider());
        System.out.println("Quotient = " + division.getQuotient());
        System.out.println("Leftover = " + division.getLeftover());
        System.out.println("Private String of Math class = " + privateString);
        // Local inner classes have access to private elements of its outer class
    }
}
