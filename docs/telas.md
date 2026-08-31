# Telas da Aplicação

Descrição de cada tela, seu propósito e o que o usuário pode fazer nela.

---

## Hábitos `/habits`

**Propósito:** Gerenciar e registrar afazeres.

**Conteúdo:**
- Lista de todos os afazeres com botões de excluir e editar
- Formulário para criar novo hábito

**Chamadas à API:**
- `GET /api/habits`
- `POST /api/habits`
- `POST /api/habits/{id}/check`
- `DELETE /api/habits/{id}`

---

## Navegação

```
Dashboard (/)
└── → /todo
```