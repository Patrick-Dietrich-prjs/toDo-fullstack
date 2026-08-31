# Endpoints da API

Base URL: `http://localhost:8080/api`

---

## Hábitos `/todo`

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/todo` | Lista todos os afazeres |
| GET | `/todo/{id}` | Busca um afazer por ID |
| POST | `/todo` | Cria um novo afazer |
| PUT | `/todo/{id}` | Atualiza um afazer |
| DELETE | `/todo/{id}` | Remove um afazer |

---

## Convenções

- Todos os endpoints retornam **JSON**
- Datas no formato **ISO 8601**: `yyyy-MM-dd`
- Códigos de resposta:
  - `200` — sucesso
  - `201` — criado com sucesso
  - `400` — dados inválidos
  - `404` — recurso não encontrado
  - `500` — erro interno do servidor

---

> **Como testar:** Use o **Postman** ou **Insomnia** para testar os endpoints antes de conectar ao frontend React.
