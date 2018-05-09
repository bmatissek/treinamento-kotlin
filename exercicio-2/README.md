Formas geométricas

## Tarefas
- Crie uma interface FormaGeometrica, que possui os métodos 'calcularArea() : Double' e 'printFormaGeometrica()';
- Crie três classes que implementam esta interface com as seguintes propriedades privadas e somente leitura, com os respectivos construtores:
 
	- Retangulo, com 'largura' e 'altura'
	- Triangulo, com  'base' e 'altura'
	- Circulo, com 'raio';

- Sobreescreva os métodos da interface 
OBS: printFormaGeometrica() deve imprimir na tela as dimensões da forma geométrica, bem como a área.

Exemplo:

```
val retangulo = Retangulo(2.5, 4.0) 
retangulo.printFormaGeometrica()
```

Output:
Sou um retangulo de largura 2.5 e altura 4.0. Minha área é 10.0.

- No método main, declare uma lista contendo no mínimo 3 formas diversas, e faça a iteração pela lista realizando a chamada do método printFormaGeometrica()

## Objetivos
- Familiarizar-se inicialmente com os conceitos de:
	- variáveis em Kotlin, e com a diferença entre 'var' e 'val';
	- classes, construtores, interfaces e métodos;
- Contato inicial básico com Listas

## Resultados esperados
- O programa deverá imprimir os dados relativos a no mínimo três formas geométricas de tipos distintos, iterando por uma lista de Formas Geométricas. É obrigatório que isto seja feito pelo método sobreescrito da Interface.
