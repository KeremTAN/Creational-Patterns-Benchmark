import pandas as pd
import numpy as np
import seaborn as sbn
import matplotlib.pyplot as plt

index=pd.Index(range(0,100,1))

d1 = pd.read_csv("Builder.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"]).set_index(index)
d1=d1[:100]
d12=d1[:20]

d2 = pd.read_csv("Abstract_Factory.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"]).set_index(index)
d2=d2[:100]
d22=d2[:20]

d3 = pd.read_csv("Simple_Factory.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"]).set_index(index)
d3=d3[:100]
d32=d3[:20]

d4 = pd.read_csv("Prototype.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"]).set_index(index)
d4=d4[:100]
d42=d4[:20]

d5 = pd.read_csv("NonePattern.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"]).set_index(index)
d5=d5[:100]
d52=d5[:20]

d1.tail()
Total = d1['Time'].sum()
print ("Mean of Builder: ")
print(Total/100)

Total = d2['Time'].sum()
print ("Mean of Abstract_Factory: ")
print(Total/100)

Total = d3['Time'].sum()
print ("Mean of Simple_Factory: ")
print(Total/100)

Total = d4['Time'].sum()
print ("Mean of Prototype: ")
print(Total/100)

Total = d5['Time'].sum()
print ("Mean of NonePattern: ")
print(Total/100)

d12['Time'].plot(figsize=(30,10),fontsize=10)
d22['Time'].plot(figsize=(30,10),fontsize=10)
d32['Time'].plot(figsize=(30,10),fontsize=10)
d42['Time'].plot(figsize=(30,10),fontsize=10)
d52['Time'].plot(figsize=(30,10),fontsize=10)

plt.legend(['Builder','Abstract_Factory','Simple_Factory','Prototype','NonePattern'],fontsize=10,loc ="upper right")

bars=index
y_pos=np.arange(len(bars))
#

plt.xlabel('Object number',fontsize=20)
plt.ylabel('Passing time for creation',fontsize=20)

fig=plt.gcf()
fig.set_size_inches(16,6)
plt.savefig("All_patterns.png",dpi=300)
plt.show()

# ----

d12['Time'].plot(figsize=(30,10),fontsize=10)
d52['Time'].plot(figsize=(30,10),fontsize=10)
plt.legend(['Builder','NonePattern'],fontsize=10,loc ="upper right")

bars=index
y_pos=np.arange(len(bars))
#

plt.xlabel('Object number',fontsize=20)
plt.ylabel('Passing time for creation',fontsize=20)

fig=plt.gcf()
fig.set_size_inches(16,6)
plt.savefig("Builder-nonepattern.png",dpi=300)
plt.show()

# ----

d22['Time'].plot(figsize=(30,10),fontsize=10)
d52['Time'].plot(figsize=(30,10),fontsize=10)
plt.legend(['Abstract_Factory','NonePattern'],fontsize=10,loc ="upper right")

bars=index
y_pos=np.arange(len(bars))
#

plt.xlabel('Object number',fontsize=20)
plt.ylabel('Passing time for creation',fontsize=20)

fig=plt.gcf()
fig.set_size_inches(16,6)
plt.savefig("AbstractFactory-nonepattern.png",dpi=300)
plt.show()

# ----

d32['Time'].plot(figsize=(30,10),fontsize=10)
d52['Time'].plot(figsize=(30,10),fontsize=10)
plt.legend(['Simple_Factory','NonePattern'],fontsize=10,loc ="upper right")

bars=index
y_pos=np.arange(len(bars))
#

plt.xlabel('Object number',fontsize=20)
plt.ylabel('Passing time for creation',fontsize=20)

fig=plt.gcf()
fig.set_size_inches(16,6)
plt.savefig("SimpleFactory-nonepattern.png",dpi=300)
plt.show()

# ----

d42['Time'].plot(figsize=(30,10),fontsize=10)
d52['Time'].plot(figsize=(30,10),fontsize=10)
plt.legend(['Prototype','NonePattern'],fontsize=10,loc ="upper right")

bars=index
y_pos=np.arange(len(bars))
#

plt.xlabel('Object number',fontsize=20)
plt.ylabel('Passing time for creation',fontsize=20)

fig=plt.gcf()
fig.set_size_inches(16,6)
plt.savefig("Prototype-nonepattern.png",dpi=300)
plt.show()
