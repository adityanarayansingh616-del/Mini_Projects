c=1;p=0;ne=0
print("Enter 10 numbers:")
while c<=10:
    n=int(input())
    if n>0:
        p+=1
    elif n<0:
        ne+=1
    c+=1
print("Positive numbers=",p,"\nNegative numbers=",ne)