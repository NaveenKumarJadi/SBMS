+++++++++++++++
@Primary
+++++++++++++++

When multiple beans of the same type exist in the Spring container, and no specific bean is marked with @Qualifier, Spring throws an error due to ambiguity.

To resolve this, we can use @Primary on one of the beans, so Spring will give it preference when auto-wiring.

Spring will use this bean by default
