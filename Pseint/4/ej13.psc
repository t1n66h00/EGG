Algoritmo ej13 
	Definir matriz,vectoranalizador,f,c,tamano,contador,sumafilas,sumacolumnas,sumadiagonal,sumacontradiagonal Como Entero
	Definir logic Como Logico
	logic=Verdadero
	
	Escribir "Ingrese la dimension de la matriz"
	Repetir
		Leer tamano
	Mientras Que tamano<2
	Dimension matriz(tamano,tamano)
	Dimension vectoranalizador((tamano+tamano)+2)
	Repetir
	contador=-1
		sumafilas=0
		sumacolumnas=0
		sumadiagonal=0
		sumacontradiagonal=0
		
	Para f=0 Hasta tamano-1 Hacer
		Para c=0 Hasta tamano-1 Hacer
			Leer matriz(f,c)
		FinPara
	FinPara
	
	Para f=0 Hasta ((tamano+tamano)+1) Hacer
		vectoranalizador(f)=0
	FinPara

	Para f=0 Hasta tamano-1 Hacer
		sumafilas=0
		Para c=0 Hasta tamano-1 Hacer
			sumafilas=sumafilas+matriz(f,c)
		FinPara
		contador=contador+1
		vectoranalizador(contador)=sumafilas
	FinPara
	
	Para f=0 Hasta tamano-1 Hacer
		sumacolumnas=0
		Para c=0 Hasta tamano-1 Hacer
			sumacolumnas=sumacolumnasolumnas+matriz(f,c)
		FinPara
		contador=contador+1
		vectoranalizador(contador)=sumacolumnas
	FinPara

	sumadiagonal=0
	Para f=0 Hasta tamano-1 Hacer
			sumadiagonal=sumadiagonal+matriz(f,f)
	FinPara
	contador=contador+1
	vectoranalizador(contador)=sumadiagonal

	sumadiagonal=0
	Para f=0 Hasta tamano-1 Hacer
		sumadiagonal=sumadiagonal+matriz(f,(tamano-1)-f)
	FinPara
	contador=contador+1
	vectoranalizador(contador)=sumadiagonal
	
	Mientras logic=Verdadero Y f<((tamano+tamano)+1) Hacer
		si vectoranalizador(f)<>vectoranalizador(f+1)
			logic=Falso
		FinSi
		f=f+1
	Fin Mientras
	Mientras Que logic=Falso
	
	Escribir "Matriz magica"
	Para f=0 Hasta tamano-1
		Para c=0 Hasta tamano-1
			Escribir Sin Saltar matriz(f,c)
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
