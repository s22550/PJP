import static javax.swing.JOptionPane.showInputDialog

def numbersMap = ["0": "zero", "1": "jeden", "2": "dwa", "3": "trzy", "4": "cztery", "5": "pi��", "6": "sze��", "7": "siedem", "8": "osiem", "9": "dziewi��"]
def number = showInputDialog("Podaj liczbe calkowita:")
def numberList = []
(number =~ /\d/).each { numberList << numbersMap[it as String] }
println numberList.join(" - ")

