def countnvlines():
    c=0
    f=open("File","r")
    lines=f.readlines()
    for line in lines:
        check=True
        for char in line:
            if char in "AEIOUaeiou":
                check=False
                break
        if check:
            c+=1
    f.close()
    return c
print(countnvlines())