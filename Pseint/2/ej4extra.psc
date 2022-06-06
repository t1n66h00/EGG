Algoritmo ej4extra
	Definir horas, nafta, minutos, preciofinal, cantidadnafta, cantidadminutos como real
	cantidadminutos=0
	cantidadnafta=0
	Escribir "ingrese la cantidad de horas que tuvo el vehiculo"
	leer horas
	si horas <= 2
		escribir "el precio del alquiler es de 400$"
	SiNo
		Escribir "ingrese la cantidad de litros de nafta gastados"
		leer cantidadnafta
		escribir "ingrese cuantos minutos en total tuvo el vehiculo"
		leer cantidadminutos
		
	FinSi
	nafta=40*cantidadnafta
	minutos=5.2*cantidadminutos
	preciofinal= nafta + minutos
	escribir "el precio que debera pagar por el auto es de: ", preciofinal
FinAlgoritmo
