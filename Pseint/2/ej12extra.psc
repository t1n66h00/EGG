Algoritmo ej12extra
	Definir ventas,salario,salariofijo,salarioextra, pagoporhora, horas, comision, horasextra como entero
	definir menu Como Caracter
	escribir "elegir el tipo de contrato que tiene"
	Escribir "a) comision"
	Escribir "b) salario fijo + comision"
	Escribir "c) salario fijo"
	Leer menu
	segun menu 
		"a" o "A": escribir "ingrese el monto total de las ventas semanales"
			leer ventas
			comision=ventas*0.4
			Escribir " su salario es de: $",comision
		"b" o "B":
			escribir "ingrese la cantidad de horas trabajadas"
			leer horas
			si horas < 40 Entonces
				Escribir "ingrese el monto total de las ventas semanales"
				leer ventas
				Escribir "ingrese el valor cobrado por hora"
				leer pagoporhora
				salario=pagoporhora*horas
				comision=ventas*1.25
				salariofijo= comision+salario
				Escribir " su salario es de: $",salario+comision
			SiNo
				Escribir "maximo de horas superado"
				Escribir " su salario es de: $",salario+comision
			FinSi
			
		"c" o "C": Escribir "ingrese el valor cobrado por hora"
		leer pagoporhora
		escribir "ingrese la cantidad de horas trabajadas"
		leer horas
		salario=pagoporhora*horas
		si horas <= 40 Entonces
			Escribir " su salario es de: $", salario
		SiNo
			horasextra=horas-40
			salarioextra=pagoporhora*0.5
			Escribir " su salario es de: $",salario+salarioextra
		FinSi
	FinSegun
	
FinAlgoritmo
