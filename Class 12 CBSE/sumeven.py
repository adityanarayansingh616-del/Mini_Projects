#To compute the sum of the first n even numbers (0, 2, 4, ...).
s=0;c=0;x=1
n=int(input("Enter n:"))
while x<=n:
    s+=c
    c+=2
    x+=1
print("Sum=",s)