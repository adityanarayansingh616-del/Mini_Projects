def LenWords(string):
    words=string.split()
    lengths=list()
    for word in words:
        lengths.append(len(word))
    lengths=tuple(lengths)
    return lengths
print(LenWords(input("Enter a sentence:")))