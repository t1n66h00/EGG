Algoritmo ej10
	Definir palabra, letrainicial, letrafinal Como Caracter
	Escribir "ingrese una palabra"
	leer palabra
	letrainicial = SubCadena(palabra,0,0)
	letrafinal = Subcadena(palabra, longitud(palabra)-1, Longitud(palabra)-1)
	si letrainicial = letrafinal
		Escribir "correcto"
	SiNo
		escribir "incorrecto"
	FinSi
FinAlgoritmo
