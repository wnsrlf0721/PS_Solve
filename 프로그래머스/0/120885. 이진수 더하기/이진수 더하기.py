def solution(bin1, bin2):
    result = str(int(bin1)+int(bin2))
    
    result_list = []
    for i in range(len(result)):
        result_list.append(int(result[-1-i]))

    for i in range(len(result_list)-1):
        if result_list[i] > 1:
            result_list[i]-=2
            result_list[i+1]+=1
    if result_list[-1] > 1:
        result_list[-1]-=2
        result_list.append(1)
    result_list.reverse()
    answer = ''.join(str(idx) for idx in result_list)
    return answer