#To rearrange a list so odd numbers come at the end and evens at the beginning.
def OddEnd(L):
    l=[];x=0
    for i in L:
        if i%2:
            l.append(i)
        else:
            l.insert(x,i)
            x+=1
    return l
print(OddEnd([1,2,3,4,5,1]))