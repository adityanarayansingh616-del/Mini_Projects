l=[]
n=int(input("Enter number of names to be entered:"))
print("Enter",n,"names:")
for i in range(n):
    k=input()
    l+=[k]#or append
for i in l:
    check=True
    for j in i:
        if j in "AEIOUaeiou":
            check=False
            break
    if check:
        print(i)