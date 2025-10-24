nS=""
S=input("Enter a String:");S=" "+S
for i in range (len(S)):
    if S[i]==" ":
        nS=nS+" "+S[i+1]+S[i+2].upper()
    elif S[i-1]==" " or S[i-2]==" ":
        continue
    else:
        nS+=S[i]
print(nS.lstrip())
