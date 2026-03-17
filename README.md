# Campo Minado em Java (Console)

Implementação do clássico jogo **Campo Minado**, desenvolvida em **Java** utilizando os princípios de **Programação Orientada a Objetos (POO)**.

O projeto roda diretamente no **console** e permite ao usuário interagir com o tabuleiro, abrindo campos, marcando minas e avançando até a vitória — ou explosão 💣.

---

## Funcionalidades

- Geração dinâmica do tabuleiro  
- Distribuição automática de minas  
- Abertura recursiva de campos sem minas vizinhas  
- Marcação e desmarcação de possíveis minas  
- Tratamento de exceções personalizadas (Explosão e Encerramento)  
- Interface simples e interativa via console  

---

## Tecnologias Utilizadas

- **Java 17**
- **JUnit 5** (testes unitários)
- **IntelliJ IDEA** (ou qualquer IDE Java)

---

## Estrutura do Projeto

campo-minado/
├── images/
│ └── img.png
├── src/
│ └── br/com/victor/cm/
│ ├── excecao/
│ │ ├── ExplosaoException.java
│ │ └── SairException.java
│ ├── modelo/
│ │ ├── Campo.java
│ │ └── Tabuleiro.java
│ └── visao/
│ ├── TabuleiroConsole.java
│ └── Aplicacao.java
├── test/
│ └── br/com/victor/cm/modelo/
│ └── CampoTeste.java
├── .gitignore
└── campo-minado.iml

---

## Como Executar

### Usando IntelliJ IDEA

1. Abra o projeto na IDE  
2. Localize a classe `Aplicacao`  
3. Execute o método `main()`  

---

### Usando Terminal (PowerShell/CMD)

1. Acesse a raiz do projeto:

```bash
cd C:\Users\teste\IdeaProjects\campo-minado

java -cp out br.com.victor.cm.visao.Aplicacao

<img width="685" height="758" alt="image" src="https://github.com/user-attachments/assets/e8d4216d-bb1f-4999-a703-7b6caf639a4f" />

Victor Gabriel Baraldi
🔗 https://www.linkedin.com/in/victor-baraldi-8333b9316
