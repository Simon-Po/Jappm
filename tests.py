import os
from termcolor import colored
import time
import subprocess

subprocess.Popen("cd \"C:\\Users\\simon\\school\\03_Porjects\\JAVA\\Jappm\"; & \"C:\\Program Files\\Eclipse Adoptium\\jdk-17.0.5.8-hotspot\\bin\\java.exe\" \"-XX:+ShowCodeDetailsInExceptionMessages\" \"-cp\" \"C:\\Users\\simon\\AppData\\Roaming\\Code\\User\\workspaceStorage\\556545af1610e1bd912a8521211d2e90\\redhat.java\\jdt_ws\\Jappm_165ea8cb\\bin\" \"jappm.TestIt\"", shell=True, stdout=subprocess.PIPE).stdout.read()

with os.scandir('./Tests\\') as entries:
    for entry in entries:
        with open(entry, 'r') as file1:
            with open("./TestTemplate\\" + entry.name, 'r') as file2:
                diff = set(file1).difference(file2)
        
        
        if "".join(diff) != "":
            print(colored("☒\tERROR: Something went wrong in file: " + entry.name,"red"))
            print(colored(" \tthe diff is: \n " + "".join(diff),"red"))
        else:
            print(colored("☑\tFile " + entry.name + " is the same","green"))
            
