package main

class HelloWorld {
    static void main(String[] args) {
        Person person = new Person(
                firstName: 'John',
                lastName: 'Doe',
                age: 40
        )
        person.personInfo()
    }
}
