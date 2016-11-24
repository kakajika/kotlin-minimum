fun helloKotlin(): String {
    return buildString {
        appendln("Kotlin")
        appendln("かわいいよ")
        appendln("Kotlin")
    }
}

fun main(args: Array<String>) {
    println(helloKotlin())
}