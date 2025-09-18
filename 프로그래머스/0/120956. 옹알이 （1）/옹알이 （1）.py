def solution(babbling):
    babble_list = ["aya","ye","woo","ma"]
    answer = 0
    for babble in babbling:
        babble_len = len(babble)
        comp = sum(len(idx) for idx in babble_list if idx in babble)
        if babble_len == comp:
            answer+= 1
    return answer