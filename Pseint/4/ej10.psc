Algoritmo ej10
	Definir matriz, f, c, tamanof, tamanoc Como Entero
	Escribir "defina la dimension de las filas"
	leer tamanof
	Escribir "defina la dimension de las columnas"
	leer tamanoc
	Dimension matriz(tamanof,tamanoc) 
	
	Para f=0 Hasta tamanof-1 Con Paso 1 Hacer
		Para c=0 Hasta tamanoc-1 Con Paso 1 Hacer
			matriz(f,c)=Aleatorio(-10,10)
		Fin Para
	Fin Para
	Para f=0 Hasta tamanof-1 Con Paso 1 Hacer
		Para c=0 Hasta tamanoc-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(f,c) "]"
		Fin Para
		Escribir " "
	Fin Para
	Escribir "la suma es: ", sumamatriz( matriz, tamanof, tamanoc)
FinAlgoritmo

funcion suma = sumamatriz(matriz, tamanof, tamanoc)
	definir suma, f, c Como Entero
	suma=0
	Para f=0 Hasta tamanof-1 Con Paso 1 Hacer
		Para c=0 Hasta tamanoc-1 Con Paso 1 Hacer
			suma= suma+matriz(f,c)
		Fin Para
	Fin Para
FinFuncion
