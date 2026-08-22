#To write 5 lines to a file and print lines with 4 or more words.
f=open("File","w+")
def addlines():
     l=list()
     print("Enter 5 lines:")
     for i in range(5):
         line=input()+"\n"
         l.append(line)
     f.writelines(l)
def func():
      f.seek(0)
      lines=f.readlines()
      for line in lines:
          if len(line.split())>=4:
              print(line,end=str())
addlines()
func()
f.close()