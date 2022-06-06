Algoritmo ej7
	definir palabra, exclamacion, interrogacion Como Caracter
	Escribir "ingrese una palabra"
	leer palabra
	exclamacion = "!"
	interrogacion = "?"
	si Longitud(palabra) = 4
		palabra = Concatenar(palabra,exclamacion)
		Escribir palabra
	SiNo
		palabra = Concatenar(palabra,interrogacion)
		Escribir  palabra
	FinSi
FinAlgoritmo
