while True:
    num=input()
    if num=='0':
        break
    if num==num[::-1]:
        print('yes')
    elif num!=num[::-1]:
        print('no')