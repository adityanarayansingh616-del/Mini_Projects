#To append lines to a file and copy lines containing 'a' to another file.
cf=open("copyfile","w")
f=open("File","a+")
def add():
    lines=[]
    n=int(input("Enter no.of lines:"))
    for i in range(n):
        line=input("Enter a line:")
        lines.append(line+"\n")
    f.writelines(lines)
def rem():
    f.seek(0)
    lines=f.readlines()
    for line in lines:
        if "a" in line:
            cf.write(line)
add()
rem()
f.close()
cf.close()