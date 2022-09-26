class Employee constructor(name: String ,
                           number: Int,
                           shift: Int) {

    var name = name
        get() = field
        set(value) {
            field = value
        }
    var number = number
        get() = field
        set(value) {
            field = value
        }
    var shift = shift
        get() = field
        set(value) {
            field = value
        }

    fun display(){
        println("Name: $name\n" +
                "Employee Number: $number\n" +
                "Shift: $shift")

    }


}

