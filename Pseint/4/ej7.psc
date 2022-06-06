Algoritmo ej7
	definir A, B, tamano Como Entero
	definir logic Como Logico
	escribir "defina el tamaño de los vectores"
	leer tamano
	Dimension A(tamano), B(tamano)
	
	vectores(A, B, tamano)
	
	logic=resultado(A, B, tamano)
	
	si logic=Verdadero
		Escribir "ambos vectores son iguales"
	SiNo
		Escribir "los vectores no son iguales"
	FinSi
FinAlgoritmo
SubProceso vectores(A,B, tamano)
	Definir indice Como Entero
	Para indice=0 Hasta tamano-1 Hacer
		A(indice)<-Aleatorio(-10,10)
		B(indice)<-Aleatorio(-10,10)
		Escribir Sin Saltar A(indice) ", "
		escribir Sin Saltar B(indice) ", "
	FinPara
FinSubProceso

Funcion igual = resultado(A, B, tamano)
	definir indice como entero
	Definir igual Como Logico
	Para indice=0 Hasta tamano-1 Hacer
		Si A(indice)<>B(indice) Entonces
			igual=Falso
		FinSi
	FinPara
FinFuncion