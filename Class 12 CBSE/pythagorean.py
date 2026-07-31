import math
for i in range(1,99):
    for j in range(i+1,101):
        x=math.sqrt(i**2+j**2)
        if x==int(x) and x<=100:
            print((i,int(x),j))