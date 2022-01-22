def euro = 4.30
def plnToEuro = 1/euro

def menuSourceFile = new File("C:/Users/Lenovo/eclipse-workspace/PJP/src/MenuPl.txt")
def menuOutputFile = new File("C:/Users/Lenovo/eclipse-workspace/PJP/src/MenuEur.txt")
menuOutputFile.text = ""

menuSourceFile.eachLine {
    def courseRaw = it.split(" ")
    def eurPrice = String.format("%.2f", (courseRaw[1] as BigDecimal) * plnToEuro)
    menuOutputFile.text += courseRaw[0] + " " + eurPrice + "\n"
}