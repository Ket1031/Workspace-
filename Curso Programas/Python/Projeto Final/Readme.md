# FlaskBlog - Documentação

## Visão Geral
FlaskBlog é um projeto desenvolvido com Flask, um microframework para Python. Ele permite a criação de um blog simples onde os usuários podem criar, editar e excluir postagens.

## Requisitos
Antes de executar o projeto, certifique-se de ter os seguintes itens instalados:

- Python 3.11 ou superior
- Flask
- Outros pacotes listados no `requirements.txt`

## Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/seuusuario/FlaskBlog.git
   ```
2. Entre no diretório do projeto:
   ```bash
   cd FlaskBlog
   ```
3. Crie um ambiente virtual e ative-o:
   - Windows:
     ```powershell
     python -m venv venv
     venv\Scripts\activate
     ```
   - Linux/macOS:
     ```bash
     python3 -m venv venv
     source venv/bin/activate
     ```
4. Instale as dependências:
   ```bash
   pip install -r requirements.txt
   ```

## Executando o Projeto
Para iniciar o servidor Flask, execute:
```bash
python app.py
```
Se estiver em modo de desenvolvimento, ative o modo debug:
```bash
set FLASK_ENV=development  # Windows
export FLASK_ENV=development  # Linux/macOS
python app.py
```

## Estrutura do Projeto
```
FlaskBlog/
│-- static/           # Arquivos estáticos (CSS, JS, imagens)
│-- templates/        # Templates HTML
│-- app.py            # Arquivo principal do Flask
```

## Funcionalidades

- Criar postagens
- Interface responsiva 

## API (Se aplicável)
Se o projeto expõe endpoints de API, liste-os aqui.

## Deploy
Para colocar o FlaskBlog em produção, utilize um servidor WSGI como Gunicorn:
```bash
gunicorn -w 4 -b 0.0.0.0:8000 app:app
```
Ou configure com Nginx + Gunicorn para um ambiente mais seguro.

## Contribuição
Se quiser contribuir com o projeto, abra um pull request ou relate um problema.

## Licença
Este projeto está sob a licença MIT. Veja `LICENSE` para mais informações.

