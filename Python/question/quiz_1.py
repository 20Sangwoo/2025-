# 문제) 단수를 입력 받아 구구단을 출력하는 프로그램 구현
#       그리고 단수 입력을 0 입력하면 프로그램을 종료
#       구구단 출력은 함수로 작성

def print_gugudan(dansu):
    for i in range(1, 10):
        result = dansu * i
        print(f'{dansu} * {i} = {result}')

def main():
    while True:
        dansu = int(input('단수 입력 (종료 : 0) : '))
        if dansu == 0:
            print("프로그램 종료")
            break 
        print_gugudan(dansu)


main()