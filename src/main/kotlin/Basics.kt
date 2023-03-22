// entry point of kotlin application
fun main() {
    println("The sum of 8 and 10 is : ${sum(a = 8, b = 10)}")
    println("Ths sum of 22 and 28 is : ${inferredSum(a = 22, b = 28)}")
    printSum(a = 29, b = 90)
}

// function with return type
fun sum(a: Int, b: Int): Int {
    return a + b;
}

// function with return type inferred
fun inferredSum(a: Int, b: Int) = a + b

// function that returns no meaningful value
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is: ${a + b}")
}