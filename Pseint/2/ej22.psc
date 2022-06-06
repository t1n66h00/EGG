Algoritmo ej22
	Definir num, primerlado, segundolado Como Entero
	Escribir "ingrese un numero para el tamaño del lado de un cuadrado"
	leer num
	para primerlado = 1 hasta num Hacer
		para segundolado = 1 hasta num Hacer
			si primerlado > 1 y primerlado < num y segundolado > 1 y segundolado < num Entonces
				escribir Sin Saltar " "
			SiNo
				escribir Sin Saltar "*"
			FinSi
		FinPara
		escribir ""
	FinPara
	
	
FinAlgoritmo
