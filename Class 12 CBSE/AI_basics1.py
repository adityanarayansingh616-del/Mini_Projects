import numpy as np
import pandas as pd
mks1=np.array([90,92,89,81,94])
mks2=np.array([91,84,91,72,95])
mks3=np.array([97,96,88,80,99])
df=pd.DataFrame([mks1,mks2,mks3],index=["Maths","Science","Hindi"],columns=["Rajat","Amrita","Meenakshi","Rose","Karthika"])
df["Fathima"]=[89,88,88]
df.loc["English"]=[90,92,89,80,90,88]
df=df.drop("Hindi",axis=0)
df=df.drop(["Rajat","Meenakshi","Karthika"],axis=1)
print(df.iloc[0])