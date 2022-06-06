Algoritmo ej16
	Definir num, suma, promedio, contador Como Real
	num=0
	suma=0
	contador=0
	mientras num!= (-1)
		escribir "ingrese un numero"
		leer num
		suma=suma+num
		contador=contador+1
	FinMientras
	promedio= suma/contador
	escribir "el promedio de los numeros ingresados es: ", promedio
FinAlgoritmo
