# Given an integer n. Your task is to calculate the sum of all
# natural numbers from 1 up to n (inclusive). If n is 0, the sum
# should be 0.

def function_factorial(n):
    if n == 0:
        return 0
    s = n * (n + 1)
    sum = s / 2  # difference between / and // is that / returns a float and // returns an nearest integer
    return int(sum) # return the sum as an integer

# test the function
n = 10
print("sum of 1 to", n, "is:", function_factorial(n))

# In Python, a function is defined using the def keyword.
# The function name is followed by parentheses () and a colon :.
# It can accept parameters (arguments) inside the parentheses.
# It returns a value using the return statement (or returns None by default).
# It can be called by its name followed by parentheses (), multiple times.
# It can be defined at the module level or nested inside functions/classes, adhering to standard scoping rules.
# It must be defined before it is called during execution, as Python evaluates code sequentially.