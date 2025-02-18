Student Name : Aliya

This Assignment demonstrates a system for managing BlogPosts, Person, and their Blog.

 Classes:
- BlogPost: Represents an individual BlogPost.
- Person: Represents an author.
- Blog: A collection of BlogPosts and authors.
- MainApp: The main application to run the system.
- BlogPostTest: Unit tests for validating BlogPost creation.
- PersonTest: Unit tests for validating Person creation.

 Running the Project
1. Compile and run `MainApp.java` to test the functionality.
2. Run tests using JUnit in `BlogPostTest.java`.
3. Run tests using Junit in `PersonTest.java`.


outputs:

cd C:\Users\Aliya\Downloads\Assignment2_C0929608; "JAVA_HOME=C:\\Program Files\\Java\\jdk-18.0.2.1" cmd /c "\"C:\\Users\\Aliya\\.vscode\\extensions\\oracle.oracle-java-23.1.0\\nbcode\\java\\maven\\bin\\mvn.cmd\" -Dtest=com.example.BlogPostTest -Dmaven.ext.class.path=C:\\Users\\Aliya\\.vscode\\extensions\\oracle.oracle-java-23.1.0\\nbcode\\java\\maven-nblib\\netbeans-eventspy.jar --no-transfer-progress process-test-classes surefire:test"
Scanning for projects...

------------------< com.example:assignment2_c0929608 >------------------
Building Assignment 02 - c0929608 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ assignment2_c0929608 ---
skip non existing resourceDirectory C:\Users\Aliya\Downloads\Assignment2_C0929608\src\main\resources

--- compiler:3.11.0:compile (default-compile) @ assignment2_c0929608 ---
Nothing to compile - all classes are up to date

--- resources:3.3.1:testResources (default-testResources) @ assignment2_c0929608 ---
skip non existing resourceDirectory C:\Users\Aliya\Downloads\Assignment2_C0929608\src\test\resources

--- compiler:3.11.0:testCompile (default-testCompile) @ assignment2_c0929608 ---
Nothing to compile - all classes are up to date

--- surefire:3.1.2:test (default-cli) @ assignment2_c0929608 ---
Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.BlogPostTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.149 s -- in com.example.BlogPostTest

Results:

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  3.970 s
Finished at: 2025-02-18T12:40:59-05:00
------------------------------------------


cd C:\Users\Aliya\Downloads\Assignment2_C0929608; "JAVA_HOME=C:\\Program Files\\Java\\jdk-18.0.2.1" cmd /c "\"C:\\Users\\Aliya\\.vscode\\extensions\\oracle.oracle-java-23.1.0\\nbcode\\java\\maven\\bin\\mvn.cmd\" -Dtest=com.example.PersonTest -Dmaven.ext.class.path=C:\\Users\\Aliya\\.vscode\\extensions\\oracle.oracle-java-23.1.0\\nbcode\\java\\maven-nblib\\netbeans-eventspy.jar --no-transfer-progress process-test-classes surefire:test"
Scanning for projects...

------------------< com.example:assignment2_c0929608 >------------------
Building Assignment 02 - c0929608 1.0-SNAPSHOT
  from pom.xml
--------------------------------[ jar ]---------------------------------

--- resources:3.3.1:resources (default-resources) @ assignment2_c0929608 ---
skip non existing resourceDirectory C:\Users\Aliya\Downloads\Assignment2_C0929608\src\main\resources

--- compiler:3.11.0:compile (default-compile) @ assignment2_c0929608 ---
Nothing to compile - all classes are up to date

--- resources:3.3.1:testResources (default-testResources) @ assignment2_c0929608 ---
skip non existing resourceDirectory C:\Users\Aliya\Downloads\Assignment2_C0929608\src\test\resources

--- compiler:3.11.0:testCompile (default-testCompile) @ assignment2_c0929608 ---
Nothing to compile - all classes are up to date

--- surefire:3.1.2:test (default-cli) @ assignment2_c0929608 ---
Using auto detected provider org.apache.maven.surefire.junitplatform.JUnitPlatformProvider

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.example.PersonTest
Tests run: 3, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.130 s -- in com.example.PersonTest

Results:

Tests run: 3, Failures: 0, Errors: 0, Skipped: 0

------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
Total time:  4.812 s
Finished at: 2025-02-18T12:46:35-05:00
------------------------------------------------------------------------


c:\Users\Aliya\Downloads\Assignment2_C0929608> c: && cd c:\Users\Aliya\Downloads\Assignment2_C0929608 && cmd /C "C:\Users\Aliya\AppData\Roaming\Code\User\globalStorage\pleiades.java-extension-pack-jdk\java\17\bin\java.exe @C:\Users\Aliya\AppData\Local\Temp\cp_49bsnqtug47qc9o9nw2u7qbs4.argfile com.example.MainApp "
Authors:
Aliya Jalal
Frem Chingu
