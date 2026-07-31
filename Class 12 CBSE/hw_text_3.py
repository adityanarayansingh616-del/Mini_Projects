f=open("File","a+")
def Add():
    lines=[]
    n=int(input("Enter no.of lines:"))
    for i in range(n):
        line=input("Enter a line:")
        lines.append(line+"\n")
    f.writelines(lines)
def display():
    f.seek(0)
    while True:
        line=f.readline()
        if line==str():
            break
        words=line.split()
        for word in words:
            print(word,end="#")
        print()
Add()
display()
f.close()



