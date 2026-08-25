#To add data into a binary file and then update the salary of the employee using his ID entered by user.
import pickle as pk
def add():
    l=[]
    f=open("filebinary","wb")
    n=int(input("Enter no.of data:"))
    for i in range(n):
        emp_id=int(input("Enter Employee ID:"))
        nm=input("Enter name:")
        sry=float(input("Enter salary(in RS.):"))
        l.append([emp_id,nm,sry])
    pk.dump(l,f)
    f.close()
def increase():
    f=open("filebinary","rb+")
    ID=int(input("Enter employee id to update salary:"))
    data=pk.load(f)
    for i in data:
        if i[0]==ID:
            i[2]+=0.1*i[2]
    f.seek(0)
    pk.dump(data,f)
    f.seek(0)
    print(pk.load(f))
    f.close()
add()
increase()