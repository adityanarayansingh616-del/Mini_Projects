s=input("Enter a String:");d={}
for i in s:
    x=i.lower()
    if x in d:
        d[x]+=1
    else:
        d[x]=1
for key,value in d.items():
    print(key,value,sep=":")
