fun main() {
    //Q1
    personDetails("Lucy",23,"Kenya")
    //Q2
    println(addition(20,30,43,32))
    //Q3
    println(numAvrg(20,30,12,34,54))

////4. You are creating an app to capture a person’s records. Some of the data you will
////capture includes full name, age, phone number, email, weight in kg, and citizen. For the
////citizen field, you will track whether a student is a Ugandan or not.
    var name = "Carol wambui"
    println(name)
    var age = 20
    println(age)
    var weight = 47.00
    println(weight)
    var number = "783645372"
    println(number)
    var isKenyan = true
    println("isUgandan")



}
//1. Create and invoke a function that takes in a users name, age, and nationality and prints out “Hello my name is
// ${name}, I am ${age} and I am from ${nationality}” e.g
//given “Lucy”, 23, and “Kenya” it will print out “Hello my name is Lucy, I am 23 years old and I am from Kenya”

fun personDetails(name:String,age:Int,nationality:String){
    println("Hello my name is $name,and I am $age years and I am from $nationality")
}

//2. Create and invoke a function that returns the sum of any given 4 numbers (3 points)

fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum =num1+num2+num3+num4
    return sum
}
//3. Create and invoke a function that given any 5 numbers, it returns their average
fun numAvrg(num1:Int,num2:Int,num3: Int,num4: Int,num5:Int):Int{
    var sum=(num1+num2+num3+num4+num5)
    return sum/5

}

