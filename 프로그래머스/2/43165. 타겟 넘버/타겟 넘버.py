def solution(numbers, target):
    #BFS
    answer = 0
    progress=[0]
    for number in numbers: # [1,1,1,1,1]
        value_count=[] # 빈 배열에 progress[num] +number , -number 결과값을 계산
        for value in progress: #[0], 1추가 -> [1,-1] / [1,-1], 1추가 -> [2,0,0,-2] ...
            value_count.append(value+number)
            value_count.append(value-number)
        progress=value_count
    for result in progress:
        if result == target:
            answer+=1
    return answer