import math
fh=0;sh=0
w=input("Enter a word:")
l=len(w)
mid=math.ceil(l/2)
for i in range(l):
    if l%2!=0 and i+1==mid:
        continue
    elif i+1<=mid:
        fh+=ord(w[i])
    else:
        sh+=ord(w[i])
if fh==sh:
    print("Balanced.")
else:
    print("Not balanced.")