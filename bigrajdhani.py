def bigrajdhani(country):
    BigRajdhani=list()
    for state in country:
        if len(state)>6 and len(str(country[state][1]))>=6:
            BigRajdhani.append(country[state][0])
    print(BigRajdhani)
n=int(input("Enter no. of entries:"));country=dict()
for i in range(n):
    state=input("Enter state name:")
    capital=input("Enter its capital:")
    population=int(input("Enter its population:"))
    country[state]=[capital,population]
bigrajdhani(country)