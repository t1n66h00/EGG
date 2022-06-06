Algoritmo ej11
	Definir num1, num2, suma, resta, multiplicacion, division Como Real
	definir menu Como caracter
	escribir "ingrese dos numeros"
	leer num1
	leer num2
	suma =num1+num2
	resta=num1-num2
	multiplicacion = num1*num2
	division = num1/num2
	escribir "seleccione la operacion que quiere realizar"
	escribir "s - suma"
	Escribir  "r - resta"
	escribir "m - multiplicacion"
	Escribir "d - division"
	leer menu
	
	segun menu
		"s" o "S": escribir "El resultado de la suma entre ",num1, " y ",num2, " es: ",suma
		"r" o "R": escribir "El resultado de la resta entre ",num1, " y ",num2, " es: ",resta
		"m" o "M": escribir "El resultado de la multiplicacion entre ",num1, " y ",num2, " es: ",multiplicacion
		"d" O "D": escribir "El resultado de la divisiob entre ",num1, " y ",num2, " es: ",division
		De Otro Modo:
			Escribir "el caracter ingresado no es valido"
	FinSegun
	
FinAlgoritmo
