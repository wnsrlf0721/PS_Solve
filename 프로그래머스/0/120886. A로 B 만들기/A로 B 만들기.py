def solution(before, after):
    result = 1
    for comp in before:
        if before.count(comp) != after.count(comp):
            result = 0
            break;
    return result