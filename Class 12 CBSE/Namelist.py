l=[];c=0
print("Enter 5 names:")
for i in range(5):
    n=input()
    l.append(n)
for j in l:
    if j[-2:]=="ta":
        c+=1
print(c)