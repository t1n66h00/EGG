Algoritmo ej2extra
	Definir mes Como Caracter
	Definir importe, descuento, porcentaje Como Real
	Escribir "ingrese en que mes realizo la compra"
	leer mes
	escribir "ingrese cual fue el importe de la compra"
	leer importe
	porcentaje=importe*0.1
	descuento=importe-porcentaje
	si mes = "septiembre" o mes = "octubre" o mes = "noviembre"
		Escribir "tiene un descuento del 10% por lo tanto el valor de la compra es de: ", descuento
	SiNo
		Escribir "no hay descuento por lo tanto el valor de la compra queda igual"
	FinSi
FinAlgoritmo
