#To add student records as dicts in a pickle file and search name by roll number.
import pickle
f=open("filebinary","wb+")
def add():
    n=int(input("Enter no.of records:"))
    for i in range(n):
        l=list()
        roll=int(input("Enter roll:"))
        name=input("Enter name:")
        marks=float(input("Enter marks:"))
        d={roll:[name,marks]}
        l.append(d)
    pickle.dump(l,f)
def search():
    f.seek(0)
    rollin=int(input("Enter roll to search:"))
    data=pickle.load(f)
    for dic in data:
        for key in dic:
            if key==rollin:
                print(dic[key][0])
add()
search()
f.close()
#Can also be done by dumping dicts one by one instead of one go in the form of list containing dicts..