#To add data and append more no. of entries(data) into the binary file without deleting previous ones using os module!
import pickle,os
def add_record(n):
    f=open("filebinary.bin","wb")
    l=[]
    for i in range(n):
        roll=int(input("Enter roll:"))
        nm=input("Enter name:")
        perc=float(input("Enter percentage:"))
        l.append([roll,nm,perc])
    pickle.dump(l,f)
    f.close()
def append(x):
    f=open("filebinary.bin","rb")
    cf=open("filebinary1.bin","wb")
    data=pickle.load(f)
    for i in range(x):
        roll=int(input("Enter roll:"))
        nm=input("Enter name:")
        perc=float(input("Enter percentage:"))
        data.append([roll,nm,perc])
    pickle.dump(data,cf)
    f.close()
    cf.close()
    os.remove("filebinary.bin")
    os.rename("filebinary1.bin","filebinary.bin")
add_record(int(input("Enter no.of entries:")))
append(int(input("Enter no.of entries to be appended:")))
#You can do this without os module by just appending new list entries into the existing loaded data one by one and then opening the original file once again freshly in wb mode to clear old data and then dumping the new updated list data containing new list entries. No second binary file is needed!