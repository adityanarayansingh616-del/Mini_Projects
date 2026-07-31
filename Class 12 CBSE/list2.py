l=eval(input("Enter a list:"))
for i in range(len(l)):
  if l[i]!=0:
    if l[i]>0:
        l[i]=1
    else:
        l[i]=-1
print(l)