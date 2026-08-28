#To compute the sum of alternating series x^2 - x^4 + x^6 - ... for n terms.
x=float(input("Enter x value:"))
n=int(input("Enter number of iterations:"))
sign=1;s=0;c=1
while c<=n:#Also using for loop
    s+=(x**(c*2))*sign
    sign*=-1
    c+=1
print(s)