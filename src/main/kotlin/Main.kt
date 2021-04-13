
fun main() {
    val discount = 100 //скидка
    var goldDiscount = 5 //скидка за статус
    var status = true

    var purchaseAmount = 1001 //сумма покупки
    var discountedAmount = 0




    when (purchaseAmount) {
        in 0..1000 -> println("Сумма покупки:  $purchaseAmount")

        in 1001..10000 -> {
            discountedAmount = purchaseAmount - discount

            println("Сумма покупки:  $discountedAmount")

        }

        else -> {
            goldDiscount = purchaseAmount / 100 * goldDiscount
            discountedAmount = purchaseAmount - goldDiscount
            println("Сумма покупки:  $discountedAmount")

        }
    }







    if (status) {
        var total = discountedAmount / 100 * 1
        discountedAmount = discountedAmount - total
        println("у вас есть статус меломана поэтому действует скидка 1%: ")
        println(discountedAmount)

    } else {
        println("у вас нет статуса меломана ")
    }
}











