s=0;avg=0;c=0
start=int(input("Enter start value:"))
end=int(input("Enter end value:"))
start+=1;end-=1
while start<=end:
    if(start%7==0):
        s+=start
        c+=1
    start+=1
avg=s/c
print("Sum=",s,"\nAverage=",avg)
