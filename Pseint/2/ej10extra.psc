Algoritmo ej10extra
	Definir manzanas Como Entero
	escribir "cuantos kilos de manzanas desea comprar"
	leer manzanas
	si manzanas <=0 Entonces
		Escribir "no hay descuentos para esa cantidad"
	SiNo
		si manzanas > 2 y manzanas < 5 Entonces
			escribir "tiene 10% de descuento"
		SiNo
			si manzanas > 5 y manzanas < 10 Entonces
				escribir "tiene 15% de descuento"
			SiNo
				si manzanas > 10 entonces
					Escribir  "tiene 20% de descuento"
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
