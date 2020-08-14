package main

class Person {
    String firstName
    String lastName
    int age

    def personInfo() {
        println("Name: " + firstName + " " + lastName + "; Age: " + age)
    }
}
