Algoritmo ej9
	definir frase Como Caracter
	escribir "ingrese una frase"
	leer frase
	caractere(frase)
FinAlgoritmo

SubProceso caractere(frase Por Referencia)
	definir vocal Como Caracter
	definir letra Como Entero
	para letra = 0 hasta longitud(frase)
	vocal = Subcadena(frase,letra,letra)
	segun vocal hacer
		"a": vocal="@"
		"e": vocal="#"
		"i": vocal="$"
		"o": vocal="%"
		"u": vocal="*"
	FinSegun
	Escribir Sin Saltar vocal
    FinPara

	FinSubProceso
	