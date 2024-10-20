# Ganhando Produtividade com Stream API e Java

A Streams API traz uma nova opção para a manipulação de coleções em Java seguindo os princípios da programação funcional. Stream trata-se de uma poderosa solução para processar coleções de maneira declarativa, ao invés da tradicional e burocrática forma imperativa.

## Exemplo Imperativo

```java
public class CarrinhoDeCompras { 
  // Atributos
  private List<Item> itemList;

  // Construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  // Método para calcular valor total dos itens sem utilizar o Stream API
  public double calcularValorTotal() {
    double valorTotal = 0d;
    if (!itemList.isEmpty()) {
      for (Item item : itemList) {
        double valorItem = item.getPreco() * item.getQuant();
        valorTotal += valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
```

Na forma imperativa, para realizar uma soma simples, por exemplo, o desenvolvedor tem que se preocupar não apenas com o que deve ser feito em cada elemento, mas também com a maneira de realizar essa iteração.

# Exemplo com Stream API

```java
public class CarrinhoDeCompras {
  // Atributos
  private List<Item> itemList;

  // Construtor
  public CarrinhoDeCompras() {
    this.itemList = new ArrayList<>();
  }

  // Método para calcular valor total dos itens utilizando o Stream API
  public double calcularValorTotal() {
    if (itemList.isEmpty()) {
      throw new RuntimeException("A lista está vazia!");
    }
    return itemList.stream()
        .mapToDouble(item -> item.getPreco() * item.getQuant())
        .sum();
  }
}
```

Combinada com as Expressões Lambda e Method Reference, a Stream API oferece uma maneira simples e concisa de escrever código, facilitando a manutenção e a paralelização sem efeitos indesejados em tempo de execução.

# Operações na Stream API

## Operações Intermediárias

São operações que retornam uma nova Stream e permitem encadear várias operações, formando um pipeline de processamento de dados.

* filter(Predicate<T> predicate): Filtra elementos com base em um predicado.
Exemplo: stream.filter(n -> n > 5)

* map(Function<T, R> mapper): Transforma elementos usando uma função.
Exemplo: stream.map(s -> s.toUpperCase())

* sorted(): Classifica os elementos da Stream.
Exemplo: stream.sorted()

* distinct(): Remove duplicados da Stream.
Exemplo: stream.distinct()

* limit(long maxSize): Limita a quantidade de elementos.
Exemplo: stream.limit(10)

* skip(long n): Pula os primeiros n elementos.
Exemplo: stream.skip(5)

## Operações Terminais

São operações que encerram o pipeline de processamento e produzem um resultado final:

- **forEach(Consumer<T> action)**: Executa uma ação para cada elemento.  
  Exemplo: `stream.forEach(System.out::println)`

- **toArray()**: Converte a Stream em um array.  
  Exemplo: `stream.toArray()`

- **collect(Collector<T, A, R> collector)**: Coleta os elementos em uma estrutura de dados específica.  
  Exemplo: `stream.collect(Collectors.toList())`

- **count()**: Retorna o número de elementos.  
  Exemplo: `stream.count()`

- **anyMatch(Predicate<T> predicate)**: Verifica se algum elemento atende ao predicado.  
  Exemplo: `stream.anyMatch(s -> s.startsWith("A"))`

- **allMatch(Predicate<T> predicate)**: Verifica se todos os elementos atendem ao predicado.  
  Exemplo: `stream.allMatch(n -> n > 0)`

- **noneMatch(Predicate<T> predicate)**: Verifica se nenhum elemento atende ao predicado.  
  Exemplo: `stream.noneMatch(s -> s.isEmpty())`

- **min(Comparator<T> comparator)** e **max(Comparator<T> comparator)**: Encontra o menor e o maior elemento, respectivamente.  
  Exemplo: `stream.min(Comparator.naturalOrder())`

- **reduce(T identity, BinaryOperator<T> accumulator)**: Combina os elementos usando um acumulador.  
  Exemplo: `stream.reduce(0, (a, b) -> a + b)`

## Lambda

Expressões lambda permitem representar interfaces funcionais de forma mais concisa, possibilitando escrever código no estilo funcional.

### Exemplo de ordenação com expressão lambda:

```java
public class OrdenacaoPessoa {
  // atributo
  private List<Pessoa> pessoaList;

  // construtor
  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
```

## Method Reference

**Method Reference** é um recurso do Java 8 que permite fazer referência a um método ou construtor, tornando o código mais legível.

### Exemplo:

```java
public class OrdenacaoPessoa {
  // atributo
  private List<Pessoa> pessoaList;

  // construtor
  public OrdenacaoPessoa() {
    this.pessoaList = new ArrayList<>();
  }

  public List<Pessoa> ordenarPorAltura() {
    if (!pessoaList.isEmpty()) {
      List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
      pessoasPorAltura.sort(Comparator.comparingDouble(Pessoa::getAltura));
      return pessoasPorAltura;
    } else {
      throw new RuntimeException("A lista está vazia!");
    }
  }
}
```

## Referências

[1] "Java Stream API - Oracle." Oracle Brasil. Disponível em: [Oracle Brasil](https://www.oracle.com/br/technical-resources/articles/java-stream-api.html).

[2] "Java Collections API Examples - cami-la." GitHub. Disponível em: [GitHub - cami-la](https://github.com/cami-la/collections-java-api-2023).

[3] "Como usar funções functional_interface em Java - DevMedia." DevMedia. Disponível em: [DevMedia](https://www.devmedia.com.br/como-usar-funcoes-lambda-em-java/32826).
