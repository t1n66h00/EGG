Algoritmo ej21extra
	Definir num,contador,suma,numpar Como Entero
	contador=0
	suma=0
	numpar=0
	Escribir "Ingrese un numero"
	Leer num
	Repetir
		contador=contador+1
		numpar=numpar+2
		suma=suma+numpar
	Mientras Que contador<>num
	Escribir "La suma de los primeros ",num," pares es ",suma
FinAlgoritmo
