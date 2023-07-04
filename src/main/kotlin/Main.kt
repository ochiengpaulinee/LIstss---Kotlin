fun main(){
    println(numbers(20.0,3.0))
    println(area(14.2,3.5))
    println(area(3.2,2.0))
    println(temp(36.2))
    println(info("victor",10,"blue"))
    println(avg(23.0,14.0,7.0))
    println(binary(23.0))
    println(factor(10.0))
    println(guess(101))
    println(circle(3.142,7.0))

}
fun numbers(num1:Double,num2:Double):Double{
//    var sum = num1+num2
//    println(sum)
//    var diff = num1-num2
//    println(diff)
//    var product = num1*num2
//    println(product)
    var quotient = num1/num2
    return quotient
}

//Write a program that calculates the area of a rectangle.
// The user should be prompted to enter the length and width of the rectangle.

fun area(length:Double,width:Double):Double{
    var a = length*width
    return a
}


//Write a program that converts temperature from Celsius to Fahrenheit.
// The user should be prompted to enter the temperature in Celsius.

fun temp(temperature:Double):Double{
    var b = (temperature*1.8)+32
    return b
}

//Write a program that prompts the user to enter their name, age, and favorite color,
// and then prints out a message including all of that information.

fun info(name:String,age:Int,color:String):String{
    var stsmt = "I am $name and I am $age years old.My favourite colour is $color"
    return stsmt
}

//Write a program that simulates a dice roll.
// The user should be prompted to enter the number of sides on the dice,
// and then the program should randomly generate a number between 1 and the number of sides.
// The program should then print out the result of the roll.






//Write a program that calculates the average of three numbers.
// The user should be prompted to enter the three numbers.

fun avg(number1:Double,number2:Double,number3:Double):Double{
    var v = (number1+number2+number3)/3
    return v
}

//Write a program that converts a number from decimal to binary.
//// The user should be prompted to enter the decimal number.
//fun binary(nums:Double):Double{
//    var t = num
//    var t
//}

//Write a program that calculates the factorial of a number.
// The user should be prompted to enter the number.


fun binary(number:Double):Double{
    var biNum = 0.00
    while(number>0){
        val x = number%2
        biNum = x.toDouble() +biNum
    }
    return biNum
}

//Write a program that calculates the factorial of a number.
// The user should be prompted to enter the number.
fun factor(nums:Double):Double{
    var t=1.0
    for(i in 1..10){
        t *=i
    }
    return t
}
 
//Write a program that generates a random number between 1 and 100 and prompts the user to guess the number.
// The program should keep prompting the user until they guess correctly.

fun guess(num:Int){
    val c = 0..100
    if( num>100 &&num<1){
        println("that's not correct")
    }
    else{
        println(c)
    }
}

//Write a program that calculates the area and circumference of a circle.
// The user should be prompted to enter the radius of the circle.
fun circle(pi:Double, radius:Double):Double{
    val area = pi*(radius*2)
    val circumfrence = pi*(radius+radius)
    return area
    return circumfrence
}

