fun main() {
    val discount = 100 //скидка
    val goldDiscount = 5 //скидка за статус
    var status = false

    var purchaseAmount = 100 //сумма покупки
    var discountedAmount = 0


    if (purchaseAmount > 0 && purchaseAmount < 1000) {
        discountedAmount = purchaseAmount
        println("сумма покупки ")
        println(discountedAmount)

    } else if (purchaseAmount > 1001 && purchaseAmount < 10000) {
        var purchaseAmount = purchaseAmount - discount
        discountedAmount = purchaseAmount
        println("сумма покупки ")
        println(discountedAmount)

    } else if (purchaseAmount > 10001) {
        var goldDiscount = purchaseAmount / 100 * goldDiscount
        var purchaseAmount = purchaseAmount - goldDiscount

        discountedAmount = purchaseAmount
        println("сумма покупки ")
        println(discountedAmount)
    }


    var totalSum = if (status == true) {
        var total = discountedAmount / 100 * 1
        total = discountedAmount - total
        println("у вас есть статус меломана поэтому действует скидка 1%: ")
        println(total)

    } else {
        println("у вас нет статуса меломана ")
    }


}




