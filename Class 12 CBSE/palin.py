def palin(s1,s2):
    if s1.lower()==s2[::-1].lower():
        print("Palindrome.")
    else:
        print("No.")
palin(input("Enter a string:"),input("Enter another:"))