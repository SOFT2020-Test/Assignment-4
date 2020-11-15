# Assignment-4  
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

SonarQube Analysis        |  PiHole Mutations (this doesnt work for some reason...
:-------------------------:|:-------------------------:
![passed](/images/sonarqube-analyse.png)  |  ![passed](/images/mutations.png)

## Questions
### How to verify that mock is called and how do you verify that a mock has not been called
Mockito har tagget “verify” man kan bruge til at se om en mock bliver kørt 
Her er et billede hvor jeg har hardcoded svaret og ikke bruger et service, hvor den fejler fordi at mock ikke blev kørt.
Test Class where Mock is not called      |   
:-------------------------:|:-------------------------:
![passed](/images/verify-error.png)  |  ![passed](/images/verify-testclass.png)

Test Class where Mock is not called      |  Class
:-------------------------:|:-------------------------:
![passed](/images/verify-error.png)  |  ![passed](/images/verify-testclass.png)
