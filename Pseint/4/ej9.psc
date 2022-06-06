Algoritmo ej9
	Definir matriz, num, f, c Como Entero
	Dimension matriz(5,5) 
	
	Para f=0 Hasta 4 Con Paso 1 Hacer
		Para c=0 Hasta 4 Con Paso 1 Hacer
			matriz(f,c)=Aleatorio(-10,10)  
		Fin Para
	Fin Para
	Para f=0 Hasta 4 Con Paso 1 Hacer
		Para c=0 Hasta 4 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(f,c) "]"
		Fin Para
		Escribir " "
	Fin Para
	escribir "elija un numero que se encuentre dentro de la matriz"
	leer num
	Para f=0 Hasta 4 Con Paso 1 Hacer
		Para c=0 Hasta 4 Con Paso 1 Hacer
			si matriz(f,c)= num
				escribir "el numero ", num, " se encuentra en la fila ",f, " columna ",c
			FinSi
		FinPara
	FinPara
	
FinAlgoritmo
