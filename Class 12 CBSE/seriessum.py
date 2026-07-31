x=1;sign=1;s=0
n=int(input("Enter n terms:"))
while n:
    s+=(x*sign)
    sign*=-1
    x+=2
    n-=1
print(s)