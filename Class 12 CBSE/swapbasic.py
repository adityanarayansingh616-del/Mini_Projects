l=eval(input("Enter a list:"))
for i in range(0,len(l),2):
    if l.index(l[i])==len(l)-1:
        break
    l[i],l[i+1]=l[i+1],l[i]
print(l)