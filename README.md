
<h1 align="center">Desafio Técnico Api</h1>

<p align="center">Api rest com intuito de criar ações para votações</p>

### Features

- [x] Cadastrar uma nova pauta
- [ ] Abrir uma sessão de votação em uma pauta (a sessão de votação deve ficar aberta por um tempo determinado na chamada de abertura ou 1 minuto por default)
- [ ] Receber votos dos associados em pautas (os votos são apenas 'Sim'/'Não'. Cada associado é identificado por um id único e pode votar apenas uma vez por pauta
- [ ] Contabilizar os votos e dar o resultado da votação na pauta

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Spring](https://spring.io/)

### 🎲 Usando a Api (servidor)

```bash

# Para pegar todas as ações cadastradas - Requisição tipo GET
- https://desafio-tecnico-api.herokuapp.com/acao

# Para cadastrar ação - Requisição tipo POST
- https://desafio-tecnico-api.herokuapp.com/acao

Exemplo Requisição: 

{
	"campo1": "valor3",
	"campo2": 12345,
	"idCampoTexto": "Texto2",
	"idCampoNumerico": 99991,
	"idCampoData": "01/01/2002"
}

# Para editar ação - Requisição tipo PUT
- https://desafio-tecnico-api.herokuapp.com/acao/{id}

# Para deletar ação - Requisição tipo DELETE
- https://desafio-tecnico-api.herokuapp.com/acao/{id}


```
