package com.example.myFirstJavaPackage.annotations;

import java.lang.annotation.*;

class Program {

    public static void main(String[] args) throws ClassNotFoundException {

        Class xiaomiClass = Class.forName("com.example.myFirstJavaPackage.annotations.Xiaomi");
        Annotation xiaomiAnnotation = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone xiaomiSmartPhoneAnnotation = (SmartPhone) xiaomiAnnotation;
        System.out.println("Annotation info from Xiaomi class: " + xiaomiSmartPhoneAnnotation.OS() + ", " + xiaomiSmartPhoneAnnotation.yearOfCompanyCreation());
        // Annotation info from Xiaomi class: Android, 2010

        Class iphoneClass = Class.forName("com.example.myFirstJavaPackage.annotations.IPhone");
        Annotation iphoneAnnotation = iphoneClass.getAnnotation(SmartPhone.class);
        SmartPhone iphoneSmartPhoneAnnotation = (SmartPhone) iphoneAnnotation;
        System.out.println("Annotation info from IPhone class: " + iphoneSmartPhoneAnnotation.OS() + ", " + iphoneSmartPhoneAnnotation.yearOfCompanyCreation());
        // Annotation info from IPhone class: IOS, 1976
    }
}

/*
@Target shows, where annotation can be used.
TYPE (class, interface, enum), FIELD (field), METHOD (method), PARAMETER (methods' or constructors' parameters)

@Target({ElementType.TYPE, ElementType.METHOD}) // for classes and methods (2 uses)
VS
@Target(ElementType.TYPE) // for classes (1 use)


@Retention describes the annotation's lifecycle
SOURCE - is visible only in source code and is not visible in byte code
CLASS - is visible in byte code, but is not visible in RunTime
RUNTIME - is visible in RunTime. They usual contain some metadata for our app or framework.
 */

@Target(ElementType.TYPE) // for classes and methods
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    abstract String OS(); // Modifier 'abstract' is redundant for interface methods
    int yearOfCompanyCreation() default 2000;
}

@SmartPhone(OS = "Android", yearOfCompanyCreation = 2010)
class Xiaomi {
    String model;
    double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class IPhone {
    String model;
    double price;
}

@SmartPhone(OS = "Android") // yearOfCompanyCreation is 2000
class Meizu {
    String model;
    double price;
}


