fun main() {

    var buy = 999
    val meloman: Boolean = true
    val discountMeloman = 0.01

    if (buy < 1001) {
        println("Ваша сумма для оплаты: $buy")
        var buy = 1003
        println("Ваша скидка составляет 100 рублей, к оплате: " + (buy - 100))
        var buy2 = 10100
        println("Ваша скидка составляет 5%, к оплате: " + (buy2 - buy2 * 0.05))
    }

    if (meloman) {
        var buyProduct1 = 404
        println("1% скидка постоянного покупателя. Ваша сумма для оплаты: " + (buyProduct1 - buyProduct1 * discountMeloman) + " рублей")
        var buyProduct2 = 5000
        println("100 рублей составила ваша скидка, плюс 1% скидка постоянного покупателя. Итого к оплате: " + ((buyProduct2 - 100) - ((buyProduct2 - 100) * discountMeloman)) + " рубль")
        var buyProduct3 = 15000
        println("5% скидка + 1% скидка постоянного покупателя. Ваша сумма к оплате: " + ((buyProduct3 - (buyProduct3 * 0.05)) - ((buyProduct3 - (buyProduct3 * 0.05)) * discountMeloman)) + " рубля")
    }
}

