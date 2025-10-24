ns=""
s=input("Enter a string:")
for i in range(len(s)):
    if i%2!=0:
        ns+=s[i].upper()
    else:
        ns+=s[i]
print(ns)