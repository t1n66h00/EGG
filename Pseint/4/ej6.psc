Algoritmo ej6
	definir vector, frase Como cadena
	definir caract como caracter
	definir indice, posicion como entero
	
	Escribir "ingrese una frase como maximo de 20 caracteres"
	leer frase
	si Longitud(frase)>20
		Escribir "la cantidad de caracteres es mayor a la permitida"
	FinSi
	Escribir "que caracter desa ingresar"
	leer caract
	escribir "defina en que posicion desea ingresar el caracter"
	leer posicion
	si posicion>20
		escribir "valor invalido"
	FinSi
	Dimension vector(20)
	para indice=0 hasta 19 Hacer
		vector(indice)=Subcadena(frase, indice, indice)
	FinPara
	
	si vector(posicion)=" " o vector(posicion)=""
		vector(posicion)= caract
		para indice=0 Hasta 19
			escribir Sin Saltar vector(indice)
			si vector(indice)=""
				escribir Sin Saltar " "
			FinSi
		FinPara
		escribir ""
	SiNo
		escribir "el lugar esta ocupado"
	FinSi
FinAlgoritmo
