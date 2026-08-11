#To reverse a string character by character.
rs=str()
s=input("Enter a string:")
for i in s:
    rs=i+rs
print(rs)