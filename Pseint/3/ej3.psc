Algoritmo ej3
	definir num1, num2 Como Entero
	Escribir "ingrese dos numeros"
	leer num1, num2
	escribir sonmultiplo(num1,num2)
FinAlgoritmo

funcion multiplo <- sonmultiplo(num1,num2)
	definir multiplo como logico
	si num1 mod num2 = 0 Entonces
		multiplo=Verdadero
	SiNo
		multiplo=Falso
	FinSi
	
FinFuncion
