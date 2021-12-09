# leetcode-java

[![Build Status](https://travis-ci.org/xuthus/leetcode-java.svg?branch=master)](https://travis-ci.org/xuthus/leetcode-java)

Leetcode solutions (+ Codesignal, + Stepik algorithms course)

The repository contains solutions to the algorithmic problems from leetcode.com.
I prefer to use Java, but I could solve some problems in the other languages in the future.

The solutions do not pretend to be absolutely correct. They are all accepted by leetcode.com, 
but there can be certainly more optimal solutions. For some problems I'll post several solutions with different algorithms.

You may, if you want, add your own solutions or improve mine. If you offer a fundamentally different solution, 
it is better to add it to a separate class (maybe with extracting base interface). 
If you just optimize my solution, you should edit it and request me to merge your changes.

To code I use Java 8. All solutions are equipped with the tests written using JUnit4.

To build and run tests, I use Maven.

You may freely use the repository to study algorithms. I also recommend you to register on leetcode.com.

Good luck!

**P.S.** Many of my solutions look too monstrous. This is because I am striving for more optimized algorithms. For example, I do not create new instances of StringBuilder if I can just use setLength(0). I don't delete and don't insert elements in arrays (in StringBuilders also) - this will lead to need to shift part of array elements. I initialize the collections and builders capacity if I can calculate it. And so on.

**P.P.S.** It is a good idea to post several versions of the solution - optimized but ugly one and not optimized but clear another one.
