l=list()
n=int(input("Enter n:"))
print("Enter",n,"integers:")
for i in range(n):
    l.append(int(input()))
x=len(l)
if x%2!=0:
    x-=1
for i in range(0,x,2):
    l[i],l[i+1]=l[i+1],l[i]
print(l)