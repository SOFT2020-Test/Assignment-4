# Assignment-4 - Tic Tac Toe Game
###   by Jonatan, Jonas & Thomas  
[Assignment Link](Assignment-4-Description.pdf)  

## Setup
What you'll need:
Your favorite IDE that can run java, we use IntelliJ.  
Right-click the project and choose "Run test with coverage".

## Test
Junit Test        |  Code Coverage PiHole
:-------------------------:|:-------------------------:
![passed](/images/Junit-Test-Passed.png)  |  ![passed](/images/Jacoco-Test-Coverage.png)

SonarQube Analysis        |  PiHole Mutations (this doesnt work for some reason...)
:-------------------------:|:-------------------------:
![passed](/images/sonarqube-analyse.png)  |  ![passed](/images/mutations.png)

## Questions
### How to verify that mock is called and how do you verify that a mock has not been called
Mockito har tagget “verify” man kan bruge til at se om en mock bliver kørt 
Her er et billede hvor jeg har hardcoded svaret og ikke bruger et service, hvor den fejler fordi at mock ikke blev kørt.
Test Class where Mock is not called (not verified)      |   .   
:-------------------------:|:-------------------------:
![passed](/images/verify-error.png)  |  ![passed](/images/verify-testclass.png)
  
Test Class where Mock is called (verified)     |  .   
:-------------------------:|:-------------------------:
![passed](/images/verify-pass.png)  |  ![passed](/images/verify-testclass-2.png)  


###  How do you specify how many times a mock should have been called?
Man kan bruge tagget “times” den vil give en fejl hvis mocken ikke var kørt det antal gange man specificeret. Her fejlede den fordi jeg sagde den skulle køre 7 gange men kun blev kørt en gang. 
![x](/images/how-many-times-mock-called.png)  

### How do you verify that a mock was called with specific arguments? 
I mockito kan man bruge “ArgumentCaptor” til teste om de rigtige argumenter er blevet set med. Her er et billede hvor jeg ikke har giver nogle argumenter med og den fejler fordi den forventer argumentet “someElement”
![x](/images/mock-parameters.png)  


### How do you use a predicate to verify the properties of the arguments given to a call to the mock? 
Vi kunne ikke få predicate til at virke i Mockito....
