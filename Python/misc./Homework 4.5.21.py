def func1():
    num = input('Enter your number:')
    sum = 0
    digits = ''
    print('You entered the number', num)
    print('The digits of this number are: ')
    for i in range(len(num)):
        digits += num[i] + ', '
        sum += int(num[i])
    print('The digits of the number are: ', digits)
    print('sum = ', sum)



def dict_test():
    prices = {
        'Kitkat' : 5,
        'eggs' : 20,
        'pizza' : 20,
        'Lego' : 200,
        'cookies' : 15
    }

    shopping_cart = {
        'Kitkat' : 5,
        'eggs' : 1,
        'pizza' : 2,
        'cookies' : 1,
        'pasta' : 20

    }
    print(prices)
    for i in shopping_cart:
        if i not in prices:
            print('invalid shopping cart')
    print(prices['eggs'])        
    #print(shopping_cart[2])
    #total = sum(shopping_cart.values())


    #print(sum(prices.values()))
#func1()
dict_test()
