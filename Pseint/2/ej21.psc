Algoritmo ej21
	Definir alumnos Como Entero
	definir notaintegrador, notaexposicion, notaparcial, notafinal, reprobados, sumareprobados, divisorreprobados, mayorintegrador,porcentajemayorintegrador, mayornotaexposicion, totalparcial Como Real
	sumareprobados=0
	divisorreprobados=0
	cantidadmayorintegrador=0
	mayornotaexposicion=0
	totalparcial=0
	Escribir "ingrese la cantidad de alumnos"
	leer alumnos
	Para alumnos <- 1 Hasta alumnos Con Paso 1 Hacer
		Escribir "Ingrese la nota del practico integrador del alumno ",alumnos
		Leer notaintegrador
		Escribir "Ingrese la nota de exposicion del alumno",alumnos
		Leer notaexposicion
		Escribir "Ingrese la nota de parcial del alumno",alumnos
		Leer notaparcial
		notafinal = (notaintegrador*0.35)+(notaexposicion*0.25)+(notaparcial*0.40)
		Si notafinal < 6.5 Entonces
			divisorreprobados=divisorreprobados+1
			sumareprobados=sumareprobados+notafinal
			reprobados=sumareprobados/divisorreprobados
		FinSi
		Si notaintegrador > 7.5
			porcentajemayorintegrador=porcentajemayorintegrador+1
			mayorintegrador=(100*porcentajemayorintegrador)/alumnos
		FinSi
		Si notaexposicion > mayornotaexposicion 
			mayornotaexposicion = notaexposicion 
		FinSi
		si notaparcial >= 4 y notaparcial <= 7.5
			totalparcial=totalparcial+1
		FinSi
	FinPara
	Escribir "La nota promedio de los alumnos con puntaje menor a 6.5 es: ",reprobados,", El porcentaje de alumnos con nota mayor a 7.5 es: ",mayorintegrador, ", la mayor nota obtenida en las exposiciones es: ", mayornotaexposicion, " y el total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: ", totalparcial
	
FinAlgoritmo
