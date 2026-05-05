def wordnv():
    with open("File","r") as f:
        words=f.read().split()
        for word in words:
            check=True
            for char in word:
                if char in "AEIOUaeiou":
                    check=False
                    break
            if check:
                print(word)
wordnv()
