# Atividades de Programação Orientada a Objetos

Um conjunto de exercícios e exemplos em Java para praticar conceitos de Programação Orientada a Objetos (POO): classes, herança, classes/ métodos abstratos, interfaces, padrões de projeto e manipulação de números com BigDecimal. Destina-se a estudantes e quem está aprendendo Java/POO.

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

## Observações específicas sobre arquivos que inspeccionamos
- BigDecimal/Account.java, BigDecimal/AccountTest.java — exemplo de manipulação de saldo usando BigDecimal; AccountTest usa Scanner para entrada.
- ClassAbstract/Veiculo.java, ClassAbstract/Carro.java, ClassAbstract/Principal.java — demonstra classe abstrata, implementação concreta e uso no método main.

## Boas práticas sugeridas
- Padronizar pacotes (ex.: `br.edu.exercicios.*`) para toda a árvore de fontes, facilitando builds automatizados.
- Adicionar um build tool (Maven/Gradle) para compilar/executar testes automaticamente.
- Incluir testes unitários (JUnit) para exemplos que comportam verificação automática (por exemplo, comportamentos de Account e outras classes).

## Como contribuir
- Abra uma issue descrevendo a melhoria ou bug.
- Envie PRs com um único objetivo por PR (ex.: adicionar Gradle, adicionar README por diretório, adicionar testes).
- Mantenha o estilo do código consistente e adicione instruções de execução quando adicionar novos exercícios.

## Perguntas que podem ser úteis
- Quer que eu adicione um arquivo de build (Gradle ou Maven) para compilar e executar todos os exercícios com um só comando?
- Deseja que eu padronize os pacotes e atualize os arquivos para seguir convenções (por exemplo, mover arquivos sem `package` para pacotes)?
- Quer que eu crie instruções detalhadas por pasta (README em cada diretório) ou adicione exemplos de testes JUnit para Account e outras classes?

---
Licença: escolha uma licença (por exemplo MIT) e adicione um arquivo LICENSE se quiser compartilhar.
