p1=float(input("insira o primeiro valor "))
p2=float(input("insira o segundo valor"))
p3=float(input("insira o terceiro valor"))

if p1>p2 and p1>p3:
    pMax=p1
elif p2>p3:
    pMax=p2
else:
    pMax=p3
    
print("o maior preco é o ", pMax)