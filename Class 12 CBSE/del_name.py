#To identify names not starting with a vowel and having length <=5 for deletion.
def Del_Name(names):
    for i in names:
        if i[0] not in "AEIOUaeiou" and len(i)<=5:
            print("Deleting-",i,sep=str())
Del_Name(["Saksham","Rick","Ansh","Harsha","harsh"])