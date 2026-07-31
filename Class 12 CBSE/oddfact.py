def fact(n):
    p=1
    for i in range(1,n+1):
        p*=i
    return p
n=int(input("Enter n terms:"))
k=1;s=0;x=1
while k<=n:
    s+=fact(x)
    x+=2
    k+=1
print("Sum=",s)