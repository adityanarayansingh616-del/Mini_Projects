k=0#Statically initialized before use.
n=int(input("Enter n:"))#Dynamically initialized before use.
for i in range(1,n+1):
    for j in range(1,i+1):
        k+=1
        print(k,end=" ")
    print()