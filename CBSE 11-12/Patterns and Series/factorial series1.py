#To compute the sum of series x + x^2/2! + x^4/4! + ... for n terms.
x=float(input("Enter x:"))
n=int(input("Enter n terms:"))
s=0;sign=1;e=2
for i in range(1,n+1):
    f=1
    for j in range(1,e+1):
        f*=j
    s+=((x**e)/f)*sign
    sign*=-1
    e+=2
print(s)