for i in range(1,6):
    for j in range(5,-6,-1):
        if j==0 or j==-1:
            continue
        elif abs(j)<=i:
            print(abs(j),end="")
        else:
            print(" ",end=str())
    print()