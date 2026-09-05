#To add data to csv file and then read to print student name and marks whose marks are greater than 75 and also to count students with marks<40.
import csv
f=open("filecsv.csv","w+",newline="")
csv.writer(f).writerow(["Roll","Name","Marks"])
csw=csv.writer(f)
n=int(input("Enter no.of students:"))
for i in range(n):
    roll=int(input("Enter roll:"))
    nm=input("Enter name:")
    mks=float(input("Enter marks:"))
    csw.writerow([roll,nm,mks])#one by one data entry instead of writerows() in one go.
f.seek(0)#this method is not good because it sometimes cause errors while updating/deleting data in file so you can close and reopen the file in r mode to read.
c=0
csr=csv.reader(f)
header=next(csr)#or use list() on csr object and then use slicing in for loop to iterate without header!
print(header[1],header[2],sep="\t")
for data in csr:
    if float(data[2])>75:
        print(data[1],data[2],sep="\t")
    elif float(data[2])<40:
        c+=1
print("Total no.of students with marks less than 40-",c)
f.close()