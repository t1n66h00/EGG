Algoritmo ej2
	Definir vector, indice, suma, resta, multiplicacion Como real
	Dimension vector(10)
	suma=0
	resta=0
	multiplicacion=1
	Para indice<-0 Hasta 9 Con Paso 1 Hacer
		Escribir "Ingrese el numero " indice
		Leer vector(indice)
	Fin Para
	Para indice<-0 Hasta 9 Con Paso 1 Hacer
		suma<-suma + vector(indice)
		resta<-resta - vector(indice)
		multiplicacion<-multiplicacion * vector(indice) 
	Fin Para
	Escribir "la suma es: ", suma, " la resta es: ", resta, " y la multiplicacion es: ", multiplicacion
FinAlgoritmo
