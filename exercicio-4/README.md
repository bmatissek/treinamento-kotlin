## Exercício 4:

Lista de Alunos aprovados (projeto com Gradle)

# Tarefas
- Crie um novo projeto com Gradle + Kotlin pelo Intelij IDEA

- Faça o Download do arquivo "listaAlunos.json". Seu programa deve ler a lista de alunos contida neste arquivo, e gerar um arquivo "listaAprovados.json" contendo
a lista dos alunos aprovados (nota >= 7)

- Gere também um arquivo "estatisticasAlunos.json" contendo
 * o número de alunos aprovados
 * o número de alunos reprovados
 * se alguém gabaritou a prova (nota == 10) (booleano)
 * se alguém zerou a prova
 * o número de notas abaixo de 5
 * a média da turma


- No método main, declare uma lista contendo no mínimo 3 formas diversas, e faça a iteração pela lista realizando a chamada do método printFormaGeometrica()

# Objetivos
- Praticar a integração de JSON com Kotlin
- Contato com lâmbdas e predicados 'any', 'count'


# Resultados esperados
- O programa deverá gerar os dois arquivos

Considerações


- Para setup do projeto, utilize o Wizard de criação de um projeto Gradle via Intelij IDEA. Consulte também:
https://github.com/JetBrains/kotlin-examples/blob/master/gradle/hello-world/

- Para o tratamento de JSON no Kotlin, é recomendável a instalação de uma biblioteca. Sugere-se o kotlinx.serialization
https://github.com/Kotlin/kotlinx.serialization

- Outra fonte de consulta interessante
https://medium.freecodecamp.org/my-favorite-examples-of-functional-programming-in-kotlin-e69217b39112 

