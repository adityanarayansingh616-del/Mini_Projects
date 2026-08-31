#To add book detail records and change author name for a book ID entered by the user!
import pickle
with open("filebinary.bin","wb") as fob:
    n=int(input("Enter no.of entries:"))
    for i in range(n):
        bookid=int(input("Enter book id:"))
        bk_nm=input("Enter book name:")
        auth=input("Enter book author name:")
        pickle.dump([bookid,bk_nm,auth],fob)
def change_auth(ID):
    f=open("filebinary.bin","rb")
    l=[]
    try:
        while True:
            data=pickle.load(f)
            if data[0]==ID:
                new_auth=input("Enter new author name:")
                data[2]=new_auth
            l.append(data)
    except EOFError:
        f.close()
    with open("filebinary.bin","wb") as fob:
        for i in l:
            pickle.dump(i,fob)
change_auth(int(input("Enter book id to change author name:")))