Solution:

I SOURCE CODE:
Folder anagram contains the code developed based on the requirements given. Also it is the application's root folder.

The solution has been developed according the requirements given in in document "Java Test - Anagram checker.docx".
Code is a standard Maven project and also contains a Junit test to validate the logic.
It can be build from root folder using command: mvn clean install 
The generated jar in the target folder would be analog-1.0.jar

II. APPLICATION EXECUTABLE:
File anagram.jar is a copy of generated buiild jar analog-1.0.jar. 
The application can be run using the command:
java -classpath anagram.jar com.exercise.IsAnagram "comics" "cosmic"
(it is assumed that anagram.jar is in the current folder of command prompt otherwise jar path in above command has to be changed accordingly)


Question: What are the benefits of separating the task into the two classes GrammarUtils and IsAnagram?

Answer: 

Class IsAnagram contains code capturing data (i.e. input strings) and class GrammarUtils contains anagram logic.

The responsibilities of two classes are different. This is an example of principle of cohesion.

Code in these classes can be changed without affecting each other as long as there is no change in signature of isAnagram method of GrammarUtils.
