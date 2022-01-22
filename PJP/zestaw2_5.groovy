def eachTuple(Object object, Closure c) {
    object.toList().collate(c.maximumNumberOfParameters).each { c(it) }
}

def list = (1..40)

eachTuple(list) { e1, e2, e3, e4 ->
    println "$e1 $e2 $e3 $e4"
}


