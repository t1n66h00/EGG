Algoritmo ej25extra
	Definir palabra Como Caracter
	Definir contador como entero
	Escribir "Ingrese una palabra"
	leer palabra
	Para contador<-1 Hasta Longitud(palabra) Con Paso 1 Hacer
		Escribir Sin Saltar Subcadena(palabra,Longitud(palabra)-contador,Longitud(palabra)-contador)
	Fin Para
	Escribir ""
FinAlgoritmo

