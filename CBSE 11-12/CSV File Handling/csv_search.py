#To add data and then search for user id.
import csv
def add_data(n):
    f=open("filecsv.csv","w",newline="")
    csw=csv.writer(f)
    csw.writerow(["User ID","Password"])
    l=[]
    for i in range(n):
        user_id=int(input("Enter user id:"))
        pwd=input("Enter password:")
        l.append([user_id,pwd])
    csw.writerows(l)
    f.close()
def search(ID):
    with open("filecsv.csv","r",newline="") as fob:
        csr=csv.reader(fob)
        next(csr)
        for data in csr:
            if int(data[0])==ID:#Remember int() always because csv stores each separate field as str() by default because string can handle any other data type without throwing error!
                print("Password-",data[1])
                break
        else:#or use extra variable "found" with default value False and make it True if found!yy
            print("Not found!")
add_data(int(input("Enter no.of entries:")))
search(int(input("Enter user ID to be searched:")))