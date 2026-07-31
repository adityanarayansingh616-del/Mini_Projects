def countEU(s):
    words=s.split()
    for word in words:
        if ("E" in word or "e" in word) and ("U" in word or "u" in word):
            print(word)
    print("E:",s.count("E")+s.count("e"),"\nU:",s.count("U")+s.count("u"),sep=str())
countEU(input("Enter a sentence:"))