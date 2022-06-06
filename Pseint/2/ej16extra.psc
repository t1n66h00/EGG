Algoritmo ej16extra
	Definir practica,problemas,teoria,notafinal Como Real
	Definir nombre Como Caracter
	nombre="a"
	Mientras nombre <> "" Hacer
		Escribir "Ingrese su nombre"
		Leer nombre
		Si nombre <> "" Entonces
			Escribir "Ingrese sus notas de practicas, teoria y problemas"
			Leer practica,problemas,teoria
			Si (practica>=1 Y practica<=10) Y (problemas>=1 Y problemas<=10) Y (teoria>=1 Y teoria<=10) Entonces
				notafinal = (practica*0.1)+(problemas*0.5)+(teoria*0.4)
				Escribir "Su nota es ",notafinal
			SiNo
				Escribir "Error"
			FinSi	
		FinSi
		
	FinMientras
FinAlgoritmo
