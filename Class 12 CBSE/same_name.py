#To build a student dictionary and find registration numbers by name (case-insensitive).
def same_name(student,nm):
    for regno in student:
        name=student[regno]
        if name.lower()==nm:
            print(regno)
d={}
while True:
    reg=int(input("Enter Registration no.:"))
    nam=input("Enter name:")
    d[reg]=nam
    c=input("More inputs?")
    if c.lower()=='no':
        break
nm=input("Enter a name to be searched:").lower()
same_name(d,nm)