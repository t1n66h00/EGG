Algoritmo ej20
	Definir frase Como Caracter
	Definir espacio Como Entero
	Escribir "Ingrese una palabra"
	leer frase
	Para espacio = 0 Hasta Longitud(frase) Con Paso 1 Hacer
		Escribir Sin Saltar " ",Subcadena(frase,espacio,espacio)
	Fin Para
FinAlgoritmo
