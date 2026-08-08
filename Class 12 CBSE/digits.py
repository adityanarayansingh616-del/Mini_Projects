#To count the number of digit characters in a string.
S=input("Enter a String:")
c=0
for i in S:
    if i in "0123456789":#Or just use isdigit():
        c+=1
print(c)
