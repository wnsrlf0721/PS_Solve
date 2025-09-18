def solution(numbers):
    sum = 0
    for i in range(0,10):
        if i in numbers:
            pass
        else:
            sum += i
    return sum
        
    answer = solution(numbers)
    return answer