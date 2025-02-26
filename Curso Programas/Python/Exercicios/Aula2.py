import random
number =  random.randint(1, 4)


cabaz1 = ["Arroz", "Leite","Cereal","Manteiga"]

cabaz2 = ["Feijão","Farinha","Batata","Alface"]

cabaz3 = ["Maçã","Pão","Biscoito","Café"]

print("-------------(Pegue seu cartaz)-------------------")



if number == 1:
    print( cabaz1)
    print(f"O segundo item é {cabaz1[1]}.")

elif number == 2:
    print(cabaz2)
    print(f"O segundo item é {cabaz2[1]}.")

elif number == 3:
    print(cabaz3)
    print(f"O segundo item é {cabaz3[1]}.")
    
elif number == 4:
    print("Não há premio para você")    
else:
    print("Erro na sorteio, tente novamente")



print("\n-------------------------------------------------")

