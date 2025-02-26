import random
number =  random.randint(1, 9)

print("\n-----------(Bola Mágica)------------")

print("-------------------------------------")
nome = input("Digite seu nome: ")
print(f"\nOlá {nome}! Vamos comecar!\n")
pergunta = input("Faca uma pergunta: ")

print("-------------------------------------")

print(f"{nome} pergunta: {pergunta}")
print("\nResposta: ", end="")

if number == 1:
    print("Sim, com certeza!")
elif number == 2:
    print("É maluquice, com certeza!")
elif number == 3:
    print("Provavelmente.")
elif number == 4:
    print("Não tenha certeza.")
elif number == 5:
    print("Claro! ... que não.")
elif number == 6:
    print("Me pergunte depois.")
elif number == 7:
    print("Não, com certeza não.")
elif number == 8:
    print("É uma idiotice.")
elif number == 9:
    print("Minhas fontes dizem que não.")
else:
    print("Erro! Numero fora do range!")
    
print("-------------(fim)-------------------")

    


