package 연산자.Kotlin

import 연산자.Java.JavaMoney

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    main2()

    if (fun1() || fun2()) {
        // fun1()이 true 이므로 fun2()는 실행안함
        println("본문")
    }

    if (fun2() && fun1()) {
        // fun2()이 false 이므로 fun1() 실행하지 않고 if문 탈출
        println("본문")
    }

    plusMoney()
}

fun main2() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)

    println(money1 === money2)
    println(money1 == money3)

}

fun fun1(): Boolean {
    println("fun 1")
    return true
}

fun fun2(): Boolean {
    println("fun 2")
    return false
}

fun plusMoney() {
    val money1 = Money(1_000L)
    val money2 = Money(2_000L)

    println(money1 + money2)
}