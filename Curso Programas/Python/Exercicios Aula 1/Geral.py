#Ex 1 Comentários e print()

# Declarei as variaveis que vou usar no codigo

nomeCompleto = "Nayra Kethuly Henrique Lima"  
cidadeOrigem = "Fortaleza"

# Fiz um print com quebra de linha pra ezibir minha mensagem no terminal incluindo as variaveis que usei

print(f"""
       Nome Completo: {nomeCompleto},
       Cidade de Origem: {cidadeOrigem},
       Motivacão: Estou aprendendo pythom por que um dia quero trabalhar com analise de dados
       e treinamento de IA, acho que é uma linguagem moderma muito poderosa e otima de se trabalhar!
       """)


#Ex 2 Criar uma Lista de Compras (Estrutura Simples)

item01 = "Pão"
valor01 = 1.21
item02 = "Arroz"
valor02 = 4.55
item03 = "Leite"
valor03 = 5.0

total = 0

total = valor01 + valor02 + valor03  # Soma dos valores dos itens

print (f"""
       Lista de Compras:
       
       Item 1: {item01}, Valor: R$ {valor01}
       Item 2: {item02}, Valor: R$ {valor02}
       Item 3: {item03}, Valor: R$ {valor03}
       
       Total: R$ {total}
       """)


# Ex 3 Trabalhar com Quebras de Linha

nome =  "Igris"

print("\n================================")

print(f" Olá  {nome}!\n Bem-vindo à nossa loja online.\n- Eletrónica \n- Moda \n- Casa e Jardim")

# Ex 4  Debugging (Corrigir Erros)

print("\n================================")

# Alteracao no nome da variavel agora em camel model da forma correta
meuNome = "Carla"
print("Olá " + meuNome) #Camel model
preco = 50 #Rmocao das aspas duplas nao fechadas
iva = preco * 0.23
print(preco + iva)

# Ex 5 Cálculos com Variáveis e Concatenação de Strings

largura = 12.0
altura = 8.5

area = largura * altura

print("\n================================")

print(f"Um retângulo com {largura}m de largura e {altura}m de altura tem uma área de {area}m².")

# Ex 6 Criar uma Mensagem com String Multi-line
print("\n================================")

nomeCliente = "Igor Andrade"

print(f"""
       Olá, {nomeCliente}!
       Obrigada pela sua compra!
       Seu pedido foi enviado com sucesso.
       
       Itens comprados:
       {item01}
       {item02}
       {item03}
       
       Total: R$ {total}
      """)

# Ex 7 Criatividade com Operadores e Variáveis

print("\n================================")

moedas = 100
tarefa = 50
item = 20 

moedas += tarefa
moedas -= item

print(f"Você tem {moedas} moedas.")

#Ex 8 Criar uma Receita com Variáveis e Print

print("\n================================")

igradiente01 = "farinha"
igradiente02 = "açúcar"
igradiente03 = "ovos"

quantidade01 = 200
quantidade02 = 100
quantidade03 = 2

print( f"""
       Receita: Bolo de Cereal
       Ingredientes:
       - {quantidade01}g de {igradiente01}
       - {quantidade02}g de {igradiente02}
       - {quantidade03} unidades de {igradiente03}
       
       """)
       
