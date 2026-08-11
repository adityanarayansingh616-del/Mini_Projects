#To compute the sum of all prime numbers from 1 to N.
def prime(n):
    c=0;check=False
    for i in range(1,n+1):
        if n%i==0:
            c+=1
    if c==2:
        check=True
    return check
def SumPrime(N):
    sum=0
    for i in range(1,N+1):
        if prime(i):
            sum+=i
    return sum
print(SumPrime(int(input("Enter an integer:"))))