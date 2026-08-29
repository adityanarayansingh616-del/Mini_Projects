#To print words from a file that contain no vowels.
def wordnv():
    with open("File.txt","r") as f:
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
