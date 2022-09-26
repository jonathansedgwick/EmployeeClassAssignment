fun main() {

    var person1 = Employee("Terry Swanson", 1,1 )
    var person2 = Employee("Greg Hart", 2,2 )
    var person3 = Employee("Charlie Johnson", 3,3 )
    person1.display()
    person1.name = "Terry Johnson"
    person1.shift = 2
    person1.display()
    person2.display()
    person3.display()
}