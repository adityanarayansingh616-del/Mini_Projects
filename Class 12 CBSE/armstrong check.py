n=int(input("Enter n:"))
s=0;d=0;k=n
while n:
    d=n%10
    s+=(d**3)
    n//=10
if k==s:
    print(k,"is an Armstrong number.")
else:
    print(k,"is not an Armstrong number.")