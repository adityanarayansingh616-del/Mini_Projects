#To write and read a dictionary from a binary file using pickle.
import pickle
f=open("filebinary","wb+")
d={"Name":"Aditya","Marks":95}
pickle.dump(d,f)
f.seek(0)
print(pickle.load(f))
f.close()