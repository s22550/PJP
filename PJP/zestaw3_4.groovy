def euroToRatio = 4.30

def text = "kot: 120.00 PLN pies: 150.50 PLN chomik: 10.50 PLN"
text = text.replaceAll(/(\d+\.?,?\d+) PLN/) { all, price ->
    String.format("%.2f", price.toBigDecimal() / plnToEuroRatio) + ' EUR'
}
println "a)\n" + text

