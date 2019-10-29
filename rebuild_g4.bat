@echo off

SET CLASSPATH=.;./antlr-4.7.2-complete.jar;%CLASSPATH%

java org.antlr.v4.Tool src\main\resources\CX.g4

::echo CXLexer
echo package resources; > package_resources.txt
type src\main\resources\CXLexer.java >> package_resources.txt
copy /y package_resources.txt src\main\resources\CXLexer.java

::echo CXParser
echo package resources; > package_resources.txt
type src\main\resources\CXParser.java >> package_resources.txt
copy /y package_resources.txt src\main\resources\CXParser.java

::echo CXBaseListener
echo package resources; > package_resources.txt
type src\main\resources\CXBaseListener.java >> package_resources.txt
copy /y package_resources.txt src\main\resources\CXBaseListener.java

::echo CXListener
echo package resources; > package_resources.txt
type src\main\resources\CXListener.java >> package_resources.txt
copy /y package_resources.txt src\main\resources\CXListener.java

::echo delete
del package_resources.txt

::echo Done!