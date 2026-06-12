import pickle as pk
fob=open("filebinary","wb+")
def add():
    l=list()
    n=int(input("Enter no. of records:"))
    for i in range(n):
        name=input("Enter name:")
        roll=int(input("Enter roll:"))
        marks=float(input("Enter marks:"))
        l=[name,roll,marks]
        pk.dump(l,fob)
def update():
    fob.seek(0)
    updroll=int(input("Enter roll number for marks updation:"))
    while True:
        try:
            data=pk.load(fob)
            if updroll==data[1]:
                data[2]+=1
            print(data,end=",")
        except EOFError:
            break
    fob.seek(-1,1)
    pk.dump(data,fob)
add()
update()
#Best method is to dump in one go and then update and print whole file data.

