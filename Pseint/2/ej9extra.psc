Algoritmo ej9extra
	definir ano Como Entero
	Escribir "ingrese un a�o valido"
	leer ano
	si ano mod 4 = 0
		Escribir "es un a�o bisiesto"
	SiNo
		si ano mod 100 = 0 y ano mod 400 = 0
			escribir "es un a�o bisiesto"
		SiNo
			Escribir "no es un a�o bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
