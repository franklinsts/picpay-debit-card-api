# picpay-debit-card-api

## API Rest

#### Para simular processo de transação com cartão no Picpay.

Precisamos salvar, listar, editar cartões, clientes, saldos e transacionar.
As transações devem checar o saldo do usuário, retornar sucesso de compra e debitar o valor em caso de saldo suficiente e negar a transação devolvendo uma mensagem de erro em casa de cartão bloqueado, ou conta bloqueada, saldo insuficiente, ou cartão expirado.

Requisitos técnicos
Java 17
Spring 3
MongoDB
Github

Requisitos Não funcionais:
Utilizar arquitetura limpa (https://medium.com/luizalabs/descomplicando-a-clean-architecture-cf4dfc4a1ac6)


Campos sugeridos para a collection de cartões
consumer_id:
block_code: (R, roubo, P perdido, T bloqueio temporário)
status: (ATIVO, INATIVO)
type: (PHYSICAL, VIRTUAL)
expiry_date:
numero do cartao:

Campos sugeridos para a collection de conta:
consumer_id:
block_code:(J, Bloqueio judicial, O Bloqueio por obito)
status:(ATIVO, INATIVO)
saldo

Lembrando que um usuário pode ter mais de um cartão, porém somente um saldo.

A camada de Service/Gateway deve estar coberta por testes unitários, e pelo menos um teste de integração utilizando @SpringBootTest

Collection para transações que armazena dados de cada transação, independentemente de sucesso ou erro.

Quando um cartão ou conta for bloqueada, deve ser salvo numa collection de histórico, o bloqueio anterior, o bloqueio atual e a data da atualização.

