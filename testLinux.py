import os
from termcolor import colored
import time
import subprocess

subprocess.Popen("/usr/bin/env /usr/lib/jvm/java-17-openjdk-17.0.6.0.10-1.fc37.x86_64/bin/java -XX:+ShowCodeDetailsInExceptionMessages -cp /home/simonp/.config/Code/User/workspaceStorage/d00a99b8aa74822b4f7242c74d31040c/redhat.java/jdt_ws/Jappm_10545295/bin jappm.TestIt ", shell=True, stdout=subprocess.PIPE).stdout.read()

with os.scandir('./Tests/') as entries:
    for entry in entries:
        with open(entry, 'r') as file1:
            with open("./TestTemplate/" + entry.name, 'r') as file2:
                diff = set(file1).difference(file2)
        
        
        if "".join(diff) != "":
            print(colored("☒\tERROR: Something went wrong in file: " + entry.name,"red"))
            print(colored(" \tthe diff is: \n " + "".join(diff),"red"))
        else:
            print(colored("☑\tFile " + entry.name + " is the same","green"))
            
