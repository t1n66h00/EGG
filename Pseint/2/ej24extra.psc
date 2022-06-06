Algoritmo ej24extra
	Definir num,suma Como Real
	suma=0
	Escribir "Ingrese un numero positivo"
	leer num
	Mientras num<0 Hacer
		Escribir "Ingrese un numero POSITIVO IDIOTA"
		Leer num
	Fin Mientras
	Para num<-0 Hasta num Con Paso 1 Hacer
		suma=suma+num
	Fin Para
	Escribir "La suma de los ",num, " numeros naturales es ",suma
FinAlgoritmo
