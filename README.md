# WineSelector

## Notes
* All values in the Wine object are wrappers as opposed to primitives due to the prevelence of null values in virtually every database column. This is to prevent Hibernate from attempting to assign a null value to a primitive causing an exception to be thrown.
* JavaDoc comments detail my thought process and reasoning behind certain implementation details
* Unit tests completed and located in the */src/test/java* folder

## Problem 1
/api/wine/name?id=(id here)

## Problem 2
/api/wine/pricing-list

## Problem 3
/api/wine/name?page=(page # here)

## BONUS
/api/wine?id=(id here)

**IMPORTANT: Removed the DB IP, username, AND password for security reasons. Update them in the application.yml file before running the project.**
