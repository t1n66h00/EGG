Algoritmo ej19extra
	Definir num1, num2, suma Como entero
	Definir salida Como Caracter
	Repetir
		Escribir "Ingrese un numero positivo"
		leer num1
	Mientras Que num1 = 0
	suma=num1
	Repetir
		Escribir "Ingrese otro numero"
		leer num2
		suma=suma+num2
		Escribir "Desea salir?"
		Leer salida
	Mientras Que salida <> "si"
	Escribir suma
FinAlgoritmo
