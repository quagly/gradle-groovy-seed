# gradle-groovy-seed
seed for initial gradle groovy projects

includes:

* groovy language
* spock test framework
* codenarc for static code analysis
* cobertura for test coverage reports - runs but not configured 
* hello world script and class examples
* hello world test cases

only dependency is java SDK.  Just run 
> ./gradlew

to run. 

Default task is 'check' which inlcudes
* codenarc
* cobertura
* test

log4j.properties in src/main/resources
