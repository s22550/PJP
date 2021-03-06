import static javax.swing.JOptionPane.showInputDialog

def getData(List list, Boolean error = false, Closure c) {
	list.collect { c(it) }
}

def myList = [1, 1, 2, 3, 4]

println "Lista: ${myList}"
println "Lista z elementami pomnożonymi przez 2: ${apply(myList, { it * 2 })}"
println "Lista z elementami podzielonymi przez 3: ${apply(myList, { it / 3 })}"
println "Lista z elementami do ktorych dodano 4: ${apply(myList, { it + 4 })}"


