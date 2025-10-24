x=float(input("Enter x:"))
n=int(input("Enter n terms:"))
s=0;sign=1
for i in range(1,n+1):
    f=1
    for j in range(1,i*2+1):
        f*=j
    s+=((x**(i*2))/f)*sign
    sign*=-1
print(s)