#l=eval(input("Enter a list of numbers:")) or
l=[];nl=[]
n=int(input("Enter number of elements to be entered:"))
print("Enter",n,"elements of the list:")
for i in range(n):
    k=int(input())
    l.append(k)
for i in l:
    if l.index(i)==len(l)-1:
        nl.insert(0,i)
        break
    nl+=[i]
print(nl)