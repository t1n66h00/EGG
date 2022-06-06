Algoritmo ej20extra
	Definir num,par,impar,contador Como Entero
	contador = 0
	par=0
	impar=0
	Repetir
		contador=contador+1
		Escribir "Ingrese un numero"
		Leer num
		Si num mod 2 <> 0 Entonces
			par=par+1
		SiNo
			impar=impar+1
		FinSi
	Mientras Que contador<10
	Escribir "Se ingresaron ",par," numeros pares y ",impar," numeros impares"
FinAlgoritmo
