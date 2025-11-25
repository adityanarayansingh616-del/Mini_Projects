t=(1,1,2,2,2,3,2)
d=dict()
for i in t:
    if i in d:
        d[i]+=1
    else:
        d[i]=1
for key,value in d.items():
    print(key,value,sep=":")