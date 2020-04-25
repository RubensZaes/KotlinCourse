package fundamentos

fun main(args: Array<String>) {
//    var a = 1
    var a:Double = 1.0
    var b = 2

    a = 2.3
// Error:(7, 9) Kotlin: The floating-point literal does not conform to the expected type Int
    println(a + b)
}