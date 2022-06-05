import pandas as pd
import numpy as np
import seaborn as sbn
import matplotlib.pyplot as plt

d1 = pd.read_csv("Builder.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"])

d2 = pd.read_csv("Abstract_Factory.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"])

d3 = pd.read_csv("Simple_Factory.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"])

d4 = pd.read_csv("Prototype.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"])

d5 = pd.read_csv("NonePattern.csv", encoding='utf-8', sep=',', header=None, names=["Pattern", "Time"])

Total1=d1['Time'].sum()

Total2 = d2['Time'].sum()

Total3 = d3['Time'].sum()

Total4 = d4['Time'].sum()

Total5 = d5['Time'].sum()

X = ['Builder','Abstract_Factory','Simple_Factory','Prototype']
Times = [Total1,Total2,Total3,Total4]
NonePattern = [Total5]
plt.figure(figsize=(10,6))
X_axis = np.arange(len(X))

plt.bar(X_axis - 0.2, Times, 0.4, label = 'Valid Pattern')
plt.bar(X_axis + 0.2, NonePattern, 0.4, label = 'None Pattern')

plt.xticks(X_axis, X)
plt.xlabel("Comparison of Patterns")
plt.ylabel("1.000.000 Objects Production Time")
plt.title("")
plt.legend()
plt.savefig("!!_ALLLLLLL_!!.png",dpi=300)
plt.show()
