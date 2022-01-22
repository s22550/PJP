import static javax.swing.JOptionPane.showInputDialog

def numbersMap = ["0": "zero", "1": "jeden", "2": "dwa", "3": "trzy", "4": "cztery", "5": "piêæ", "6": "szeœæ", "7": "siedem", "8": "osiem", "9": "dziewiêæ"]
def number = showInputDialog("Podaj liczbe calkowita:")
def numberList = []
(number =~ /\d/).each { numberList << numbersMap[it as String] }
println numberList.join(" - ")

