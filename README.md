🎮 Campo Minado em Java (Console)
Implementação do clássico Campo Minado em Java , utilizando Programação Orientada a Objetos (POO) .
O jogo roda no console permite abrir campos, marcar minas e vencer ou perder conforme as jogadas.

🚀 Funcionalidades
Geração dinâmica do tabuleiro.
Distribuição estimada de minas.
Abertura recursiva de campos sem minas vizinhas.
Marcação e desmarcação de minas.
Exceções personalizadas para controle de fluxo (Explosão, Sair).
Interface via console.
🛠 Tecnologias Utilizadas
Java 17
JUnit 5 (testículos)
IntelliJ IDEA (ou qualquer IDE Java)
📂 Estrutura do Projeto
campo-minado/
├── .idea/
├── images/
│   └── img.png
├── out/
├── src/
│   └── br/com/victor/cm/
│       ├── excecao/
│       │   ├── ExplosaoException.java
│       │   └── SairException.java
│       ├── modelo/
│       │   ├── Campo.java
│       │   └── Tabuleiro.java
│       └── visao/
│           ├── TabuleiroConsole.java
│           └── Aplicacao.java
├── test/
│   └── br/com/victor/cm/modelo/
│       └── CampoTeste.java
├── .gitignore
└── campo-minado.iml


▶️Como Executar
🔹 Sem IntelliJ IDEA
Abra o projeto no IntelliJ.
Clique com o botão direito em Aplicação → Execute 'Aplicacao.main()' .
O jogo será executado no console da IDE.
🔹 Sem Terminal (PowerShell/CMD)
Vá até a raiz do projeto: cd C:\Users\teste\IdeaProjects\campo-minado 2 - java -cp out br.com.victor.cm.Aplicacao

📸 Demonstração
![Demonstração do Campo Minado](https://raw.githubusercontent.com/VictorBaraldii/campo-minado/main/images/img.png)



👤 Autor

Victor Gabriel Baraldi www.linkedin.com/in/victor-baraldi-8333b9316

📌 Projeto desenvolvido como parte dos estudos em Java POO.
