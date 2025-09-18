def solution(i, j, k):
    answer = sum(list(str(idx).count(str(k)) for idx in range(i,j+1)))
    
    return answer