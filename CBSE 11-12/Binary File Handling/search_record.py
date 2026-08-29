#To write student records to a binary file and search those with marks >90.
import pickle
f=open("filebinary.bin","wb")
n=int(input("Enter no.of students:"))
for i in range(n):
    name=input("Enter name:")
    roll=int(input("Enter roll:"))
    marks=float(input("Enter marks:"))
    pickle.dump([roll,name,marks],f)
f.close()
def search():
    x=0
    with open("filebinary.bin","rb") as f:
        while True:
            try:
                data=pickle.load(f)
                if data[2]>90:
                    print("Name:",data[1])
                    print("Roll number:",data[0])
                    x=1
            except EOFError:
                break
    if x==0:
        print("No data found!")
search()