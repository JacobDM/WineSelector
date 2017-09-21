# WineSelector

## Notes
* All values in the Wine object are wrappers as opposed to primitives due to the prevelence of null values in virtually every database column. This is to prevent Hibernate from attempting to assign a null value to a primitive throwing an exception.
* JavaDoc comments detail my thought process and reasoning behind certain implementation details
* Unit tests completed and located in the */src/test/java* folder
