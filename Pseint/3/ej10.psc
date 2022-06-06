Algoritmo ej10
	definir num Como Entero
	escribir "ingrese cantidad de numeros enteros a sumar"
	leer num
	escribir "la suma de los ", num , " primeros numeros enteros es de ", sumaenteros(num)
FinAlgoritmo

funcion suma <- sumaenteros(num)
	definir suma Como Entero
	si num = 0 o num = 1 Entonces
		suma=num
	SiNo
		suma=num+sumaenteros(num-1)
	FinSi
	FinFuncion
	