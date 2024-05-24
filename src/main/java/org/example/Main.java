package org.example;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", "CS101", 4.5);
        Student student2 = new Student("Jane", "Smith", "CS102", 5.0);
        Aspirant aspirant1 = new Aspirant("Alice", "Johnson", "CS201", 5.0, "Quantum Computing");
        Aspirant aspirant2 = new Aspirant("Bob", "Brown", "CS202", 4.8, "Artificial Intelligence");

        Student[] students = {student1, student2, aspirant1, aspirant2};

        for (Student student : students) {
            System.out.println(student.firstName + " " + student.lastName + " Scholarship: " + student.getScholarship());
        }

        System.out.println("***********************");
        Pow powerFunction = (number, power) -> {
            int result = 1;
            for (int i = 0; i < power; i++) {
                result *= number;
            }
            return result;
        };

        int base = 2;
        int exponent = 3;
        int result = powerFunction.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        base = 5;
        exponent = 4;
        result = powerFunction.pow(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}