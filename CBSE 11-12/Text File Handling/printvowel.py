#To print file lines where every word contains at least one vowel.
def printline():
    with open("File.txt","r") as fob:
        lines=fob.readlines()
        for line in lines:
            words=line.split()
            for word in words:
                check=False
                for char in word:
                    if char in "AEIOUaeiou":
                        check=True
                        break
                if check==False:
                    break
            if check:
                print(line,end=str())
printline()

