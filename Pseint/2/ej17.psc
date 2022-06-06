Algoritmo ej17
	definir clave Como Caracter
	definir contador Como Entero
	contador = 0
	Hacer
		escribir "ingrese la clave correcta"
		leer clave
		contador=contador+1
	Mientras Que clave!= "eureka" y contador <3
	si clave="eureka"
		escribir "clave correcta"
	SiNo
		escribir "se agotaron sus intentos"
	FinSi
	
FinAlgoritmo
