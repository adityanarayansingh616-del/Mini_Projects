l=[];nl=[]
n=int(input("Enter number of elements to be entered:"))
print("Enter",n,"elements:")
for i in range(n):
    k=input()
    l.append(k)
x=int(input("Enter number of times to rotate the list:"))
for i in range(x):
    for j in range(len(l)):
        if j==0:
            nl.append(l[j])
        else:
            nl.insert(j-1,l[j])
    l=nl
    if i!=x-1:
        nl=[]
print(nl)