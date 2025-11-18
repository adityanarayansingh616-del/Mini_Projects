t=eval(input("Enter a tuple:"))
et=()
for i in range(len(t)):
    x=i+1
    if x%2==0:
        et+=(t[i],)
print(et)