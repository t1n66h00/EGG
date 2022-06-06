Algoritmo ej8
	Definir matriz, num, f,c Como Entero
	Dimension matriz(3,3) 
	
	Para f=0 Hasta 2 Con Paso 1 Hacer
		Para c=0 Hasta 2 Con Paso 1 Hacer
			Escribir "Ingrese un numero para el elemento [",f, ",",c, "]" Sin Saltar
			Leer num 
			matriz(f,c) = num 
		Fin Para
	Fin Para
	Para f=0 Hasta 2 Con Paso 1 Hacer
		Para c=0 Hasta 2 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(f,c) "]"
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo
