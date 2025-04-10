# 문제) 과목 수를 입력 받고 과목 수 만큼 점수를 받아 합계와 평균울 구하는 프로그램

def score(sub):
    scores = []
    sum = 0
    for i in range(sub):
        score = int(input(f"{i+1}번째 점수 입력: "))
        scores.append(score) 
        sum += score 
    
    avg = sum / sub 
    print(f'합계 : {sum}')
    print(f'평균 : {avg:.2f}') 

def main():
    while True:
        sub = int(input("과목 수 입력 (종료하려면 0 입력) : "))
        if sub == 0:
            print("프로그램 종료")
            break
        score(sub)

main()
