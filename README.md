# dev-week-pdv

## Diagrama

```mermaid
classDiagram
    class PDV {
        -int id
        -int quantidade
        -double total
        -double subtotal
        -double desconto
        -ListaProdutos listaProdutos
    }

    class Produto {
        -int id
        -string descricao
        -double preco
    }

    PDV "1" --> "*" Produto : contém
