Algoritmo ej17extra
	Definir num, contador Como Real
	contador=0
	Escribir "Ingrese un numero"
	leer num 
	mientras num <> 0 Hacer
		num = num/10
		num=trunc(num)
		contador=contador+1
	FinMientras
	escribir "El numero ingresado tiene ",contador," digitos"
FinAlgoritmo
