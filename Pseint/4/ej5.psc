Algoritmo ej5
	Definir A,B,C,tamano,indice Como Real
	Definir eleccion Como Caracter
	Escribir "Indique el tamaño de su vector:"
	Leer N
	Dimension A(tamano), B(tamano), C(tamano)
	
	Escribir "Se llenará el vector A y B con valores aleatorios entre -100 y 100."
	Escribir ""
	
	Para indice=0 Hasta tamano-1 Hacer
		A(indice)<-Aleatorio(-100,100)
		B(indice)<-Aleatorio(-100,100)
	FinPara
	
	Escribir "El vector C se creará dependiendo de su elección, elija una de las siguientes opciones:"
	Escribir ""
	Escribir "A- El vector C se creará con la suma de los vectores A y B."
	Escribir "B- El vector C se creará con la resta de los vectores A y B."
	Leer eleccion
	Escribir ""
	Hacer
		eleccion<-Minusculas(eleccion)
		Segun eleccion Hacer
			"a": Escribir "Los vectores A y B se sumarán para crear el vector C."
				EleccionAyB(A,B,C,eleccion,tamano)
			"b":Escribir "Los vectores A y B se restarán para crear el vector C."
				EleccionAyB(A,B,C,eleccion,tamano)
			De Otro Modo:
				Escribir "Elija una opción válida"
				Leer eleccion
		FinSegun
	Mientras Que "a"<>eleccion y "b"<>eleccion
	Escribir ""
	
	Hacer
		Escribir "Elija el vector que desea imprimir por pantalla, si desea terminar el programa ingrese la palabra -salir-"
		Escribir ""
		Escribir "A- Imprimir Vector A."
		Escribir "B- Imprimir Vector B."
		Escribir "C- Imprimir Vector C."
		Leer eleccion
		eleccion<-Minusculas(eleccion)
		ImprimirABC(A,B,C,eleccion,tamano)
	Mientras Que eleccion<>"salir"
		
FinAlgoritmo

SubProceso EleccionAyB(A,B,C,eleccion,tamano)
	Definir indice Como Real
	Segun eleccion Hacer
		"a":Para indice=0 Hasta tamano-1 Hacer
			C(indice)<-A(indice)+B(indice)
		FinPara
	"b":Para indice=0 Hasta tamano-1 Hacer
		C(indice)<-A(indice)-B(indice)
	FinPara
FinSegun
FinSubProceso

SubProceso ImprimirABC(A,B,C,eleccion,tamano)
	Definir indice Como Real
	Segun eleccion Hacer
		"a":
			Para indice=0 Hasta tamano-1 Hacer
				Escribir Sin Saltar A(indice) "  "
			FinPara
		"b":
			Para indice=0 Hasta tamano-1 Hacer
				Escribir Sin Saltar B(indice) "  "
		    FinPara
		"c":
			Para indice=0 Hasta tamano-1 Hacer
				Escribir Sin Saltar C(indice) "  "
			FinPara
	FinSegun
	Escribir ""
FinSubProceso
