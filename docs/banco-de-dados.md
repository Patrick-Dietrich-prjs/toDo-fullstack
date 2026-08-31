# Banco de Dados

## Tecnologia

- **MySQL 8**
- **Hibernate 6**
- **Spring Data JPA**

---

## Tabelas

### `todo`
Hábitos diários que o usuário quer acompanhar.

| Coluna | Tipo | Descrição |
|---|---|---|
| `id` | INT (PK) | Identificador único |
| `description` | VARCHAR(20) | Descrição do afazer |
| `criado_em` | DATE | Data de criação |

---

## Configuração de conexão

Arquivo: `src/main/resources/application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/habit_tracker
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> **Nota:** `ddl-auto=update` faz o Hibernate criar/atualizar as tabelas automaticamente durante o desenvolvimento. Em produção, usar `validate` ou `none`.