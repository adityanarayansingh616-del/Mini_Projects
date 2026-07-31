f=open("File","a+")
def add():
    lines=[]
    n=int(input("Enter no.of lines:"))
    for i in range(n):
        line=input("Enter a line:")
        lines.append(line+"\n")
    f.writelines(lines)
def count():
    f.seek(0)
    lines=f.readlines()
    v=0;uc=0;lc=0;d=0;ws=0
    for line in lines:
        for chr in line:
            if chr in "AEIOUaeiou":
                v+=1
            if chr.isupper():
                uc+=1
            elif chr.islower():
                lc+=1
            elif chr.isdigit():
                d+=1
            elif chr.isspace() and chr!="\n":
                ws+=1
    print(v,uc,lc,d,ws,sep="\n")
add()
count()
f.close()