if True:
    print('참')

# 숫자가 0이면 False로 간주,
# 숫자가 0이 아니면 True로 간주
if 1:
    print('참')
if not 0:
    print('거짓')

# 빈 문자열은 False로 간주, 내용이 있으면 True로 간주
if "":
    print('False')
if " " or "abc" :
    print('True')

#  iterable 객체에 요소가 없으면 False, 있으면 True
if [] or () or {}:
    print('False')
if [1, 2, 3] or (1, 2, 3) or {1, 2, 3} or { 'name' : '홍길동', 'age' : 20}:
    print('True')
    