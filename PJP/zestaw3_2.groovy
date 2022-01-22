def pmap = [ Groovy: ['Asia', 'Jan'],
	Grails: [
		'Asia',
		'Jan',
		'Stefan',
		'Mirek'
	],
	Java: ['Asia', 'Stefan', 'Mirek'],
	JEE: [
		'Slawek',
		'Stefan',
		'Janusz'
	]
]

pmap.each {	println "${it.key} - ${it.value.size()}" }

pmap.findAll { it.value.size() > 2 }.each { println it.key }

pmap.each {
	key, value ->
		println "\n$key: "
		value.each { print "$it " }
}
