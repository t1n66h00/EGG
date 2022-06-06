Algoritmo ej3
	Definir vector, indice, tamano, num Como entero
	Definir logic Como Logico
	logic=Falso
	Escribir "Ingrese el tamaño del vector"
	leer tamano
	Dimension vector(tamano)
	Para indice<-0 Hasta tamano-1 Con Paso 1 Hacer
		Escribir "Ingrese el numero " indice
		Leer vector(indice)
	Fin Para
	Escribir "seleccione algun valor ingresado anteriormente"
	leer num
	para indice=0 Hasta tamano-1 Hacer
		si vector(indice) = num Entonces
			Escribir "El numero ingresado: ",num," Se encuentra en la posicion ",indice," del vector"
			logic=Verdadero
		FinSi
	FinPara
	Si logic = Falso Entonces
		Escribir "El numero ",num," no se encontro dentro de el arreglo"
	FinSi
FinAlgoritmo
