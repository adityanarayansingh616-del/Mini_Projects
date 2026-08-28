import pandas as pd
listdict=[{"Dance":1,"Music":2},{"Dance":2,"Music":3,"Painting":1},{"Painting":2}]
df=pd.DataFrame(listdict,index=["X","XI","XII"])
print(df)