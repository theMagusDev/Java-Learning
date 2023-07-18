package com.example.myFirstJavaPackage.reflection.part1;

import java.lang.reflect.Field;

public class GetFieldsInfo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {

        // Declaration

        Class employeeClass = Class.forName("com.example.myFirstJavaPackage.reflection.part1.Employee");
        // add 'throws ClassNotFoundException' to function to use it

        Class employeeClass2 = Employee.class;

        Employee employee = new Employee();
        Class employeeClass3 = employee.getClass();


        // Get fields

        Field idField = employeeClass.getField("id");
        // add 'throws NoSuchFieldException' to function to use it

        // Type and other information about public fields
        System.out.println("Type of id field: " + idField.getType()); // Type of id field: int

        Field[] fields = employeeClass.getFields();
        for (Field field : fields) {
            System.out.println("Type of " + field.getName() + " is " + field.getType());
        }
        /*
         Type of id is int
         Type of name is class java.lang.String
         Type of department is class java.lang.String
         */

        // Information about private fields
        Field[] allFields = employeeClass.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println("Type of " + field.getName() + " is " + field.getType());
        }
        /*
         Type of id is int
         Type of name is class java.lang.String
         Type of department is class java.lang.String
         Type of salary is double
         */
    }
}
