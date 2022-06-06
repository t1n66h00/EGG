Algoritmo ej3extra
	Definir num1, num2 Como entero
	Escribir "ingrese un numero"
	leer num1
	escribir "ingrese otro numero"
	leer num2
	
	si num1 mod 2 = 0 y num2  mod 2 = 0
		escribir "ambos numeros son pares"
	SiNo
		si num1 mod 2 = 0 y num2 mod 2 <> 0
			escribir "uno de los dos numeros no es par"
	SiNo
		si num1 mod 2 <> 0 y num2 mod 2 = 0
			escribir "uno de los dos numeros no es par"
	SiNo
		escribir "ambos numeros son impares"
	FinSi
	FinSi
	FinSi
	
FinAlgoritmo
