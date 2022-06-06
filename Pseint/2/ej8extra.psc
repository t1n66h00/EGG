Algoritmo ej8extra
	Definir llantas,preciollanta, preciofinal Como Entero
	Escribir "cuantas llantas desea comprar"
	leer llantas
	si llantas < 5 Entonces
		preciollanta=3000
		preciofinal=3000*llantas
	SiNo
		si llantas>=5 y llantas <=10 Entonces
			preciollanta=2500
			preciofinal=2500*llantas
		SiNo
			si llantas>10 Entonces
				preciollanta=2000
				preciofinal=2000*llantas
			FinSi
		FinSi
	FinSi
	Escribir"el precio por cada llanta es: ",preciollanta, " y el total a pagar es: ",preciofinal
FinAlgoritmo
