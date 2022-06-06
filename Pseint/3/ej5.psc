Algoritmo ej5
	definir num Como Entero
	Escribir "ingrese un numero"
	leer num
	escribir validacion(num)
FinAlgoritmo

funcion primo <- validacion(num)
	Definir uno, contador Como Entero
	definir primo como caracter
	contador=0
	Para uno=1 Hasta num Hacer
		Si num mod uno=0 Entonces
			contador=contador+1
		FinSi
	FinPara
	si contador=2
		primo= "es primo"
	SiNo
		primo= "no es primo"
	FinSi
	FinFuncion
	