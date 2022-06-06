Algoritmo ej18
	Definir num, mayor, menor, promedio, sumapromedio, divisorpromedio Como Real
	divisorpromedio=0
	sumapromedio=0
	Escribir "ingresar un numero entero, teclea 0 para terminar"
	leer num
	mayor=num
	menor=num
	Hacer
		Si num > mayor 
		 mayor = num 
		FinSi
		Si num < menor 
			menor = num 
		FinSi
		divisorpromedio=divisorpromedio+1
		sumapromedio=sumapromedio+num
		promedio=sumapromedio/divisorpromedio
		leer num
	Mientras Que num<>0
Escribir "El numero mayor es: ",mayor,", el numero menor es: ",menor, " y el promedio de todos los numeros ingresados es: ",promedio	
FinAlgoritmo
