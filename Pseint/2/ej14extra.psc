Algoritmo ej14extra
	Definir max,min,num,contador Como Real
	Escribir "Ingrese un valor maximo"
	leer max
	Escribir "Ingrese un valor minimo"
	Leer min
	si max>min Entonces
		num= (max+min)/2
		contador=0
		Mientras num>min Y num<max Hacer
			contador=contador+1
			leer num			
		FinMientras
		Escribir "Ingreso ",contador," numeros"
	SiNo
		Escribir "El numero ingresado como maximo no es mayor que el numero ingresado como minimo"
	FinSi
	
FinAlgoritmo
