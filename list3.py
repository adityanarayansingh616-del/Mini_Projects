l=eval(input("Enter a Python list:"))
for i in range(len(l)):
    if l[i]%2==0:
        l[i]*=2
    else:
        l[i]-=2
print(l)