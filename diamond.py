for i in range(1,6):
    if i==1 or i==5:
        k=3
    elif i==2 or i==4:
        k=24
    else:
        k=15
    for j in range(1,6):
        if j==k%10 or j==k//10%10:
            print("*",end="")
        else:
            print(end=" ")
    print()