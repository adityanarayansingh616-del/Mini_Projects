#To add data and then display product details only for those with quantity<10!
import pickle
f=open("filebinary.bin","wb");l=list()
while True:
    prod_id=int(input("Enter product id:"))
    nm=input("Enter product name:")
    price=float(input("Enter product price:"))
    qty=float(input("Enter product quantity:"))
    c=input("More entries?[Y/N]")
    l.append([prod_id,nm,price,qty])
    if c.upper()=="N":
        break
pickle.dump(l,f)
f.close()
def display():
    with open("filebinary.bin","rb") as fob:
        data=pickle.load(fob)
        for i in data:
            if i[3]<10:
                print(i)
display()