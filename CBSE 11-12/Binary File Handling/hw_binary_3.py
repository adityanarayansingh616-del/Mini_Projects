#To manage inventory records in a binary file with menu-driven add/display/search/update/delete.
import pickle
def add():
    f=open("filebinary.bin","rb+")
    stc=[]
    try:
        stc=pickle.load(f)
    except EOFError:
        pass
    n=int(input("Enter no.of records to be added:"))
    for i in range(n):
        it_num=int(input("Enter item number:"))
        it_name=input("Enter item name:")
        utp=float(input("Enter unit price:"))
        qty=float(input("Enter quantity:"))
        stc.append([it_num,it_name,utp,qty])
    f.seek(0)#You can also close the file and then reopen it in wb mode to clear the existing old data and freshly dump the updated/new one.
    pickle.dump(stc,f)
    f.close()
def display():
    with open("filebinary.bin","rb") as f:
        try:
            records=pickle.load(f)
            for record in records:
                print(record)
        except EOFError:
            print("No record found!")
def search():
    with open("filebinary.bin","rb") as f:
        try:
            records=pickle.load(f)
            for record in records:
                if record[3]>100:
                    print("Total value: RS.",record[3]*record[2],sep=str(),end="/-\n")
                    print("Quantity:",record[3])
        except EOFError:
            print("No record found!")
def update():
    up_it_num=int(input("Enter item number for updation:"))
    with open("filebinary.bin","rb+") as f:
        try:
            records=pickle.load(f)
            for record in records:
                if record[0]==up_it_num:
                    record[2]+=10.00
                    record[3]+=20.00
            f.seek(0)
            pickle.dump(records,f)
        except EOFError:
            print("No record found!")
def delete():
    with open("filebinary.bin","rb+") as f:
        try:
            records=pickle.load(f)
            for record in records:
                if record[3]==0:
                    del records[records.index(record)]
            f.seek(0)#You can also reopen the file in wb mode and dump fresh new data at once instead of overwriting.
            pickle.dump(records,f)
        except EOFError:
            print("No record found!")
while True:
    print("\t\tMENU")
    print("1.add\n2.display\n3.search\n4.update\n5.delete\n6.quit")
    ch=int(input("Enter your choice:"))
    if ch==1:
        add()
    elif ch==2:
        display()
    elif ch==3:
        search()
    elif ch==4:
        update()
    elif ch==5:
        delete()
    elif ch==6:
        break
    else:
        print("Incorrect choice.")
#You can also create two more funcs to reduce the length of this code without altering logic. One for loading records and one for saving updated records.
'''import pickle
FILENAME = "filebinary.bin"
def load_records():
    try:
        with open(FILENAME, "rb") as f:
            return pickle.load(f)
    except (EOFError, FileNotFoundError):
        return []

def save_records(records):
    with open(FILENAME, "wb") as f:  # always overwrite cleanly
        pickle.dump(records, f)

def add():
    records = load_records()
    n = int(input("Enter no. of records to be added: "))
    for _ in range(n):
        it_num = int(input("Enter item number: "))
        it_name = input("Enter item name: ")
        utp = float(input("Enter unit price: "))
        qty = float(input("Enter quantity: "))
        records.append([it_num, it_name, utp, qty])
    save_records(records)

def display():
    records = load_records()
    if records:
        for record in records:
            print(record)
    else:
        print("No record found!")

def search():
    records = load_records()
    found = False
    for record in records:
        if record[3] > 100:
            found = True
            print("Total value: Rs.", record[3] * record[2], "/-")
            print("Quantity:", record[3])
    if not found:
        print("No matching record found!")

def update():
    records = load_records()
    up_it_num = int(input("Enter item number for updation: "))
    for record in records:
        if record[0] == up_it_num:
            record[2] += 10.00
            record[3] += 20.00
    save_records(records)

def delete():
    records = load_records()
    records = [r for r in records if r[3] != 0]
    save_records(records)

while True:
    print("\t\tMENU")
    print("1.add\n2.display\n3.search\n4.update\n5.delete\n6.quit")
    ch = int(input("Enter your choice: "))
    if ch == 1:
        add()
    elif ch == 2:
        display()
    elif ch == 3:
        search()
    elif ch == 4:
        update()
    elif ch == 5:
        delete()
    elif ch == 6:
        break
    else:
        print("Incorrect choice.")'''
