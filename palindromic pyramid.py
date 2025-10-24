l=[];r=1;k=0
for i in range(10,1001):
    d=0;ri=0;x=i
    while i:
        d=i%10
        ri=ri*10+d
        i//=10
    if ri==x:
        l.append(x)
for j in l:
    print(j,end=" ")
    k+=1
    if k==r:
        print()
        r+=1
        k=0

