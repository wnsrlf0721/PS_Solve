count=[1,1,2,2,2,8]
ex_input=list(map(int,input().split()))
for i in range(6):
    count[i]-=ex_input[i]
    print(count[i],end=" ")
print("")