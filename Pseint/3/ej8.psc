Algoritmo ej8
	Definir num1, num2, cociente Como entero
	Escribir "ingrese los dos numeros a dividir"
	leer num1, num2
	operacion(num1, num2,cociente)
	escribir "el cociente es: ", cociente, " y el resto es: ", num1
	
FinAlgoritmo

SubProceso operacion (num1 por referencia, num2 Por Referencia, cociente Por Referencia)
	cociente=0
	mientras num1>=num2 Hacer
		num1<- num1 - num2
		cociente<-cociente+1
	FinMientras
	FinSubProceso
	