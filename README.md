# Test Driven Developement Workshop (Go)

This is the Java code base to use when attending my introduction to 
TDD workshop

## Tasks

### Task 1 - First Unit test

Implement the [MarksInteger](src/main/java/org/braddle/tddworkshop/number/MarksInteger.java) Interface


Writing all tests first create an implementation of the MarkInteger 
interface.

### Task 2 - Refactoring

Refactor the [Set](src/main/java/org/braddle/tddworkshop/set/Set.java) class without breaking the tests.

### Task 3 - Mocking with Stubs

Create a drving licence number generator using TDD. You will need to create a Stub 
test double of the [RandomNumberGenerator](src/main/java/org/braddle/tddworkshop/licence/RandomNumberGenerator.java) 
interface as part of the tests.

A drving licence number it produced by taking the applicants initials, date of birth (YYYYMMDD)
and a 3 digit random number.

i.e
  - Mark David Bradley DOB: 12/05/1997 driving licence number could be MDB19970512999
  - Harry Jim James Smith DOB 09/10/1985 driving licence number could be HJJS19851009999
  - Jane Bond 01/01/2001 driving licence number could be JB20010101999

You will need to create a stub test double of the RandomNumberGenerator interface to ensure
tests always pass

## Task 4 - Mocking with Mocks

Implement the [BookService](src/main/java/org/braddle/tddworkshop/book) interface with a mocked 
BookRepository and review repository 

### Task 5 - Mocking with Spies

Implement the [customerRegister](src/main/java/org/braddle/tddworkshop/register/customerRegister.java) interface that 
will allow customers to register there details. If their details are valid they should be save and send an email. You 
need to use a Spy test double to ensure that the email sending operation is complete only when a persons details are 
save.

### Task 6 - Mocking with Fakes

TODO