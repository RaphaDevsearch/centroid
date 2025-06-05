#!/bin/bash

# clear consol
clear

# compil all java files
echo "Compiling ..."
javac centroid/*.java

# check if compiling is succeded
if [ $? -eq 0 ]; then
    echo "Compilation successful"
    # runing programg
    echo "Running program : "
    java centroid.Main
else
    echo "Compilation Failed"

fi