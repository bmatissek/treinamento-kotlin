Prática com Generics

## Tarefas
- Crie sua própria implementação da estrutura HashMap:
	- Sua classe deve trabalhar com dois tipos genéricos: K (referente a chave) e  V (referente ao valor) 
	- O tipo K não pode ser nulo 
	- No construtor, deve ser informado o tamanho do HashMap. Caso não seja informado, forneça um valor padrão (e.g 32)

- Implementente as seguintes operações:
	- add (key : K, value : V)
	- get (key : K) : V? : value

- Implemente também um método que imprima na tela cada par chave, valor (K,V) na tela. 

- Verifique sua implementação da mesma forma feita no exercício 5 (mapeando caracteres para um inteiro representando o número de ocorrências)   

## Objetivos
- Praticar o uso de conceitos de OO e Generics em Kotlin

## Resultados esperados
- Implementação própria de um HashMap, contendo operações de adicionar par chave, valor no mapa e recuperar elemento a partir da chave
- Siga os princípios de encapsulamento das propriedades e métodos

## Considerações
- Considere a implementação da classe HashNode dentro de uma classe privada, interna da classe HashMap
 
- https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/
Esta referência mostra uma implementação de uma HashMap (um pouco mais completa) em Java.
Faça o exercício em Kotlin e compare as implementações, principalmente no que diz respeito à redução de Boilerplate


