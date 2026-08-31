#To add data and copy selected records from one binary file to other!
import pickle
with open("filebinary.bin","wb") as fob:
    n=int(input("Enter no.of entries:"))
    for i in range(n):
        empid=int(input("Enter employee id:"))
        nm=input("Enter name:")
        dept=input("Enter department:")
        pickle.dump([empid,nm,dept],fob)
def copy_select():
    f=open("filebinary.bin","rb")
    fob=open("filebinary1.bin","wb")
    try:
        while True:
            data=pickle.load(f)
            if data[2].upper()=="SALES":
                pickle.dump(data,fob)
    except EOFError:
        f.close()
        fob.close()
copy_select()