Algoritmo ej4
	Definir vector, indice, tamano, mayor Como Entero
	Escribir "Ingrese el tamaño del vector"
		Leer tamano
	Dimension vector(tamano)
	Para indice=0 Hasta tamano-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero " indice
		Leer vector(indice)
	Fin Para
	mayor=verificador(vector, indice, tamano)
	Escribir "El mayor numero ingresado es ", mayor
FinAlgoritmo
Funcion resultado<-verificador(vector, indice, tamano)
	Definir resultado Como Entero
	resultado=0
	Para indice=1 Hasta tamano-1 Hacer
		Si resultado<vector(indice) Entonces
			resultado=vector(indice)
		FinSi
	FinPara
FinFuncion

