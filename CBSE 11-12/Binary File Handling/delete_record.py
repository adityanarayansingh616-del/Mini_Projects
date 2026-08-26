#To add data to a binary file and delete a record on the basis of book ID entered by the user.
import pickle as pk
def add_data():
    f=open("filebinary","wb+")
    while True:
        book_ID=int(input("Enter book ID:"))
        book_nm=input("Enter book name:")
        price=float(input("Enter book price:"))
        pk.dump([book_ID,book_nm,price],f)
        c=input("More data?[Y/N]")
        if c.upper()=="N":
            break
    f.close()
def delete():
    f=open("filebinary","rb")
    ID=int(input("Enter book ID to remove record:"))
    l=list()
    try:
        while True:
            data=pk.load(f)
            if data[0]==ID:
                continue
            l.append(data)
    except EOFError:
        pass
    f.close()
    f=open("filebinary","wb+")
    for i in l:
        pk.dump(i,f)
    f.seek(0)
    while True:
        try:
            x=pk.load(f)
            print(x)
        except EOFError:
            break
    f.close()
add_data()
delete()