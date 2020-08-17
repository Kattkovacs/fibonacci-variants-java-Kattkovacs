# Fibonacci variants

## Story

Your friend, who just started to learn programming, says that he
doesn't understand the hype around this recursion thing.
He completed the Fibonacci exercise using recursion which runs A LOT
slower than the "normal" variant using loops. The program effectively
freezes when asked to calculate the 40th Fibonacci number.

You tell him that a well implemented Fibonacci algorithm should
have an O(n) characteristic, using either loops or recursion.

He looks puzzled, so you explain this using plain words: so, this means that in order
to calculate the 400th number, only cca. 400 basic steps - in this case: additions -
are needed. The key here is _to avoid repeating operations_, which means that
the program needs to store every piece of data that can be of use later.

A mentor walks around and says that this technique is called _memoization_
which is related to _dynamic programming_. The situation quickly
deteriorates when another mentor - the geekest one - joins the group
and argues that a proper recursive solution: a _tail-recursive_ solution
does not need extra memory at all. They start shouting at each other
around the topic of something called _tail-call optimization_, ending up
abusing each others' favourite programming languages. Gross.

The two of you leave the scene unnoticed, and decide to dive deeper
into this topic together, reconstructing the various solutions to the
Fibonacci problem.

> We define `Fib(0) = 0` and `Fib(1) = 1` here, so `Fib(5)` should return `5`,
> `Fib(6) = 8`, and `Fib(7) = 13`.
> The series starts like (0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...)

## What are you going to learn?

- the analysis of algorithmic behavior
- how to calculate the computational complexity of an algorithm
- recursion
- memoization
- tail recursion

## Tasks

1. Implement a method that takes a single integer value and returns the corresponding Fibonacci number. Don't use recursion this time.
    - The return value is the corresponding number from the Fibonacci sequence. There is no recursive call in the implementation
    - The number of addition operations needed for the result are counted and printed

2. Implement a method that takes a single integer value and returns the corresponding Fibonacci number. Use recursion (the original Fibonacci formula) but no extra memory during the calculation!
    - The return value is the corresponding number from the Fibonacci sequence. The implementation uses no loops and no extra memory (global variables, extra parameters)
    - The number of addition operations needed for the result are counted and printed

3. Enhance the `Fib` recursive method with a way to scale down the computational complexity
    - The return value is the corresponding number from the Fibonacci sequence. The implementation uses no loops but uses extra memory (global variables or extra parameters)
    - The number of addition operations needed for the result are counted and printed

4. Rewrite the recursive method that using only one recursive call - the last expression in the return statement.
    - The return value is the corresponding number from the Fibonacci sequence. The implementation uses no loops, no global variables but performs like the iterative solution
    - The number of addition operations needed for the result are counted and printed

## General requirements

None

## Hints

- Drawing the contents of the call stack helps you visualise the number of method calls
  needed in a recursive algorithm
- In case of the memoized version don't calculate the same Fibonacci number twice - just
  store it in memory in a quickly accessible form like an array or a dictionary
- Tail recursion means that the very last action in a function (and only that) is a recursive
  call. It's tricky, but the Fibonacci problem can be solved this way. Use multiple
  arguments and/or helper functions!
- Tail call optimization (TCO) is an important feature of a compiler or an interpreter
  that makes subsequent function calls more effective. This is a rather advanced topic,
  don't get lost in it this time.

## Starting your project

To start your project click [this link](https://journey.code.cool/v2/project/solo/blueprint/fibonacci-variants/java).

## Background materials

- <i class="far fa-exclamation"></i> [Fibonacci numbers](https://en.wikipedia.org/wiki/Fibonacci_number)
- <i class="far fa-exclamation"></i> [Memoization](https://en.wikipedia.org/wiki/Memoization)
- <i class="far fa-exclamation"></i> [Tail call](https://en.wikipedia.org/wiki/Tail_call)
