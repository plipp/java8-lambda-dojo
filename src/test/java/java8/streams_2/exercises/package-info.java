package java8.streams_2.exercises;

/**
 3. Evaluation. Take a look at the signatures of these Stream methods. Are they eager
    or lazy?
     a. boolean anyMatch(Predicate<? super T> predicate);
     b. Stream<T> limit(long maxSize);
 4. Higher-order functions. Are these Stream functions higher order, and why?
     a. boolean anyMatch(Predicate<? super T> predicate);
     b. Stream<T> limit(long maxSize);
 5. Pure functions. Are these lambda expressions side effect-free, or do they mutate state?
    a)    x -> x + 1
    b) Here’s the example code:
        AtomicInteger count = new AtomicInteger(0);
        List<String> origins = album.musicians().forEach(musician -> count.incAndGet();)



 ================================================================0











 * Question 3:
 *  a. Eager
 *  b. Lazy
 *
 * Question 4:
 *  a. Yes - takes a function as an argument
 *  b. No
 *
 * Question 5:
 *  a. Side Effect Free
 *  b. Mutates count
 */