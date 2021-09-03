# FINANCIAL.COM JAVA CODING CHALLENGE 2021
This readme describes what the challenge is and the rules and guidelines of how it runs.

The coding challenge is designed as a small competition for all employees of financial.com, no matter which department or team.
In contrast to many other challenges, this is not just a simple programming task that mainly rewards speedy development or
coding hacks - but instead tries to reward professional software development as well. This includes being able to
explain concepts in documentation, write readable and testable code, understanding the assignments in detail and making sure that this runs on a machine that is not yours under circumstances you barely know in advance.
If this is challenging for you - well, that's why it's being called a challenge, right?

This uncertainty of not knowing how the final testcases that the application will be subjected to is one of the key challenges.
Furthermore, when these tests are revealed, they can lead to a good laugh when people have the "oh, gosh" moment, when they found out they have not thought of a very obvious thing.

In any case, the challenge is specifically designed to create a  leveled playing field. I have run coding challenges like these before and generally,
it's not the favourites that take the top spots. Coding proficiency can be easily made up by someone else who has the better idea and implements it with a straight forward, pure Java approach that does not need many extras.


So, who will be the winner of the 2021 edition of the financial.com Java coding challenge? Let's find out together!


## What is the purpose?
There are several purposes for organizing this.
* It's fun to challenge yourself and compare yourself with your peers
* It's a nice exercise and opportunity to learn from each other
* It improves our collective and family spirit
* It can unearth hidden talents or allow you to test a new technology or new approach
* Bragging rights for the winners
* Some prizes and rewards being given out on top

## Who runs this challenge?
This challenge is mainly run by me (Oliver Finker) but wholeheartedly supported by the management who gladly are sponsoring this with some prizes.
For the grading of code quality etc. members of the **Software Architecture Guild** will assist me to make sure I stay impartial and am not just judging based on my own opinions and taste.

## What is it about?
The title for the 2021 edition of the coding challenge is "_Anagrams_". The definition of an anagram - for this challenge - is as follows:

**anagram**, _noun_
1. a word, phrase, or name formed by rearranging the letters of another, such as _spar_, formed from _rasp_.

In this challenge, the task is to implement a class with several methods that identify or search for certain anagrams
within an input file. The input file is a text file in UTF-8 format, with one word/phrase/name on each line. A very short example file is provided to give a rough idea.

The implementation is used in two ways.
1. The methods undergo a (unknown to the developer) test suite of many unit tests that test a variety of test cases. As many tests as possible should pass successfully.
2. Afterwards, an application is started that uses the implemented class in a benchmark setting. This application gets only limited memory and is subjected to many consecutive method calls. This is designed in a way to make memory leaks apparent and also allows developers to think about how to deal with repeated lookups. A stateful approach is allowed but you'll have to keep the specified restrictions in mind!


The task at hand is pretty simple, and it's possible to implement a first solution within just few hours. From then onwards,
it's a question of fiddling around, trying different approaches and experimenting - as much as you like.
An elegant but simple solution that is not much slower can potentially outclass an over-engineered solution because it is much more readable and understandable. There is no one winning strategy - so like in real life it's a matter of making decisions and trade-offs. Think of it like with sorting algorithms: some have great speed while others are less resource hungry - they both excel at different things. Being able to explain and show where the strengths and weaknesses of your approach are is a plus.

## How can I participate?
If you are interested in participating, just sign up to the competition by e-mailing me or message me on MS Teams.
In return, you'll get a codename (something like _ExplodingMouse_) that is used to identify your entry while still maintaining your anonymity.

Afterwards you will get access to the GitHub repository with the project stub sourcecode. You'll have to create a fork of it and host it in *your own* financial.com GitHub account (so mine would be ofr-financial-com). You should likely make this repository private.

When you submit your entry, you will need to make this repository accessible to me (by inviting my account as a collaborator). Commits after the submission date will not be taken into account unless specifically agreed with me.
Your git commits, log messages and general way of dealing with version control is also part of the "style" grade.
## What are the rules?
To make the results comparable and the amount of work involved to run and measure your programs manageable, there are a few rules and restrictions in place.

