# CS4450-Parser-Final-Project

## Group Members
Michael Dillahunty, Conor Wood, Sawyer Seitz

## Description

Our project includes a basic Python parser using ANTLR and Java. The use of ANTLR allows us to implement CFGs to cover basic syntax requirements, including support for things such as arithmetic operators, if/else blocks, conditional statements, while and for loops, comments, and function calls, along with a few other features. These features were implemented in the g.g4 file located in the src directory. When you test the program, you will see the space to input test code and next to it you will see the parse tree.

## Setup
In order to run and use this parser, the following are needed: 
* Java JDK 17.0 or later
* antlr4 installed on your machine (installation guide found here: https://github.com/antlr/antlr4)
* The ability to compile/run Java files/projects
* The .g4 grammar file in this repository 

## How to Use/Run Parser
To use the parser, first ensure that you have the correct/up-to-date requirements installed. 
Once your environment is properly configured, follow the following instructions to properly run the parser: 
* Open a terminal 
* Make sure that you are in the correct directory where the source files exist (for our project, the proper files are in the /src directory)
* Run the following commands:
  * antlr4 g.g4 (this will generate all necessary files from the grammar file)
  * javac g*.java (this will compile all generated Java files)
  * grun g <rule-name> -gui (this will run the generated files, and allow you to provide input for the specified rule name, then output a visualization of the parse tree that can be saved as a .png)


### Video Demo Link 

https://nam02.safelinks.protection.outlook.com/?url=https%3A%2F%2Fmailmissouri-my.sharepoint.com%2F%3Av%3A%2Fg%2Fpersonal%2Fcbwgc6_umsystem_edu%2FEbb68Qwz1q1AhK2SnNfXKRgBOFumM-Q7uSchmam8arpg8A&data=05%7C01%7Cmjdqw5%40mail.missouri.edu%7Cbb860aeb6fbe4053e02808dadcca8c9f%7Ce3fefdbef7e9401ba51a355e01b05a89%7C0%7C0%7C638065059742019076%7CUnknown%7CTWFpbGZsb3d8eyJWIjoiMC4wLjAwMDAiLCJQIjoiV2luMzIiLCJBTiI6Ik1haWwiLCJXVCI6Mn0%3D%7C3000%7C%7C%7C&sdata=eDasZFd8Zwz85GlJhxVahRK9Ybn6tGsRwbujQEDmNJQ%3D&reserved=0
