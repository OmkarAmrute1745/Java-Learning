# Spring Boot Interview Notes

## What does Spring Boot provide?
Opinionated defaults, auto-configuration, starter dependencies, externalized configuration, and convenient application packaging.

## Explain dependency injection
A class receives its collaborators instead of constructing them internally. Prefer constructor injection for required dependencies because it makes requirements explicit and supports unit testing.

## Typical backend flow
`Controller -> Service -> Repository -> Database`

- Controller: HTTP mapping, request/response boundaries, status codes.
- Service: business rules and transaction boundary where appropriate.
- Repository: persistence operations.
- Entity/DTO: persistence model and API representation should be chosen deliberately.

## What does @Transactional do?
It defines transactional behavior around a method or class when invoked through Spring's transaction infrastructure. Understand propagation, isolation, rollback rules, and proxy limitations.

## REST API basics
- Use resource-oriented paths and HTTP methods.
- Validate incoming data.
- Return appropriate status codes.
- Use centralized exception handling.
- Avoid exposing persistence entities blindly as API contracts.

## Testing
Use unit tests for business logic, slice tests for focused Spring components, and integration tests for wiring and persistence behavior.

## Practice prompts
1. Explain constructor injection versus field injection.
2. Explain @ControllerAdvice.
3. Explain @Valid and Bean Validation.
4. Explain application.properties / YAML and profiles.
5. Explain Spring Boot Actuator and health endpoints.
6. How would you troubleshoot a failing endpoint?