### General rules

1. Your code should reflect your assigned codename as package name and for directory names. So you have to replace "sample" where needed. Keep the sample package intact though.
2. Your code needs to come with good documentation that fits your implementation and explains what you're doing and the reasoning behind it.
3. The language for code and documentation must be English. Spelling mistakes or grammar mistakes are not relevant, we know that not everyone is perfect in this foreign language.
4. Anonymity has to be maintained. This should be a positive challenge and fun thing for everyone without the risk of negative exposure.
5. You may discuss things with colleagues though to exchange ideas, if you want to.
6. If you want to participate as a pair, this is possible - but you'll have to split the prize between you in that case.
7. For copycats though, this will result in disqualification for both entries, as there's no way to find out who was the original and who the copy.
8. Entries being submitted after the end date will not be benchmarked or graded anymore. Submit in a timely fashion!
9. Most important rule: This challenge is for your **SPARE TIME** only, if you so wish. I will be using my spare time as well for grading and benchmarking this, so please don't do this in your work time.

### Technological restrictions

1. Your program needs to be done within the limitations of the involved stack. If you want to include some libraries, they need to be publicly available and configured in Gradle
.
2. You are responsible for the risk of including foreign code.
3. If the gradle build fails or a library can't be downloaded, your program can't be benchmarked or graded. 
4. JDK is adopt-openjdk-11 version 11.0.10 - your program needs to compile and run with that
5. The program must run with only 512 MB of heap memory on a 64-bit system
6. The program must run on Windows 10. Keep this in mind when it comes to interacting with the operating system!
7. External calls to system functions or other programs are not allowed 
8. Spawning another process (with more memory) is not allowed either. I have run this type of challenge too many times to not know this trick ;-)
9. No C/C++ or Bytecode instructions to optimize things. (So no JNI). Stay within the pure Java world. 
10. Input files must be available in the designated resource directory 
11. Output files must be written only to the designated output directory - these files may also be read back in by the application
12. Designated output folder has a total max size of 2 GB
13. GPU and GPU memory are not to be used for this challenge. But if you thought about doing this: nice one!
14. Dirty tricks will be identified and will lead to instant disqualification.

## Grading
Ranking will be done according to this grading guide:
* Functionality (30%)
    * Does the build process work? Does it compile on the given JDK?
    * Does the application pass all test cases of the (hidden) test suite?
    * Does the application run the (hidden) benchmarking suite?
    * Does the application remain stable under stress and load?
* Performance (30%)
  * Results of benchmarking, relative to other entries
* Style (30%)
  * Code style, architecture, quality, readability, comprehensiveness, unit tests, a decision diary or changelog, versioning, etc.
* Documentation (10%)
  * Howto, guides, manuals, explanation of the concepts and your solution, in-code documentation and markdown, schematics for difficult to understand ideas, etc

In other words: some code tricks might be helpful in regard to performance but lose points in regard to comprehensiveness and readability. This trade-off is a tricky decision and part of the challenge.

Should there be only a minor issue that prevents the application from running, you get **ONE** attempt for fixing the issue. Work carefully!

### Test Suite
The unit tests and test suite for the application are **non-public**. They run against the public interface of abstract methods that you have to implement (so you should not change the contract!).

Some advice:
* Read the instructions and existing comments carefully
* Think from a tester's perspective. What could happen?
* Think of edge cases and potential inputs
* Assumptions can be dangerous!

## Timeline

* The latest possible entry date is Friday, October 1st, 2021. 
* The latest possible submission date is Friday, November 19th, 2021.
* Benchmarking and grading will start on November, 1st, 2021.
* Presentation of winners and entries will be likely done in December 2021.

## Prizes
* There will be prizes for the top 3 entries of the challenge.
* In addition there will be prizes for winners of individual subcategories.
* Details for how much the prizes are will be announced at a later date when it's clear how many people are participating.
* In addition, winners of the coding challenge will receive a special Badge.


Good luck!