d={0:"zero",1:"one",2:"two",3:"three",4:"four",5:"five",6:"six",7:"seven",8:"eight",9:"nine"}
n=int(input("Enter a number:")[::-1])
while n:
   x=n%10
   print(d[x]+" ",end="")
   n//=10
