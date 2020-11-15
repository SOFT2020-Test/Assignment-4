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
### How to verify that a mock is called?  
Mockito har tagget “verify” man kan bruge til at se om en mock bliver kørt 
Her er et billede hvor jeg har hardcoded svaret og ikke bruger et service, hvor den fejler fordi at mock ikke blev kørt.
Verify med fejl        |  Verify uden fejl  
:-------------------------:|:-------------------------:
![passed](/images/verify-error.png)  |  ![passed](/images/verify-pass.png)
