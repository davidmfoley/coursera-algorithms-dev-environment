This is an example environment for working through the Coursera algorithms classes using maven and junit.
Also includes some helper scripts (in bash) for running your code and recording timings.

## Directory structure

Production code goes in *src/main/java*
Test code goes in *src/test/java*
`algs4.jar` and `stdlib.jar` (from the class) are in *src/libs*

`pom.xml` is used by maven to build and test the code - check maven docs for more info

```run``` and ```record_run``` are helper scripts for running your code (`static main` functions)

See `src/main/PrimeFactors.java` and `src/test/PrimeFactorsTest.java` for example of production and test code. (This is not an actual exercise for the class, just an illustration).

## Prerequisites

* Java 7 (check with `java -version` - should start with 1.7)
* Maven 3 (download: http://maven.apache.org/download.cgi)

* OS X (tested) or linux (probably works), to run the helper scripts

## Setup

After installing java 7 and maven, clone this and run `mvn test`. You should see a bunch of output that ends with something like the following:

```
  -------------------------------------------------------
   T E S T S
  -------------------------------------------------------
  Running PrimeFactorsTest
  Tests run: 6, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.043 sec

  Results :

  Tests run: 6, Failures: 0, Errors: 0, Skipped: 0

  [INFO] ------------------------------------------------------------------------
  [INFO] BUILD SUCCESS
  [INFO] ------------------------------------------------------------------------
  [INFO] Total time: 1.867s
  [INFO] Finished at: Tue Sep 09 18:46:59 PDT 2014
  [INFO] Final Memory: 14M/245M
  [INFO] ------------------------------------------------------------------------

```

Note: there are some maven warnings about using system scope. If you know of an easy way to fix this, let me know.

## How to

### Compile your code:

```
  $ mvn compile
```

### Run all of your JUnit tests

```
  $ mvn test
```

### Run the main function in class PrimeFactors with a command line arg (for example)

```
  $ ./run PrimeFactors 600851475143
```

### Run the main function in class PrimeFactors and record the results in results/PrimeFactors.txt

```
  $ ./record_run PrimeFactors 600851475143
```

  This will write some information about the current state of the working tree (git-wise) as well as the output and the timing (using unix time command). This can be useful when optimizing an algorithm and checking elapsed time compared to previous iterations.

