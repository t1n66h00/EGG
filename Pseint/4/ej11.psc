Algoritmo ej11
	Definir matriz, f, c, tamano Como Entero
	Escribir "defina la dimension de la matriz"
	leer tamano
	Dimension matriz(tamano,tamano)
	Para f=0 Hasta tamano-1 Con Paso 1 Hacer
		Para c=0 Hasta tamano-1 Con Paso 1 Hacer
			matriz(f,c)=Aleatorio(0,10)
			si f=c
				matriz(f,c)=0
			FinSi
		Fin Para
	Fin Para
	Para f=0 Hasta tamano-1 Con Paso 1 Hacer
		Para c=0 Hasta tamano-1 Con Paso 1 Hacer
			Escribir Sin Saltar "[" matriz(f,c) "]"
		Fin Para
		Escribir " "
	Fin Para
FinAlgoritmo
