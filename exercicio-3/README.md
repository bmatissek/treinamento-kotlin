Adivinhe o número aleatório

# Tarefas
- Crie um programa que gera um número aleatório entre 0 e 100 (inclusive);

- O programa deve receber um input do usuário pelo terminal através da chamada readLine(), que lê uma linha do terminal como uma String?;

- Caso o input seja inválido (número que não esteja entre 0..100, ou número inválido), o programa imprimir que o input foi inválido;
(Para isso, crie uma função de extensão da classe String? que retorna nulo caso a String não seja um número, ou seja um número fora do intervalo 0..100);

- Calcule a diferença entre o palpite do usuário e o número gerado. Caso a diferença seja:
 - 0 : imprima "Acertou!"
 - entre 1..10: imprima "Quase!"
 - entre 11..30 : imprima "Ainda falta bastante!"
 - entre 31..100 : imprima "Errou feio, errou rude"

- O programa deverá rodar até o usuário acertar o número, e informar o número de palpites necessários


# Objetivos
- Familiarizar-se com os conceitos de:
	- controle de fluxo (utiize a cláusula 'when' quando possível)
	- Nullable vs Non-Nullable Types
	- Null Safety em Kotlin, Elvis Operator e 'let'
	- Extension Functions

# Resultados esperados
- O programa deve fazer a validação correta do input, e imprimir as mensagens de acordo com a diferença entre o palpite e o número aleatório gerado (utilize 'when').
- O programa deve extender a Classe String? por meio de um método de extensão para validar se a String é um input válido
