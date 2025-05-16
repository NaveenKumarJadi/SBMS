
✅ 1. Constructor Injection — Recommended
🔹 When to use:
When all dependencies are required for the class to function

For immutability (dependencies are final)

For unit testing and clarity

For mandatory dependencies

✅ Benefits:
Ensures all required dependencies are provided at object creation

Promotes immutability (final fields)

Best supported by Spring and testing tools

Encouraged by Spring's best practices

🚫 Downside:
Can be verbose if many dependencies



✅ 2. Field Injection — Not Recommended for New Code
🔹 When to use:
Only for quick prototypes, or legacy code

When writing tests using mocking frameworks (if using reflection)

❌ Drawbacks:
Makes the class hard to test (no constructor or setter to inject mocks)

Hides dependencies

Breaks encapsulation

Field Injection conclusion:
Field injection breaks encapsulation because it bypasses normal object construction and hides dependencies. 
This leads to code that's harder to understand, test, and maintain.


✅ 3. Setter Injection — Optional / Configurable Dependencies
🔹 When to use:
When a dependency is optional

When dependency may change at runtime (e.g. via config or hot-swap)

For JavaBeans compatibility

✅ Benefits:
Allows optional injection

Good for framework configuration classes or optional features

🚫 Drawback:
Less safe: object can be created without all required dependencies



>> Output (when you hit http://localhost:8080/order/place)

LOG: Placing order...
Payment processed.
Discount applied.
LOG: Order placed successfully.


>> Notes:
Constructor injection is used for the essential PaymentService.

Setter injection allows DiscountService to be optional.

Field injection is discouraged, but shown for LoggerService.