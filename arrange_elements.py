def ArrangeElements(X):
    l=[];x=0
    for i in X:
        if i<0:
            l.insert(x,i)
            x+=1
        elif i>0:
            l.append(i)
        else:
            l.insert((len(l)-1)//2,0)
    return l
print(ArrangeElements([1,-2,3,4,-5,7,0,0,0,0]))