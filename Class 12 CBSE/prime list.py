l=[1,2,3,4,5,6,7,8,9,10]
for i in l:
    c=0
    for j in range(1,i+1):
        if i%j==0:
            c+=1
    if c==2:
        print(i)