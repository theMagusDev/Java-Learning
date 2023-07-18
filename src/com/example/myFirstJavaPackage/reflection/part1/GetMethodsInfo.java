package com.example.myFirstJavaPackage.reflection.part1;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class GetMethodsInfo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {

        Class employeeClass = Class.forName("com.example.myFirstJavaPackage.reflection.part1.Employee");

        // Get info about methods
        Method doubleSalaryMethod = employeeClass.getMethod("doubleSalary");
        System.out.println("Return type of method doubleSalaryMethod() is " + doubleSalaryMethod.getReturnType());
        // Return type of method doubleSalaryMethod() is void

        Class[] doubleSalaryMethodParameterTypes = doubleSalaryMethod.getParameterTypes();
        System.out.println("Parameter types of method doubleSalaryMethod() are " + Arrays.toString(doubleSalaryMethodParameterTypes));
        // Parameter types of method doubleSalaryMethod() are []


        Method setSalaryMethod = employeeClass.getMethod("setSalary", double.class); // method's parameters after its name
        System.out.println("Return type of method setSalaryMethod() is " + setSalaryMethod.getReturnType());
        // Return type of method setSalaryMethod() is void

        Class[] setSalaryMethodParameterTypes = setSalaryMethod.getParameterTypes();
        System.out.println("Parameter types of method doubleSalaryMethod() are " + Arrays.toString(setSalaryMethodParameterTypes));
        // Parameter types of method doubleSalaryMethod() are [double]


        // Get methods (except private ones)
        Method[] methods = employeeClass.getMethods();
        for (Method method : methods) {
            System.out.println("Method '" + method.getName() + "' gets parameters " + Arrays.toString(method.getParameters()) + " and has a '" + method.getReturnType() + "' return type");
        }
        /*
         Method 'toString' gets parameters [] and has a 'class java.lang.String' return type
         Method 'doubleSalary' gets parameters [] and has a 'void' return type
         Method 'setSalary' gets parameters [double arg0] and has a 'void' return type
         Method 'getSalary' gets parameters [] and has a 'double' return type
         Method 'equals' gets parameters [java.lang.Object arg0] and has a 'boolean' return type
         Method 'hashCode' gets parameters [] and has a 'int' return type
         Method 'getClass' gets parameters [] and has a 'class java.lang.Class' return type
         Method 'notify' gets parameters [] and has a 'void' return type
         Method 'notifyAll' gets parameters [] and has a 'void' return type
         Method 'wait' gets parameters [long arg0] and has a 'void' return type
         Method 'wait' gets parameters [long arg0, int arg1] and has a 'void' return type
         Method 'wait' gets parameters [] and has a 'void' return type
         */

        // Get all declared methods (even private), but not inherited
        Method[] declaredMethods = employeeClass.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println("Method '" + method.getName() + "' gets parameters " + Arrays.toString(method.getParameters()) + " and has a '" + method.getReturnType() + "' return type");
        }
        /*
         Method 'toString' gets parameters [] and has a 'class java.lang.String' return type
         Method 'setSalary' gets parameters [double arg0] and has a 'void' return type
         Method 'doubleSalary' gets parameters [] and has a 'void' return type
         Method 'changeDepartment' gets parameters [java.lang.String arg0] and has a 'void' return type
         Method 'getSalary' gets parameters [] and has a 'double' return type
         */

        // Get only public methods
        Method[] publicMethods = employeeClass.getDeclaredMethods();
        for (Method method : publicMethods) {
            if (Modifier.isPublic(method.getModifiers())) {
                System.out.println("Method '" + method.getName() + "' gets parameters " + Arrays.toString(method.getParameters()) + " and has a '" + method.getReturnType() + "' return type");
            }
        }
        /*
         Method 'toString' gets parameters [] and has a 'class java.lang.String' return type
         Method 'setSalary' gets parameters [double arg0] and has a 'void' return type
         Method 'doubleSalary' gets parameters [] and has a 'void' return type
         Method 'getSalary' gets parameters [] and has a 'double' return type
         */
    }
}
