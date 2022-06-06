Algoritmo ej4
	Definir frase, letra como cadena
	escribir "ingrese una frase y una letra que contenga la frase"
	leer frase, letra
	Escribir "la cantidad de veces que se encuentra la letra en la frase es de: " cantidad(frase, letra)
FinAlgoritmo

funcion contador <- cantidad(frase, letra)
	Definir longitu, letraespecifica, contador Como Entero
	letraespecifica=0
	contador=0
	longitu=Longitud(frase)
	para letraespecifica=0 hasta longitu Hacer
		si Subcadena(frase, letraespecifica, letraespecifica)=letra Entonces
			contador=contador+1
		FinSi
	FinPara
	
FinFuncion
