#To replace each non-zero list element with 1 (positive) or -1 (negative).
l=eval(input("Enter a list:"))
for i in range(len(l)):
  if l[i]!=0:
    if l[i]>0:
        l[i]=1
    else:
        l[i]=-1
print(l)