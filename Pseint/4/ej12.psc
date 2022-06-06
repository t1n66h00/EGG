Algoritmo ej12
	Definir matriz, palabra Como caracter
	definir f, c, contador como entero
	Dimension matriz(3,3)
	contador=0
	escribir "ingrese una palabra o frase de 9 caracteres"
	Repetir
		Leer palabra
	Mientras Que Longitud(palabra)>9
	Para f=0 Hasta 2
		Para c=0 Hasta 2
			matriz(f,c)=Subcadena(palabra,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	Para f=0 Hasta 2
		Para c=0 Hasta 2
			Escribir Sin Saltar "[" matriz(f,c) "]"
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
