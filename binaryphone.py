import pickle
n=int(input("Enter no. of data:"))
f=open(r"C:\Users\adity\OneDrive\Documents\PhoneList.dat","ab")
for i in range(n):
    ID=int(input("Enter ID:"))
    Name=input("Enter name:")
    Mob=int(input("Enter mobile no:"))
    pickle.dump([ID,Name,Mob],f)
f.close()
def Search(no):
    f=open(r"C:\Users\adity\OneDrive\Documents\PhoneList.dat","rb")
    while True:
        try:
            data=pickle.load(f)
            if data[2]==no:
                print(data[1])
        except EOFError:
            break
    f.close()
Search(int(input("Enter Mobile No. to be searched:")))