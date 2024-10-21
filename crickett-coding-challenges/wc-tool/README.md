# wc-tool

https://codingchallenges.fyi/challenges/challenge-wc

## Challenge

The challenge is to build a command line version of the Unix wc tool.  
The steps defined below are current as of 18th October 2024.

## Motivation

* Unix has a very simple "do one job, and do it well" mantra.  
* Java version needs to be able to be run from the command line.
* All coding to use core Java functionality only rather than importing libraries EXCEPT for tests.
* Program displays output rather than returning from main, because of course, you can't.
* Incrementally create solution via the following steps.

|Step | Description                                                                                          |
|-----|------------------------------------------------------------------------------------------------------|
|One  | Output number of bytes in file                                                                       |
|Two  | Allow the "-l" option to list the number of lines in the file                                        |
|Three| Allow the "-w" option to output the number of words in the file                                      |
|Four | Allow the "-m" option to output the number of characters in the file                                 |
|Five |Allow a default option which maps to "-c", "-l" and "-w" options - "-c" mapping to "-m" as per Step 4 |
|Final|Allow the text to be read in from standard input if no filename is supplied - in Unix this is piped in|

## Progress and Notes

### Step One

Status: In Progress

Findings and notes:
* No mention of error handling is specified in the steps
  Whilst a simple "happy path" solution can be easily created, which assumes parameters are always provided BUT this has
  the potential to throw really annoying runtime exceptions from a Java perspective; having just tried a simple "wc" command
  on an Ubuntu distribution, it then expects input, CTRL+C leading to... nothing.

  Bearing that in mind, the decision was made to check for parameters to be present.  This will be built up iteratively
  based up the requirements of each step.  Error validation will be as follows, with all throwing InvalidParameterExceptions.

| Error                 | Message                                    |
|-----------------------|--------------------------------------------|
| No file parameter     | No parameters were provided                |
| File not found        | File {filename} does not exist             | 
| More than 1 parameter | The file name should be the only parameter |

* The easiest solution would bew to code everything in the static main method; HOWEVER, as main cannot return a value, this
  means testing on the returned value cannot occur.
* The above is a fairly good rationale for splitting the code within the solution, especially given coding it all within
  the main method merges concerns; there is parameter validation AND file processing.
* Two additional classes have therefore been introduced to the solution; ParameterValidator and FileProcessor.
* Yes, naming isn't my strong point!

### Step Two

Status: Not started

### Step Three

Status: Not started

### Step Four

Status: Not started

### Step Five

Status: Not started

### Final Step

Status: Not started
