#To filter numbers divisible by 9 and ending in 2 or 6 from a list.
def Multiple6(L):
    l=[]
    for i in L:
        if i%9==0 and (i%10==2 or i%10==6):
            l.append(i)
    return l
print(Multiple6([486,99,27,972,36,1845]))