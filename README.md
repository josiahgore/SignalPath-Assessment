## SignalPath Assessment

### Language Ratings

* Scala - 3
* Java - 1
* Python - 1
* Clojure - 4
* Haskell - 4
* Kotlin - 3
* Golang - 1
* Rust - 4
* Groovy - 1
* Node.js - 2
* Ruby - 1
* Angular - 1
* Helm - 4
T* Terraform - 4
* MQL (MongoDB Query Language) - 2 (I have professional production experience, but limited)
* SQL - 1

### hex2base64

There is a Windows executable for this golang script, as that is the OS I'm currently on. I've got docker and a loaner mac so let me know if you need a linux or mac build.

It will take as many hex strings as you want and print them re-encoded on separate lines.

### special-math

I used sbt for this. There is no executable JAR, but I can figure that out if necessary.

There are some unit tests for it, but not for 90, as I found that to diverge. Ran it overnight with no solution. Ran the python script with the same result. After encountering this result, I added a --debug flag that will, every 60 seconds, print the number of encounters with each number. Slows the script down substantially. Algorithm seems to love 3, 7, and 14 especially.

At first I was curious if it was a prime number thing, but that wasn't it. Then, maybe multiples of certain numbers. Anyways -

Sample after running for a few hours:

3 -> 468

7 -> 289

14 -> 158

26 -> 97

46 -> 67

79 -> 24

133 -> 23

221 -> 13

364 -> 4

1581 -> 4

596 -> 4

4163 -> 2

2567 -> 2

972 -> 2

75001 -> 1

6746 -> 1
