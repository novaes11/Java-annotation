# Implementação e Operações em Árvore Binária de Busca (Relatório)
<hr>

## Visão Geral
O presente projeto foi desenvolvido como requisito da disciplina de <b>Estrutura de Dados (Árvores)</b> com o objetivo de consolidar os conceitos teóricos de estruturas de dados não lineares. A implementação constrói uma Árvore Binária de Busca do zero, evidenciando na prática como referências de memória (ponteiros) e algoritmos recursivos operam em conjunto para manter a integridade das regras da árvore durante operações críticas de inserção e exclusão
<hr>

## Lógica de Remoção de Nós
A funcionalidade de remoção foi projetada para cobrir os três cenários estruturais de uma árvore binária:

* **Remoção de Nó Folha:** Caso o nó removido seja um nó FOLHA, apenas será alterado o conteúdo para NULL, removendo assim o NÓ da árvore.
* **Remoção de Nó com Um Filho:** Caso o nó a ser removido possuir apenas um filho, o seu nó pai passará a apontar diretamente para esse filho, ignorando o nó excluído.
* **Remoção de Nó com Dois Filhos:** Caso o nó removido possui 2 filhos, será necessário buscar o nó sucessor (menor dos maiores) e substitituí-lo no lugar do nó removido, assim preservando a regra de estruturação da árvore. <b>OBS: é necessário remover o nó sucessor do seu local original para evitar a duplicitade.</b>
<hr>

## Método de Remoção para Nós com Dois Filhos
**Método Adotado:** Sucessor (Menor dos Maiores).

O sucessor é encontrado dando um passo para a direita(filhos maiores ao nó que será removido) e descendo para a esquerda até encontrar o nó menor. Devido à regra de estrutura das árvores binárias, é garantido que o valor encontrado seja o menor dos maiores (sucessor).
Comparando o método de busca Sucessor e Predecessor, ambos possuem o mesmo propósito e eficiência, no qual um busca o menor dos maiores e outro o maior dos menores.
Pessoalmente, optei pelo Sucessor pois foi o que me chamou a atenção primeiro e me fez entender de forma clara o funcionamento da remoção.
<hr>

## Abordagem da Implementação
**Abordagem Adotada na Remoção:** Recursiva.

Foi utilizado o método recursivo para manter a legibilidde e a coesão do código, ajudando na manipulação dos ponteiros e alinhamentos. Como uma Árvore binária é uma estrutura de dados propriamente recursiva (uma árvore é composta por um nó raiz e duas subárvores, que também são árvores).
OBS: Mesmo que a complexidade do algoritmo seja O(n), preferi desta forma para melhor compreensão da execução.
<hr>

## Percursos de Exibição
O algoritmo suporta a travessia e exibição dos nós em três formatos distintos:
* **Pré-Ordem:** Raiz, Esquerda, Direita
* **Em-Ordem:** Esquerda, Raiz, Direita
* **Pós-Ordem:** Esquerda, Direita, Raiz