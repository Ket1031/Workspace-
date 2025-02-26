def saudacao():
    print("Olá, seja bem vindo ao meu programa!")
    
saudacao()

# aluno = {
#     "nome": "Igris",
#     "idade": 18
# }

# def apresentacao():
#     print(f"O aluno {aluno} tem {idade} anos")
    
# apresentacao()



def soma(a,b):
    return a + b

resultado = soma(5, 10)

print(f"O resultado da soma é {resultado}")

def criarAluno(nome, idade, curso):
    return {
        "nome": nome,
        "idade": idade,
        "curso": curso
    }
    
aluno = criarAluno("Igris", 18, "Engenharia Informática")

print(aluno)