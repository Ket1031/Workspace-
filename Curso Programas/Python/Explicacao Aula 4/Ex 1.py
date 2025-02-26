# Valor gasto em cigarros

anosDeConsumo = int(input("Digite há quantos anos fumas: "))
cigarrosPorDia = int(input("Quantos cigarros fuma por dia: "))
valorDoMaco = float(input("Digite o valor do maco: "))

valorCigarro = valorDoMaco / 20

totalGasto = anosDeConsumo * 365 * cigarrosPorDia * valorCigarro  

print("O total gasto em cigarros é:", totalGasto)

