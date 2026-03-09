number1 = int(input("Enter your first number: "))
number2 = int(input("Enter your second number: "))

try:
    solution = number1/number2
    print(number1, "divided by", number2, "=", solution)
except ValueError:
    print("Only integers and floats please")
except ZeroDivisionError:
    print("You can't divide by zero nore divide any number with 0")