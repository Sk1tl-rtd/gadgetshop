# Приклади запитів

Запустіть застосунок: `./mvnw spring-boot:run` (порт 8080).

## Перелік гаджетів
```bash
curl -i http://localhost:8080/api/gadgets
```

## Один гаджет
```bash
curl -i http://localhost:8080/api/gadgets/1
```

## Неіснуючий id → 404
```bash
curl -i http://localhost:8080/api/gadgets/999
```
