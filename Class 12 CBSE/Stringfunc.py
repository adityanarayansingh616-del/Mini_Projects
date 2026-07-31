def RevText(sen):
    word="";sen=sen.strip()
    for ch in (sen+" "):
        if ch.isspace():
            if word[0] in "Ii":
                print(word[::-1]+" ",end="")
            else:
                print(word.lower()+" ",end=str())
            word=""
        else:
            word+=ch
RevText("INDIA IS MY COUNTRY")