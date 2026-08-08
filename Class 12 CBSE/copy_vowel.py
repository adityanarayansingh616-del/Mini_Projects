#To copy words that start and end with a vowel into a new list.
def CopyVowel(S):
    Copied=[];v="AEIOUaeiou"
    for i in S:
        if i[0] in v and i[-1] in v:
            Copied.append(i)
    print(Copied)
CopyVowel(["You", 'Au',"ice","go"])