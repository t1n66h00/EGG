Algoritmo ej6
	definir a, b Como Entero
	Escribir "ingrese dos numeros"
	leer a, b
	intercambio(a,b)
	Escribir "el valor del primer numero cambio a ", a, " y el valor del segundo numero cambio a ", b
	
	
FinAlgoritmo
SubProceso  intercambio(a Por Referencia, b Por Referencia)
	definir extra Como Entero
	extra=a
	a=b
	b=extra
	FinSubProceso
	