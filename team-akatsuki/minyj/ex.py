#inpo = 'a,1,b,2,c,3,a,1,b,2,c,3'

#inpo2 = inpo.split(',')

#data = []
#data2 = []
#print(inpo2)
#for a in range(len(inpo2)):
#    sub_list = []
#    if a % 2 == 1:
#        sub_list.append(inpo2[a-1])
#        sub_list.append(int(inpo2[a]))
#        data.append(sub_list)
#    print(sub_list)

#print(data)

# 1번 부터 14번까지 원리는 대충 이해 어디서 무엇이 쓰이는지는 알겠는데
# 안보고 쓰기가 어려움 좀 더 익혀 봐야할듯


#for a in range(len(data)):
#    is_dupl = False
#    no_dupl = None
#    for j in range(len(data2)):
#        if data2[j][0] == data[a][0]:
#            is_dupl = True
#            no_dupl = j
#    if is_dupl:
#        sum = data[a][1] + data2[no_dupl][1]
#        data2[no_dupl][1] = sum
#    else:
#        data2.append(data[a])

#print(data2)

# 22번 부터 33번까지는 전혀 이해 안됌 is_dupl,no_dupl 의 역활을 이해해야할듯