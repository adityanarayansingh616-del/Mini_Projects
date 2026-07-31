l=list()
print("Enter 5 names:")
for i in range(5):
    n=input()
    l.append(n)
c=0
for i in range(len(l)):
    if l[i][0].isupper():
        c+=1
print(c)