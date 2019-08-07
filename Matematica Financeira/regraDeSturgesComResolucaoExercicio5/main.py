# 5) Considerando as notas de um teste de inteligência aplicado a 100 alunos, apresentar os 
# resultados numa distribuição de frequência absoluta e relativa. Utilize a regra de Sturges
# Regra de Sturges: k = 1 + 3,3 . log (N)
#									10

from math import log10

def regraDeSturges(N):
	return round(1+3.3*log10(N))

def calcularAmplitude(matriz):
	return round(max(matriz) - min(matriz))

def calcularTamanhoDaClasse(amplitude, numeroDeClasses):
	return round(amplitude/numeroDeClasses)

def calcularIntervalos(notasDoTeste, numeroDeClasses, tamanhoDaClasse):
	contador=0
	intervalos = []

	while (numeroDeClasses):
		if(contador == 0):
			intervalos.append((notasDoTeste[contador], notasDoTeste[contador]+tamanhoDaClasse)) # 62 ok
		else:
			intervalos.append((intervalos[contador-1][1], intervalos[contador-1][1]+tamanhoDaClasse)) # 62 ok
		contador+=1
		numeroDeClasses-=1

	return intervalos

notasDoTeste = (
				62, 72, 74, 78, 81, 84, 86, 89, 94, 98,
				63, 72, 74, 78, 81, 84, 86, 90, 94, 98,
				64, 72, 75, 78, 82, 84, 86, 90, 95, 99,
				66, 73, 75, 78, 82, 85, 86, 90, 95, 101,
				67, 73, 76, 79, 82, 85, 86, 91, 95, 102,
				68, 73, 76, 80, 83, 85, 86, 92, 95, 103,
				70, 73, 76, 80, 83, 85, 87, 92, 96, 103,
				70, 73, 76, 81, 83, 85, 87, 92, 96, 103,
				71, 73, 78, 81, 83, 85, 88, 93, 98, 105,
				71, 74, 78, 81, 83, 86, 89, 93, 98, 108
				)


numeroDeClasses = regraDeSturges(100)

amplitude = calcularAmplitude(notasDoTeste) 
tamanhoDaClasse = calcularTamanhoDaClasse(amplitude, numeroDeClasses)

intervalos = calcularIntervalos(notasDoTeste, numeroDeClasses, tamanhoDaClasse)



print("k=1+3,3*log10(N)\tNumero De Classes: " + str(numeroDeClasses))
print("k=\\/N\t\t\tNumero De Classes: " + str(numeroDeClasses))

print("Amplitude: " + str(amplitude))
print("Tamanho da classe: " + str(tamanhoDaClasse))

print("Intervalos: " + str(intervalos))


print("\n\n")


print("----------------------------------------------------------------------------------")
print("| Notas\t\t|\tfi\t|\tFi\t|\tFr\t|\tFr.re.ac |")
print("----------------------------------------------------------------------------------")

contador = 0
Fi=0
Fr_re_ac=0
while (numeroDeClasses):
	intervalo = intervalos[contador]

	fi = 0
	Fr = 0
	for x in range(intervalo[0], intervalo[1]):
		fi += notasDoTeste.count(x)

	Fi += fi
	Fr = fi
	Fr_re_ac += Fr



	print("| " + str(intervalo) +  "\t|\t"+\
				 str(fi)+"\t|\t"+\
				 str(Fi)+"\t|\t"+\
				 str(Fr)+"%\t|\t"+\
				 str(Fr_re_ac)+"%\t |")


	contador += 1
	numeroDeClasses-=1
print("----------------------------------------------------------------------------------")
