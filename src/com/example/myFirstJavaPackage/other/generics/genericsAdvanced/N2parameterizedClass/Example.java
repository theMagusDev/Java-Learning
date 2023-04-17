package com.example.myFirstJavaPackage.other.generics.genericsAdvanced.N2parameterizedClass;

class Info <T> { // T - type placeholder
    private T value;
    public Info(T value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return "{[ " + value + " ]}";
    }

    public T getValue() {
        return this.value;
    }
}

public class Example {
    public static void main(String[] args) {
        Info<String> stringInfo = new Info<>("Hello");
        System.out.println(stringInfo);

//      Info<Integer> integerInfo = new Info<>("15");
//      Error: Integer expected
        Info<Integer> integerInfo = new Info<>(15);

        Integer i1 = integerInfo.getValue();
//      String s1 = integerInfo.getValue(); // Error
    }
}

// Parameters:
// T - type
// E - element
// K - key (for map)
// V - value (for map)

// you can use other literals, no compile error

/* Restrictions:
1) We can not declare static elements of generic type,
since all objects of this class will have the ref to one
variable, but what will be the type of this variable
if each object can pass its own type?

 */
