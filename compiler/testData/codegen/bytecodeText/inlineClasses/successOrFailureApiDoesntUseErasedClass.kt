// WITH_COROUTINES
// FILE: test.kt
fun testSoF() {
    val sof = Result.success("yes!")
    val failure = Result.failure<String>(Exception())

    if (sof.isSuccess) println("success")
    if (sof.isFailure) println("failure")
    println(sof.getOrThrow())
    println(failure.getOrNull())
    println(failure.exceptionOrNull())

    val other = Result.success("nope")
    if (sof == other) println("==")
    if (sof != other) println("!=")
    if (sof.equals(other)) println("equals")
    if (!sof.equals(other)) println("!equals")

    println(sof.hashCode())
    println(sof.toString())
    println("$sof")

    val ans1 = runCatching { 42 }
    println(ans1)

    val ans2 = 42.runCatching { this }
    println(ans2)

    println(sof.getOrElse { "oops" })
    println(sof.getOrDefault("oops"))
}

// @TestKt.class:
// 0 Result\$Erased
// 0 Result\-Erased
// 58 Result