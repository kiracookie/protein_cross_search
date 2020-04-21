import re


with open('activity.txt','r') as f:
    data=f.read()
with open("test.txt","w") as f:
    data=data.replace(".txt ",",")
    f.write(re.sub(r'\s*\|\s*',',',data))
