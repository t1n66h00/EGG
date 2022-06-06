Algoritmo ej7
	Definir dias,clima, maxima, minima Como real
	Escribir "intoduzca la cantidad de dias en los cuales se medira el clima"
	leer dias
	climas(dias, clima, maxima, minima)
	para dias <- 1 Hasta dias con paso 1 Hacer
		escribir "la temperatura sera de ", clima, " grados"
	FinPara
	
FinAlgoritmo

SubProceso climas(dias por referencia, clima por referencia, maxima Por referencia, minima Por referencia)
	para dias <- 1 Hasta dias con paso 1 Hacer
		Escribir "ingrese la temperatura minima para el dia ", dias
		leer minima
		escribir "ingrese la temperatura maxima para el dia ", dias
		leer maxima
		clima=(maxima+minima)/2

	FinPara
	FinSubProceso
		