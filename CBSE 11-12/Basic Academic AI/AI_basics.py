import numpy as np
import pandas as pd
ar1=np.array([1,2,3])
ar2=np.array([10,20,30])
ar3=np.array([100,200,300])
df=pd.DataFrame([ar1,ar2,ar3],columns=["Aditya","Yoyo","Jojo"],index=[1,2,3])
df.to_csv(path_or_buf=r"C:\Users\adity\OneDrive\Documents\DF.csv",sep=",")
print(df)