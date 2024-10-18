# wc-tool

https://codingchallenges.fyi/challenges/challenge-wc

## Challenge

The challenge is to build a command line version of the Unix wc tool.  
The steps defined below are current as of 18th October 2024.

## Motivation

* Unix has a very simple "do one job, and do it well" mantra.  
* Java version needs to be able to be run from the command line.
* Incrementally create solution via the following steps.
* Step One
  - Output number of bytes in file.
* Step Two
  - Allow the "-l" option to list the number of lines in the file.
* Step Three
  - Allow the "-w" option to output the number of words in the file.
* Step Four
  - Allow the "-m" option to output the number of characters in the file.
* Step Five
  - Allow a default option which maps to "-c", "-l" and "-w" options - "-c" mapping to "-m" as per Step 4.
* Final Step
  - Allow the text to be read in from standard input if no filename is supplied - in Unix this is piped in.
