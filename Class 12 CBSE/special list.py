l=[]
n=int(input("Enter no.of elements to be entered:"))
print("Enter",n,"numbers:")
for i in range(n):
    k=int(input())
    l+=[k]
for i in range(len(l)):
    if l[i]%2==0:
        l[i]-=2
    else:
        l[i]*=2
print(l)