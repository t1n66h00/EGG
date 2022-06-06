Algoritmo ej9extra
	definir ano Como Entero
	Escribir "ingrese un año valido"
	leer ano
	si ano mod 4 = 0
		Escribir "es un año bisiesto"
	SiNo
		si ano mod 100 = 0 y ano mod 400 = 0
			escribir "es un año bisiesto"
		SiNo
			Escribir "no es un año bisiesto"
		FinSi
	FinSi
	
FinAlgoritmo
