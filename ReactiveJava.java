/* 

Reactive Programming in Java (Spring WebFlux & Reactor)

1. Reactive Streams Specification:
- Non-blocking, asynchronous stream processing with backpressure (allowing consumers to signal how much data they can handle).

2. Project Reactor (Mono & Flux):
- Mono: Publisher that emits at most one item (0 or 1).
- Flux: Publisher that emits 0 to N items.

3. Spring WebFlux:
- A non-blocking web framework built on Netty (default) instead of traditional Servlet containers (Tomcat).

4. R2DBC (Reactive Relational Database Connectivity):
- A specification for reactive API access to relational databases (eliminating JDBC blocking threads).

Syntax:
Mono<Type> single = Mono.just(value);
Flux<Type> stream = Flux.fromIterable(list);

*/

/*

Mockup of a WebFlux Functional Endpoint & Router Config:

*/

// --- Reactive Controller (Annotation style) ---
// @RestController
// @RequestMapping("/api/reactive")
class ReactiveController {
    
    // Emits a single greeting asynchronously
    // @GetMapping("/hello")
    // public Mono<String> getGreeting() {
    //     return Mono.just("Hello Reactive World");
    // }

    // Emits stream of integers over time
    // @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    // public Flux<Long> getStream() {
    //     return Flux.interval(Duration.ofSeconds(1));
    // }
}

class ReactiveJava {
    public static void main(String[] args) {
        System.out.println("Reactive Java Fundamentals:");
        System.out.println("---------------------------");
        System.out.println("1. Mono and Flux represent asynchronous publishers.");
        System.out.println("2. WebFlux runs on non-blocking servers like Netty.");
        System.out.println("3. R2DBC allows non-blocking database queries to prevent database thread exhaustion.");
    }
}
