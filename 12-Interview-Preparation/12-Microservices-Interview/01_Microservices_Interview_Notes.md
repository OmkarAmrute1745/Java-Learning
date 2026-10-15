# Microservices Interview Notes

## What are microservices?
An architecture in which a system is split into independently deployable services around business capabilities. Independence brings operational and distributed-systems complexity.

## Synchronous versus asynchronous communication
- HTTP request/response is straightforward but couples availability and latency.
- Messaging supports decoupling and buffering but requires handling retries, duplicate delivery, ordering, and eventual consistency.

## Resilience patterns
- Timeout: bound how long a call can wait.
- Retry: retry only suitable failures, with limits and backoff.
- Circuit breaker: stop repeated calls to a failing dependency temporarily.
- Bulkhead: isolate resource pools to limit cascading failure.

## Idempotency
Repeating the same request should not create an unintended duplicate effect. A stable idempotency key and persisted result/processing state can help.

## Observability
Use correlated logs, metrics, and distributed traces. Avoid logging secrets or sensitive personal data.

## Practice prompts
1. How do you handle a downstream service outage?
2. How do you prevent duplicate payment processing?
3. How do you trace a request across services?
4. What is eventual consistency?
5. How do you manage API versioning and backward compatibility?
