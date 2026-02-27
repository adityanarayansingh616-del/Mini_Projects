n=int(input("Enter a number with two or more digits:"))
while True:
   if n//10==0:
     n=int(input("HATT!!, Please enter a number with 2 or more digits to continue!"))
   else:
       break
x=n
while True:
    if x>=10:
        s=0
        n=x
        while n:
            d=n%10
            s+=d
            n//=10
        x=s
    else:
        print(x)
        break
