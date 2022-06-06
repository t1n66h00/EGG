Algoritmo ej13
	definir option Como entero
	escribir "para obtener el grado de eficiencia de un operario se debe tener en cuenta dos condiciones:"
	escribir "primero si Produjo menos de 200 tornillos defectuosos"
	Escribir "y segundo si produjo más de 10000 tornillos sin defectos"
	escribir "1 - si no cumple ninguna de las condiciones es de grado 5"
	Escribir  "2 - si solo cumple la primera condicion es de grado 6"
	escribir "3 - si solo cumple la segunda condicion es de grado 7"
	Escribir "4 - si cumple las dos condiciones es de grado 8"
	escribir "seleccione una opcion"
	Leer option
	
	
	
	si option >=1 y option <=4
		segun option hacer
			1: escribir " el operario es de grado 5"
			2: escribir " el operario es de grado 6"
			3: escribir " el operario es de grado 7"
			4: escribir " el operario es de grado 8"
		FinSegun
	SiNo
		escribir "error caracter invalido"
	FinSi
	
FinAlgoritmo
