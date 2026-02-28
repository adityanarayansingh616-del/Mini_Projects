l=eval(input("Enter a list of integers:"))
for i in range(len(l)-1):
    for j in range(len(l)-1-i):
        if l[j]>l[j+1]:
            x=l[j]
            l[j]=l[j+1]
            l[j+1]=x
print(l)