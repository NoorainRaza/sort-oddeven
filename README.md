# sort-oddeven
This application sorts numbers as following requirement:
    Sort a list of numbers so that odd numbers are sorted before even numbers, and relative order is preserved.

# System requirement
Java and maven must be installed in order to run the application

# Running the application
Go to the location of source code using following command
    
    cd /path/to/sourcecode


Run the maven command to build the application with test

    mvn clean install


# Test report
After the completion of mvn clean install command you can see the sure-fire report at the following location:

Go to the location of source code and change directory to newly created target directory
    
    cd /path/to/sourcecode/target/surefire-reports
    
Inside target/surefire-reports directory you will find report files in text and xml format.