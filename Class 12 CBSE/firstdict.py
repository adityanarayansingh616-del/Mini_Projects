d=dict()
print("Enter details of 5 students:")
for i in range(5):
    print("Student",i+1)
    r=int(input("Enter roll no:"))
    n=input("Enter name:")
    m=float(input("Enter marks:"))
    d[r]=[n,m]
print(d)