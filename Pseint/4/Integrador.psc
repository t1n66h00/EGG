Algoritmo integrador
	Definir matriz, muestra Como Caracter
	Definir f,c,contador Como Entero
	Definir tamano Como real
	Definir logic,logicodiagonal,logicocontradiagonal Como Logico
	contador=0
	logic=Verdadero
	
	Escribir "Ingrese la cadena de adn"
	Repetir
	Leer muestra
		tamano=raiz(Longitud(muestra))
		tamano=trunc(tamano)
		Para f=0 Hasta Longitud(muestra)-1
			si Subcadena(muestra,f,f) <> Mayusculas("A") Y Subcadena(muestra,f,f) <> Mayusculas("B") Y Subcadena(muestra,f,f) <> Mayusculas("C") Y Subcadena(muestra,f,f) <> Mayusculas("D")
				logic=Falso
				Escribir "caracter incorrecto: ", Subcadena(muestra,f,f)
			FinSi
		FinPara
	Mientras Que logic=Falso
	
	Dimension matriz(tamano,tamano)
	
	Para f=0 Hasta tamano-1 Hacer
		Para c=0 Hasta tamano-1 Hacer
			matriz(f,c)=Subcadena(muestra,contador,contador)
			contador=contador+1
		FinPara
	FinPara
	
	logicodiagonal=calculodiagonal(matriz,f,c,tamano)
	logicocontradiagonal=calculocontradiagonal(matriz,f,c,tamano)
	
	si logicodiagonal=Verdadero Y logicocontradiagonal=Verdadero
		Escribir "Cura encontrada"
		Para f=0 Hasta tamano-1 hacer
			para c=0 Hasta tamano-1 hacer
				Escribir Sin Saltar "[" matriz(f,c) "]"
			FinPara
			Escribir ""
		FinPara
	SiNo
		Escribir "Sin Cura"
	FinSi
	
FinAlgoritmo

Funcion resultadodiagonal<-calculodiagonal(matriz,f,c,tamano)
	Definir resultadodiagonal Como Logico
	Definir diagonal Como caracter
	resultadodiagonal=Verdadero
	diagonal=matriz(0,0)
	Para f=0 Hasta tamano-1
			si matriz(f,f)<>diagonal Entonces
				resultadodiagonal=Falso
			FinSi
		FinPara
FinFuncion

Funcion resultadocontradiagonal<-calculocontradiagonal(matriz,f,c,tamano)
	Definir resultadocontradiagonal Como Logico
	Definir contradiagonal Como Caracter
	resultadocontradiagonal=Verdadero
	contradiagonal=matriz(0,tamano-1)
	Para f=0 Hasta tamano-1
		si matriz(f,(tamano-1)-f)<>contradiagonal Entonces
			resultadocontradiagonal=Falso
		FinSi
	FinPara
FinFuncion	