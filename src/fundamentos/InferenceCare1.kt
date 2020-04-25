package fundamentos

fun main(args: Array<String>) {
    var a
    var b = 2

    a = 10

    //Error:(4, 9) Kotlin: This variable must either have a type annotation or be initialized
    println(a + b)
}