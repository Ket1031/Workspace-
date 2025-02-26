# Importa as bibliotecas necessárias do Flask e outras utilitárias
from flask import Flask, render_template, request, redirect, url_for
import os
from werkzeug.utils import secure_filename

# Inicializa a aplicação Flask
app = Flask(__name__)
# Configura a pasta de uploads para armazenar as imagens enviadas
app.config['UPLOAD_FOLDER'] = 'static/uploads'

# Lista para armazenar os posts (em vez de uma base de dados para simplicidade)
posts = []

# Rota principal que exibe a página inicial com a lista de posts
@app.route('/')
def index():
    return render_template('index.html', posts=posts)

# Rota para criar um novo post, aceita métodos GET e POST
@app.route('/new_post', methods=['GET', 'POST'])
def new_post():
    if request.method == 'POST':
        # Obtém o título e a descrição do formulário
        title = request.form['title']
        description = request.form['description']
        # Obtém o arquivo de imagem do formulário
        file = request.files['file']

        # Se um arquivo foi enviado, processa-o
        if file:
            # Garante que o nome do arquivo é seguro
            filename = secure_filename(file.filename)
            # Salva o arquivo na pasta de uploads
            file.save(os.path.join(app.config['UPLOAD_FOLDER'], filename))
            # Define a URL da imagem
            image_url = os.path.join(app.config['UPLOAD_FOLDER'], filename)
        else:
            image_url = None

        # Cria um dicionário com os dados do post
        post = {
            'title': title,
            'description': description,
            'image_url': image_url
        }
        # Adiciona o post à lista de posts
        posts.append(post)
        # Redireciona para a página inicial após o envio do post
        return redirect(url_for('index'))

    # Se o método for GET, renderiza a página de criação de novo post
    return render_template('new_post.html')

# Executa a aplicação Flask no modo debug
if __name__ == '__main__':
    app.run(debug=True)
