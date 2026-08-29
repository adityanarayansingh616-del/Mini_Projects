#This is the best method to open and close files whenever you want without any unnecessary complexity of using seek() repeatedly.
#Menu driven code to add records or display records using a binary file.
import pickle
def add_records(n):
    f=open("filebinary.bin","wb")
    for i in range(n):
        roll=int(input("Enter roll:"))
        nm=input("Enter name:")
        perc=float(input("Enter percentage of marks:"))
        pickle.dump([roll,nm,perc],f)
    f.close()
def display():
    c=0
    f=open("filebinary.bin","rb")
    while True:
        try:
            data=pickle.load(f)
            print(data)
            c+=1
        except EOFError:
            break
    if c==0:
        print("No records found!")
    f.close()
while True:
    print("\t\t\tMENU")
    print("1. Add student records.\n2. Display student records.\n3. Press 0 to exit!")
    c=int(input("Enter your choice:(1 or 2)"))
    if c==0:
        print("You are out and now can exit the terminal.")
        break
    elif c==1:
        add_records(int(input("Enter no. of records to be added:")))
    elif c==2:
        display()
    else:
        print("Invalid input.")