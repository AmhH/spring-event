# spring-event
There are a few simple guidelines to follow:

the event should extend ApplicationEvent
the publisher should inject an ApplicationEventPublisher object
the listener should implement the ApplicationListener interface

events – by default – are synchronous. This has a few advantages – such as, for example, the listener being able to participate in the publisher’s transaction context.

@TransactionalEventListener annotation, which is an extension of @EventListener, that allows binding the listener of an event to a phase of the transaction. Binding is possible to the following transaction phases:

AFTER_COMMIT (default) is used to fire the event if the transaction has completed successfully
AFTER_ROLLBACK – if the transaction has rolled back
AFTER_COMPLETION – if the transaction has completed (an alias for AFTER_COMMIT and AFTER_ROLLBACK)
BEFORE_COMMIT is used to fire the event right before transaction commit

@Async Annotation
First – let's go over the rules – @Async has two limitations:

it must be applied to public methods only
self-invocation – calling the async method from within the same class – won't work
The reasons are simple – the method needs to be public so that it can be proxied. And self-invocation doesn't work because it bypasses the proxy and calls the underlying method directly.