def list1 = [ 'a', 'b', 'c']
def list2 = [ 1, 8, 23 ]

list1.each { print it + ' ' }
println("\n")
list2.each { print it + ' '  }

list1 = list1.each { it * 2 }
list2 = list2.each { it * 2 }

println(list1)
println(list2)
