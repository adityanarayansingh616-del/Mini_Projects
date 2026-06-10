def Perfect_No(num):
    for i in range(1,num+1):
        sum=0
        for j in range(1,i):
            if i%j==0:
                sum+=j
        if sum==i:
            print(i)
Perfect_No(int(input("Enter an integer:")))