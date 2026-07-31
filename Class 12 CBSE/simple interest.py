p=float(input("Enter the principal amount:"))
r=float(input("Enter the rate of interest:"))
t=int(input("Enter the number of years:"))
si=p*r*t/100
a=p+si
print("Simple interest: RS.",si,sep="",end="/-\n")
print("Amount: RS.",a,sep="",end="/-")
