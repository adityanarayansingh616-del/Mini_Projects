#To perform linear search for a number in a list and print its index.
l=eval(input("Enter a list:"))
x=int(input("Enter number to be searched:"))
for i in l:
    if x==i:
        print(i,"\nFound at index- ",l.index(i),sep='')
        import sys
        sys.exit()
print("Not found.")