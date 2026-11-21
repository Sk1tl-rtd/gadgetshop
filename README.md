# Gadgetshop — REST API читання (заняття 1.1)

Власний проєкт за зразком заняття 1.1: Spring Boot 3.4.13, Java 17+, шари
domain / repository / service / web, DTO, сховище в пам'яті.

| Метод | Шлях | Відповідь |
|---|---|---|
| GET | `/api/gadgets` | масив `GadgetCardDto` |
| GET | `/api/gadgets/{id}` | `GadgetDetailDto` або 404 |

```bash
./mvnw spring-boot:run   # запуск
./mvnw test              # тести
```

Приклади запитів — у [requests.md](requests.md).
