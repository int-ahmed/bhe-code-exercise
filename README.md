# BHE Software Engineer Coding Exercise

## About Solution
The Sieve has been implemented as a REST API using Java running Quarkus

### System Requirements
- Java 21 SDK

### Running the application

The application can be kicked off using the built-in features of IntelliJ as it picks up the maven configuration and builds the project accordingly.

The following command spins up the webserver on default port 8080 and enables it for queries \
`mvn quarkus:dev`

### Available endpoints

- http://localhost:8080/prime/{nThElement} expected output example `2 3 5 ...`

---
<sup>Original README.md left for reference<sup/>
## The Sieve of Eratosthenes

Prime numbers have many modern day applications and a long history in mathematics. Utilizing your own resources research the sieve of Eratosthenes, an algorithm for generating prime numbers. Based on your research, implement an API that allows the caller to retrieve the Nth prime number.
Some stub code and a test suite have been provided as a convenience, however, you are encouraged to deviate from Eratosthenes's algorithm, modify the existing functions/methods or anything else that might showcase your ability provided the following requirements are satisfied.
Stub code has been provided in Go, C#, and Javascript. Please use the language that is most appropriate based on your own skillset

### Requirements

- Fork this repo to implement your solution
- The library package provides an API for retrieving the Nth prime number using 0-based indexing where the 0th prime number is 2
- Interviewers must be able to execute a suite of tests
  - Go: `go test ./...`
  - C#: `dotnet test Sieve.Tests`
  - Javascript: `npm run test`
- Your solution is committed to your project's `main` branch, no uncommitted changes or untracked files please
- Submit the link to your public fork for review

### Considerations

During the technical interview, your submission will be discussed, and you will be evaluated in the following areas:

- Technical ability
- Communication skills
- Work habits and complementary skills
