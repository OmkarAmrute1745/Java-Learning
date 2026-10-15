# Real-World Backend Scenario Questions

Use the STAR-style structure where relevant: context, responsibility, actions, and measurable outcome. For technical scenarios, explain diagnosis before the fix.

## API returns HTTP 500
1. Capture the request ID, endpoint, time, and safe reproduction details.
2. Inspect correlated logs and stack trace.
3. Check recent deployments, configuration, dependencies, and database health.
4. Reproduce with a focused test.
5. Fix the root cause, add regression coverage, and monitor after deployment.

## Batch job is slow
1. Measure record throughput and phase timings.
2. Check query count, execution plans, indexes, transaction frequency, and logging overhead.
3. Avoid per-record database round trips when safe; consider caching reference data and JDBC/JPA batching.
4. Preserve required transaction and restart semantics.
5. Compare before/after results using the same data and environment.

## Duplicate records appear
1. Confirm the business key and whether concurrent requests are possible.
2. Add a database uniqueness constraint when appropriate.
3. Use idempotency or upsert semantics according to business rules.
4. Handle conflicts safely and test retries/concurrency.

## A database change breaks deployment
1. Verify the migration and environment schema.
2. Check permissions, compatibility, and rollback strategy.
3. Prefer backward-compatible expand-and-contract changes for rolling deployments.
4. Confirm application and database versions after release.

## Interview answer checklist
- Clarify assumptions and constraints.
- Explain the simplest safe solution.
- Discuss error handling, observability, and testing.
- Mention trade-offs instead of claiming one solution fits every case.
