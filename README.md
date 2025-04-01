# Sistema de Animais em Java P.O.O
## Professor: Marcelo Yamamoto

Este projeto implementa um sistema de animais utilizando Programação Orientada a Objetos (P.O.O) em Java. O sistema inclui uma classe base `Animal` e duas classes derivadas `Cachorro` e `Gato`, cada uma com comportamento específico.

## 📌 Funcionalidades
- Criação de animais com nome, idade e peso.
- Exibição dos dados dos animais.
- Sobrescrita do método `falar()` para cada tipo de animal.

## 🏗 Estrutura do Código

O projeto contém as seguintes classes:

### 1️⃣ **Classe `Animal`** (Superclasse)
- Atributos:
  - `nome` (String)
  - `idade` (int)
  - `peso` (double)
- Métodos:
  - `falar()` → (deve ser sobrescrito pelas subclasses)
  - `toString()` → Exibe as informações do animal.

### 2️⃣ **Classe `Cachorro`** (Subclasse de `Animal`)
- Sobrescreve o método `falar()` para exibir: _"O cachorro late: Au Au!"_

### 3️⃣ **Classe `Gato`** (Subclasse de `Animal`)
- Sobrescreve o método `falar()` para exibir: _"O gato mia: Miau!"_

### 4️⃣ **Classe `Principal`** (Executável)
- Instancia objetos de `Cachorro` e `Gato`.
- Exibe as informações e sons de cada animal.

## 🚀 Como Executar
1. Certifique-se de ter o [JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) instalado.
2. Compile o código com o seguinte comando:
   ```sh
   javac Principal.java
   ```
3. Execute o programa:
   ```sh
   java Principal
   ```

## 📌 Exemplo de Saída
```sh
Nome: Rex, Idade: 5 anos, Peso: 12.3 kg
O cachorro late: Au Au!
Nome: Mia, Idade: 3 anos, Peso: 4.5 kg
O gato mia: Miau!
```

## 📜 Licença
Este projeto é de domínio público e pode ser utilizado livremente.