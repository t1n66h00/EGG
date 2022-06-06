Algoritmo ej23
	definir vendedores, ventas, valorventa Como Entero
	definir sueldobase, comisiones, sueldototal Como Real
	comisiones=0
	ventas=0
	Escribir "ingrese la cantidad de vendedores"
	leer vendedores
	para vendedores <- 1 Hasta vendedores Con Paso 1 Hacer
		Escribir "Ingrese el sueldo base del vendedor ", vendedores
		Leer sueldobase
		escribir "ingrese cuantas ventas realizo el vendedor ", vendedores
		leer ventas
		para ventas <- 1 Hasta ventas Con Paso 1 Hacer
			Escribir "ingrese cuanto cobro por la venta ", ventas
			leer valorventa
			comisiones=comisiones+1
			comisiones= comisiones*0.1
			sueldototal=ventas+comisiones
		FinPara
		Escribir "la cantidad de comisiones para cada vendedor es: ", comisiones, " y el sueldo total de cada vendedor es: ", sueldototal
	FinPara
	
	
	
	
FinAlgoritmo
