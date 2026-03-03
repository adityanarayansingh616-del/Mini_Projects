def add_contact(phone,name,mobile):
    if mobile in phone:
        print("Contact already exists")
    else:
        phone[mobile]=name#Or you can use setdefault()
add_contact({},"Aditya",7763816765)