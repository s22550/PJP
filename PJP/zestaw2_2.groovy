import static javax.swing.JOptionPane.showInputDialog

def getInts(Boolean err = false, String wrongList = "") {
    def list = []
    err ? (val = showInputDialog(null, "Bledna lista. Podaj list� liczb jeszcze raz:", wrongList)) : (val = showInputDialog("Podaj list� liczb:"))

    if (val != null) {
        val.tokenize("").each {
            it.isInteger() ? list << it.toInteger() : getInts(err = true, wrongList = val)
        }
    }
    return list
}

println getInts()
