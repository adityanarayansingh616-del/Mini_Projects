#To add student records to a pickle file and update marks by roll number.
import pickle as pk
fob=open("filebinary.bin","wb+")
def add():
    l=rec=list()
    n=int(input("Enter no. of records:"))
    for i in range(n):
        name=input("Enter name:")
        roll=int(input("Enter roll:"))
        marks=float(input("Enter marks:"))
        l=[name,roll,marks]
        rec.append(l)
    pk.dump(rec,fob)
def update():
    fob.seek(0)
    data=pk.load(fob)
    updroll=int(input("Enter roll for updation:"))
    for i in range(len(data)):
        if data[i][1]==updroll:
            data[i][2]+=1
    fob.seek(0)
    pk.dump(data,fob)
    fob.seek(0)
    print(pk.load(fob))
add()
update()
fob.close()
#Best method is to dump in one go and then update and print whole file data.

