def counter = 1
new File("C:/Users/Lenovo/eclipse-workspace/PJP/src/").eachFile() { file->
	println "${counter++} ${file.getName().tokenize(".")[0] }"
}