#To append lines to a file and count words longer than 4 characters per line.
f=open("jvm","a+")
def Add():
    lines=[]
    n=int(input("Enter no.of lines:"))
    for i in range(n):
        line=input("Enter a line:")
        lines.append(line+"\n")
    f.writelines(lines)
def words():
    f.seek(0)
    lines=f.readlines()
    for line in lines:
        c=0
        words=line.split()
        for word in words:
            if len(word)>4:
                c+=1
        print(c)
Add()
words()
f.close()