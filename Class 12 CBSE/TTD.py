print("Enter three sides of a triangle:")
s1 = float(input())
s2 = float(input())
s3 = float(input())
if s1 + s2 > s3:
    if s1 == s2 == s3:
        print("Equilateral.")
    elif s1 == s2 or s1 == s3 or s2 == s3:
        print("Isosceles.")
    elif s1 ** 2 + s2 ** 2 == s3 ** 2 or s1 ** 2 + s3 ** 2 == s2 ** 2 or s2 ** 2 + s3 ** 2 == s1 ** 2:
        print("Right Angled.")
    else:
        print("Scalene.")
else:
    print("Invalid Triangle.")
