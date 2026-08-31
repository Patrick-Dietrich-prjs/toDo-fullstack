# Arquitetura do Backend

## Visão geral

O backend segue o padrão de camadas do Spring Boot, separando responsabilidades de forma clara. Cada camada tem um papel bem definido e só se comunica com a camada adjacente.

```
Request HTTP
     ↓
Controller       → recebe a requisição, valida entrada, devolve resposta
     ↓
Service          → aplica as regras de negócio
     ↓
Repository       → acessa o banco de dados via JPA/Hibernate
     ↓
MySQL
```

---

## Camadas

### Controller
- Recebe as requisições HTTP do frontend React
- Valida os dados de entrada (DTO)
- Chama o Service correspondente
- Devolve a resposta em JSON

### Service
- Contém toda a lógica de negócio do app
- Chama o Repository para buscar ou salvar dados

### Repository
- Interface que herda de `JpaRepository`
- Spring Data JPA gera as queries automaticamente
- Queries personalizadas ficam aqui quando necessário

### Model (Entidade)
- Classes Java anotadas com `@Entity`
- Mapeadas diretamente para tabelas do MySQL via Hibernate
- Contêm apenas atributos e getters/setters

### DTO (Data Transfer Object)
- Objetos usados para receber dados do frontend (Request)
- Objetos usados para enviar dados ao frontend (Response)
- Evitam expor a entidade diretamente na API

---

## Entidades principais

| Entidade | Tabela | Descrição |
|---|---|---|
| `ToDo` | `toDo` | Lista de afazeres do usuário |