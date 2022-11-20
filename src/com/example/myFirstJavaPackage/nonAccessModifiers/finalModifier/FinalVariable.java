package com.example.myFirstJavaPackage.nonAccessModifiers.finalModifier;

public class FinalVariable {

    public final int a = 15;

    public void abc(final short s) {
        // Note: we can do so only in methods OR in all the constructors:
        final byte b;
        b = 10;
        System.out.println(s + b);
    }

    public static void main(String[] args) {

        FinalVariable finalVariable = new FinalVariable();
        System.out.println(finalVariable.a);
    }

    /*
        // No errors if we assign value to final var
        // not in the beginning, but in every constructor
        // Note: only if var in not static

        public final int a;

        FinalVariable() {
            a = 10;
        }
        FinalVariable(boolean b) {
            a = 15;
        }

        public static void main(String[] args) {

            FinalVariable finalVariable = new FinalVariable();
            System.out.println(finalVariable.a);
        }
    */
}
