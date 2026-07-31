def fact(k):
    f=1
    for i in range(1,k+1):
       f*=i
    return f
def SumSeries(x,n):
    sign=1;s=0
    for i in range(1,n+1):
        s+=(x**(i*2)/fact(i*2+1))*sign
        sign*=-1
    return s+1
print(SumSeries(float(input("Enter x:")),int(input("Enter n:"))))
