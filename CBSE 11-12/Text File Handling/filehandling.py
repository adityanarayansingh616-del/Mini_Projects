#To print lines from a file that contain no vowels.
def printnotvowel():
    f=open("File.txt","r")
    lines=f.readlines()
    for line in lines:
        check=1
        for char in line:
            if char in "AEIOUaeiou":
                check=0
                break
        if check:
            print(line,end=str())