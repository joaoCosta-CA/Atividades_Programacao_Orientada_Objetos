# Atividades de Programação Orientada a Objetos

Um conjunto de exercícios e exemplos em Java para praticar conceitos de Programação Orientada a Objetos (POO): classes, herança, classes/ métodos abstratos, interfaces, padrões de projeto e manipulação de números com BigDecimal.

## Stack
- **Linguagem:** Java
- **Requisitos:** JDK 11+ (ou JDK 8+ para exemplos simples)
- **Dependências notáveis:** nenhum gerenciador de dependências presente — exemplos usam apenas a biblioteca padrão Java.

## Como está organizado
Raiz do repositório (entries relevantes):
```
BigDecimal/         exemplos com java.math.BigDecimal (Account, AccountTest)
ClassAbstract/      exemplo de classe abstrata (Veiculo, Carro, Principal)
ExParaEntrega/      (exercícios para entrega — inspecionar conteúdos)
Heranca/            exemplos de herança
Interfaces/         exemplos com interfaces
PadroesDeProjeto/   exemplos de padrões de projeto
basico/             exercícios básicos
classes/            exercícios organizados por classes
exe_Prova/          exercícios/executáveis de prova
README.md           este arquivo (atualmente minimal)
```

Como as peças se encaixam:
- Cada pasta contém exemplos Java independentes. Alguns arquivos usam declaração de pacote (por exemplo `package ClassAbstract;`) e outros não. Para rodar os exemplos que têm pacote, é necessário respeitar a estrutura de diretórios ao compilar/executar (ou compilar a partir da raiz com classpath apropriado).

## Exemplos rápidos (como executar)
Pré-requisito: JDK instalado e variável PATH configurada (javac/java disponíveis).

Executar o exemplo BigDecimal (Account / AccountTest)
- Opção A — entrar na pasta:
  ```bash
  cd BigDecimal
  javac *.java
  java AccountTest
  ```
  O programa pedirá valores via teclado (Scanner). Informe números (ex.: 25.50).
- Opção B — compilar da raiz e executar com classpath:
  ```bash
  javac BigDecimal/*.java
  java -cp BigDecimal AccountTest
  ```

Executar o exemplo ClassAbstract (usa pacote `ClassAbstract`)
```bash
javac ClassAbstract/*.java
java -cp . ClassAbstract.Principal
```
(Compilar a partir da raiz garante que o pacote `ClassAbstract` seja resolvido corretamente.)

Compilar todos os fontes (Unix/macOS):
```bash
find . -name "*.java" -print | xargs javac
```
ou compile por diretório conforme necessário.
