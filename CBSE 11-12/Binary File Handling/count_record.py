#To add data into binary file and count to display no. of players in CRICKET Sport!
import pickle
def add_data():
   f=open("filebinary.bin","wb")
   n=int(input("Enter no. of entries:"))
   l=list()
   for i in range(n):
      nm=input("Enter player name:")
      sprt=input("Enter sport:")
      age=int(input("Enter age:"))
      l.append([nm,sprt,age])
   pickle.dump(l,f)
   f.close()
def count():
    f=open("filebinary.bin","rb")
    data=pickle.load(f)
    c=0
    for i in data:
        if i[1].upper()=="CRICKET":
            c+=1
    print("No.of players in CRICKET-",c)
    f.close()
add_data()
count()