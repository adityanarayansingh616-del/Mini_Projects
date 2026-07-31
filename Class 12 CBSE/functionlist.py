x=list()
def func(l):
    for i in range(len(l)):
        if l[i]>0:
            l[i]+=1
        elif l[i]<0:
            l[i]-=1
    print(l)
print("Enter 5 integers to create a list:")
for i in range(5):
    x.append(int(input()))
func(x)