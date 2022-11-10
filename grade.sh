# Create your grading script here

set -e

rm -rf student-submission
git clone $1 student-submission

rm -rf testing-directory
mkdir testing-directory
cp TestListExamples.java testing-directory

cd student-submission

# Checks if file exists

if [[-f ListExamples.java]]
    then 
    echo "File ListExamples.java found!"
    cp ListExamples.java ../testing-directory
    else 
    echo "File ListExamples.java not found. Please recheck your submission."
    exit 1
fi 

cd testing-directory

javac -cp ".;lib/hamcrest-core-1.3.jar;lib/junit-4.13.2.jar" *.java
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore TestListExamples

if [[$? == 0]]
    then
    else
fi





