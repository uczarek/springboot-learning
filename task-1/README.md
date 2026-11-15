# Task 1 – Spring Boot: rabat

Endpoint `GET /discount` przyjmuje kwotę jako parametr zapytania `amount`.

- Jeśli kwota jest większa niż 200 zł, zwraca kwotę pomniejszoną o 10%.
- Jeśli kwota wynosi 200 zł lub mniej, zwraca ją bez zmian.

## Uruchomienie

W katalogu projektu uruchom:

```bash
./mvnw spring-boot:run
```

## Testowanie

Otwórz w przeglądarce lub wyślij w Postmanie żądanie GET:

```text
http://localhost:8080/discount?amount=250
```

Odpowiedź: `225.0`

Przykłady:

| Żądanie | Odpowiedź |
|---|---:|
| `/discount?amount=100` | `100.0` |
| `/discount?amount=200` | `200.0` |
| `/discount?amount=250` | `225.0` |
| `/discount?amount=300` | `270.0` |

Parametr `@RequestParam` pobiera wartość `amount` z adresu URL.
