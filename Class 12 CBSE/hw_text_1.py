fob=open("jvm","a+")
def add(n):
    for i in range(n):
        line=input("Enter a line:")+"\n"
        fob.write(line)
def display():
    fob.seek(0)
    c=0
    lines=fob.readlines()
    for line in lines:
        if line[0] in "AEIOUaeiou":
            print(line,end=str())
            c+=1
    print(c)
add(int(input("Enter no. of lines:")))
display()
fob.close()