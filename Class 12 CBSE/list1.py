l=eval(input("Enter a list:"));c=0
for i in range(len(l)):
    if l[i]%2==0:
        c+=1
print(c)
