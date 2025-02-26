#print programa de vendas 

#variaveis 

#mes = "marco"
#vendas = "1000"
#despesas = "500"
#lucro = vendas - despesas

#print(f" O lucro do mes de {mes} é {lucro}€")

 
 #input 
 
# mes = input("Qual o mês deseja verificar?")
# vendas = float(input("Qual o valr das vendas: "))
# despesas = float(input("Qual a despesa do mês: "))

# resuultadoMes = vendas - despesas

# print(f"O resultado do mês de {mes} é {resuultadoMes}£")

# #condicionais

# if resuultadoMes > 0:
#     print(f"O resultado do mês de {mes} é {resuultadoMes}, Resltado lucrativo") 

# elif resuultadoMes == 0:
#     print(f"O resultado do mês de {mes} é {resuultadoMes}, Resultado igual a zero")
# else:
#     print(f"O resultado do mês de {mes} é {resuultadoMes}, Resultado com prejuizo")
    

#Listas 

listaProdutos = ["websites", "consultorias"]
listaProdutos.append("formacao")
listaProdutos.pop()
listaProdutos.insert(0, "formacao")
listaProdutos.remove("websites")
listaProdutos.append("websites")
print(listaProdutos)

#for

for produto in listaProdutos:
    print(produto)


#while

contador = 10
while contador >=0:
    print(contador)
    contador -= 1
    
print("bye bye ")