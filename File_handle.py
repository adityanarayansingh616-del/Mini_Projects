f=open("File","w+")
def add():
    for i in range(5):
        print("Enter line",i+1,end=":")
        line=input()+"\n"
        f.write(line)
def display():
    f.seek(0)
    for i in range(5):
        line=f.readline()
        if line[0] in "AEIOUaeiou":
            print(line,end=str())
    f.seek(0)
    words=len(f.read().split())
    print("Total words in the file:",words)
add()
display()
f.close()