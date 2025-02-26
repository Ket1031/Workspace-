# ficha de estudante 


#Dados da instituicao

print("\n==============(dados da instituicao)==================")

nomeInstituicao = input("Digite o nome da instituicao: ")
cidade = input("Digite a cidade: ")

#Dados pessoais 

print("\n==============(dados pessoais)==================")

nome = input("Digite o nome: ")
idade = int(input("Digite a idade: "))
morada = input("Digite a morada: ")
nif = input("Digite o nif: ")


# Dados escolores

print("\n==============(dados escolares)==================")

anoEscolar = int(input("Digite o ano escolar: "))
curso = input("Digite o curso: ")
turma = input("Digite a turma: ")
anoLetivo = input("Digite o ano letivo: ")


print(f"""
      Ficha de Estudante
      ------------------------
      Instituicao: {nomeInstituicao}
      Cidade: {cidade}
      ------------------------
      Nome: {nome}
      Idade: {idade}
      Morada: {morada}
      NIF: {nif}
      ------------------------
      Escolar: {anoEscolar}
      Curso: {curso}
      Turma: {turma}
      Ano Letivo: {anoLetivo}
      ------------------------
      """)



