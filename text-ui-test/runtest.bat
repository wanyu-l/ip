@ECHO OFF

REM create bin directory if it doesn't exist
if not exist ..\bin mkdir ..\bin

REM delete output from previous run
if exist ACTUAL.TXT del ACTUAL.TXT

REM compile the code into the bin folder

REM @@author:crypto-code {wanyu-l}-reused
dir /s /B  ../src/main/java/*/*.java > sources.txt
javac  -cp ..\src\main\java -Xlint:none -d ..\bin @sources.txt
REM @@author:crypto-code {wanyu-l}-reused

IF ERRORLEVEL 1 (
    echo ********** BUILD FAILURE **********
    exit /b 1
)
REM no error here, errorlevel == 0

REM run the program, feed commands from input.txt file and redirect the output to the ACTUAL.TXT
java -classpath ..\bin Duke < input.txt > ACTUAL.TXT

REM compare the output to the expected output
FC ACTUAL.TXT EXPECTED.TXT
