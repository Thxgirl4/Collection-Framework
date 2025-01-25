
# Collection Framework

A Coleção em Java é um framework que fornece uma arquitetura para armazenar e manipular o grupo de objetos.

As coleções Java podem realizar todas as operações que você realiza em dados, como pesquisa, classificação, inserção, manipulação e exclusão.

Java Collection significa uma única unidade de objetos. O framework Java Collection fornece muitas interfaces (Set, List, Queue, Deque) e classes ( ArrayList , Vector, LinkedList , PriorityQueue , HashSet, LinkedHashSet, TreeSet).



## Hierarquia da Estrutura de Coleta

Vamos ver a hierarquia do framework Collection. O pacote java.util contém todas as classes e interfaces para o framework Collection.

O Java Collections Framework é estruturado em torno de interfaces-chave: 
Collection, List, Set, Queue e Map. Cada uma adaptada para tarefas específicas de gerenciamento de dados. Implementações como ArrayList, HashSet e HashMap oferecem soluções práticas para trabalhar com essas coleções, dando aos desenvolvedores Java um conjunto versátil de ferramentas para tratamento eficiente de dados.

![image](https://github.com/user-attachments/assets/b837604c-a17c-4302-93f3-a95c23e4f4e2)





### Interface Iterable em Java
A interface Iterable é uma parte fundamental do framework de coleções do Java. 
Ela serve como a interface raiz para todas as coleções que podem ser iteradas, ou seja, todas as coleções que podem ser percorridas de forma sequencial. 
A interface Iterable é estendida pela interface Collection, e isso significa que qualquer classe que implemente Collection automaticamente implementa Iterable.


### Explicação do Método iterator()
O método iterator() é o que permite que você percorra a coleção de forma sequencial. 
Ele retorna um Iterator, que é uma interface responsável por permitir a iteração sobre a coleção. O iterador tem dois métodos principais:

hasNext(): Verifica se há mais elementos para iterar.
next(): Retorna o próximo elemento da coleção.

### Interface List em Java
A interface List é uma subinterface da interface Collection em Java. 

Ela define uma coleção de elementos ordenados, onde os elementos podem ser acessados por índice e podem ser duplicados.

Características da interface List:

Ordenação: A List mantém a ordem dos elementos conforme foram inseridos. Ou seja, o primeiro elemento inserido será o primeiro a ser retornado.

Elementos duplicados: Diferentemente de outras coleções (como Set), a List permite que elementos duplicados sejam inseridos.

Acesso por índice: A List permite que os elementos sejam acessados diretamente pelo índice (começando de 0).

#### 1. ArrayList
A classe ArrayList utiliza um array dinâmico para armazenar os elementos. Ela mantém a ordem de inserção, não é sincronizada e é eficiente no acesso aos elementos por índice.

#### 2. LinkedList
A classe LinkedList implementa a interface List e utiliza uma lista duplamente encadeada internamente. Ela também mantém a ordem de inserção e permite elementos duplicados, sendo mais eficiente para operações de inserção e remoção no meio da lista.

#### 3. Stack
A classe Stack é uma subclasse de Vector que implementa a estrutura de dados Pilha (LIFO – Last In, First Out). 
Ela possui métodos como push(), pop(), e peek() para manipulação de elementos.
Embora o Stack ainda seja parte da biblioteca Java, o uso de Deque ou outras estruturas de dados mais modernas é preferido em muitos casos.

#### Conclusão
A interface List em Java é uma parte essencial do framework de coleções e é implementada por várias classes como ArrayList, LinkedList, Vector e Stack. Cada uma dessas classes tem características diferentes, como sincronização e eficiência em operações específicas, e você pode escolher qual delas usar com base nas suas necessidades.
Se você precisar de um acesso rápido e eficiente por índice, ArrayList pode ser uma boa escolha. 
Para inserções e remoções frequentes no meio da lista, LinkedList pode ser mais apropriada. 
Se a sincronização for necessária em um ambiente multi-thread, o Vector pode ser útil, mas em muitos casos o ArrayList será suficiente.



### Set interface em Java
A interface Set em Java está presente no pacote java.util. 
Ela estende a interface Collection. 
Ela representa o conjunto não ordenado de elementos que não nos permite armazenar os itens duplicados. Podemos armazenar no máximo um valor nulo em Set. Set é implementado por HashSet, LinkedHashSet e TreeSet.

#### 1.Conjunto de Hashes
A classe HashSet implementa a interface Set. Ela representa a coleção que usa uma tabela hash para armazenamento. O hash é usado para armazenar os elementos no HashSet. Ele contém itens exclusivos.

#### 2.Conjunto de Hashes Vinculados
A classe LinkedHashSet representa a implementação LinkedList da interface Set. Ela estende a classe HashSet e implementa a interface Set. Como HashSet, ela também contém elementos exclusivos. Ela mantém a ordem de inserção e permite elementos nulos.

#### 3.Interface SortedSet
SortedSet é a alternativa da interface Set que fornece uma ordenação total em seus elementos. Os elementos do SortedSet são organizados em ordem crescente (ascendente). O SortedSet fornece os métodos adicionais que inibem a ordenação natural dos elementos.
#### 4.Conjunto de árvores
A classe Java TreeSet implementa a interface Set que usa uma árvore para armazenamento. Como HashSet, TreeSet também contém elementos exclusivos. No entanto, o tempo de acesso e recuperação de TreeSet é bem rápido. Os elementos em TreeSet são armazenados em ordem crescente.

### Map interface em Java 
A interface Map em Java faz parte do Java Collections Framework. 
Ela representa um mapeamento entre um conjunto de chaves e seus valores correspondentes. Um Map não pode conter chaves duplicadas; cada chave pode mapear para no máximo um valor. 
A interface Map é usada para armazenar pares chave-valor, onde cada chave é única, e fornece uma maneira eficiente de recuperar, atualizar e manipular dados com base em chaves.

#### 1.Classe HashMap
A classe HashMap é uma das implementações mais comuns da interface Map em Java. Ela usa uma tabela de hash para armazenar os pares chave-valor, permitindo acesso rápido aos dados.

**Eficiência**: O HashMap oferece desempenho constante (O(1)) para operações como put(), get() e remove(), desde que a função de hash seja eficiente.

**Não ordenado**: O HashMap não mantém os elementos em qualquer ordem específica. Se a ordem dos elementos for importante, deve-se considerar outras implementações, como o TreeMap.

**Permite null**: Um HashMap pode armazenar um null como chave ou valor (desde que não haja mais de um null para as chaves).

#### SortedMap e TreeMap
A interface *SortedMap* estende a interface Map e fornece uma ordem para as chaves. 
A classe *TreeMap* é a principal implementação de SortedMap e mantém as chaves ordenadas.

**Diferenças entre HashMap e TreeMap**: Enquanto o HashMap não mantém a ordem dos elementos, o TreeMap mantém as chaves ordenadas de acordo com a ordem natural ou conforme um Comparator fornecido.

**Hashing e performance**: O HashMap usa o algoritmo de hashing para garantir acesso rápido aos dados, o que pode ser mais eficiente para buscas, inserções e remoções em grandes conjuntos de dados.

#### Principais Métodos da Interface Map

**size():** Retorna o número de mapeamentos (pares chave-valor) presentes no mapa. Essa é uma maneira rápida de verificar o tamanho de sua estrutura.

**isEmpty():** Verifica se o mapa está vazio. Retorna true caso o mapa não contenha nenhum mapeamento.

**containsKey(Object key):** Permite verificar se o mapa contém uma chave específica. É ótimo para saber se um item já está presente antes de tentar acessá-lo ou modificá-lo.

**containsValue(Object value):** Similar ao containsKey, mas verifica se um valor está presente no mapa, independente da chave associada a ele.

**get(Object key):** Retorna o valor associado a uma chave específica. Se a chave não existir, retorna null.

**put(K key, V value):** Associa um valor a uma chave no mapa. Se a chave já existir, o valor anterior será substituído.

**remove(Object key):** Remove o mapeamento da chave especificada. Isso é útil quando você precisa apagar um item do mapa.

**clear():** Remove todos os elementos do mapa, essencial quando você deseja reiniciar a estrutura.

**keySet():** Retorna um conjunto (Set) das chaves no mapa. Muito útil quando você precisa iterar sobre todas as chaves.

**values():** Retorna uma coleção (Collection) com todos os valores no mapa, permitindo iterar sobre eles.

**entrySet():** Retorna um conjunto de entradas (pares chave-valor) do mapa. Essa abordagem é útil quando você precisa de acesso a ambas as chaves e valores de uma vez.

#### Quando Usar Map?
A interface Map é ideal para situações onde precisamos associar chaves a valores. 

Por exemplo:
- Um diretório de contatos, onde o nome da pessoa é a chave e o número de telefone é o valor.
- Um dicionário, onde a palavra é a chave e sua definição é o valor.
- Um sistema de cache, onde você armazena valores temporários com base em uma chave única.


