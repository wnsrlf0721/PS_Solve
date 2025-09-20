def solution(arr):
    answer = 1
    for x in range(len(arr)):
        for y in range(x+1,len(arr[x])):
            if arr[x][y] != arr[y][x]:
                answer = 0
                break
            
    
    return answer