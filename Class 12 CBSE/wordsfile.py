def printlines():
    with open("File","r")as f:
        lines=f.readlines()
        for i in lines:
            if len(i.split())>4:
                print(i,end=str())
printlines()
