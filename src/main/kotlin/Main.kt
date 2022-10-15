fun main() {

    var sumOfBuy = 9000
    var meloman: Boolean = true
    val discountMeloman = 0.01

    var notMeloman = if (sumOfBuy <= 1000) sumOfBuy
    else if (sumOfBuy <= 10_000) sumOfBuy - 100
    else sumOfBuy * 0.05 + sumOfBuy

    println(notMeloman)

    if (meloman) {

        var isMeloman = if (sumOfBuy <= 1000) sumOfBuy - sumOfBuy * discountMeloman
        else if (sumOfBuy <= 10_000) sumOfBuy - ((sumOfBuy - 100) * discountMeloman + 100)
        else sumOfBuy * 0.05 + sumOfBuy


        println(isMeloman)


    }
}

