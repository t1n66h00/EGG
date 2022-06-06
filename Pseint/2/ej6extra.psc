Algoritmo ej6extra
	Definir dia, mes, ano Como Entero
	Escribir "ingrese una fecha valida"
	Leer dia
	leer mes
	leer ano
	si dia >=1 y dia <=31 y mes >=1 y mes <=12
	 segun mes hacer
		1: escribir dia, " de enero de ", ano
		2: escribir dia, " de febrero de ", ano
		3: escribir dia, " de marzo de ", ano
		4: escribir dia, " de abril de ", ano
		5: escribir dia, " de mayo de ", ano
		6: escribir dia, " de junio de ", ano
		7: escribir dia, " de julio de ", ano
		8: escribir dia, " de agosto de ", ano
		9: escribir dia, " de septiembre de ", ano
		10: escribir dia, " de octubre de ", ano
		11: escribir dia, " de noviembre de ", ano
		12: escribir dia, " de diciembre de ", ano
	 FinSegun
    SiNo
	 Escribir "fecha invalida"
	FinSi
	
FinAlgoritmo
