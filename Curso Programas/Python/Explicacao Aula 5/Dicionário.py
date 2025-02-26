aluno = {
    "nome": "Igris",
    "idade": 18,
    "matricula": "2022001",
    "turma": "1B"
    
}
#mostrar

print(aluno)
print(aluno["nome"])
print(aluno.get("curso"))

#modificar

aluno["nome"] = "Lia"
aluno["Nota"] = 19

print(aluno)

#remover

aluno.pop("matricula")

aluno.popitem()

aluno.clear()

