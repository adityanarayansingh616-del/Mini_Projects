#To compute the Taylor series sum for cos(x) up to n terms.
import math
def SumSeries(x,n):
    sign=1;sum=1
    for i in range(2,n+1):
        sum+=(x**((i-1)*2)/math.factorial((i-1)*2+1))
        sign*=-1
    return sum
print(SumSeries(2,10))