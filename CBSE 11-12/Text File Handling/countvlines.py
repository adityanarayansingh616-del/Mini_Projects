#To count lines in a file that contain at least one vowel.
def countvlines():
    c=0
    with open("File.txt","r") as fob:
        lines=fob.readlines()
        for line in lines:
            for char in line:
                if char in "AEIOUaeiou":
                    c+=1
                    break
    return c
print(countvlines())

