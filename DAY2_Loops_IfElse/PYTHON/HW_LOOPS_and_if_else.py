# SUM OF 10 NUMBERS

Start = int(input("Enter a Value for Start: "))
Sum = 0
for i in range(Start, Start + 11, 1):
    Sum += i
print("Sum of numbers from", Start, "to", Start + 10, ":", Sum)
# ---------------------------

# SUM OF 1ST 10 EVNN NUMBERS
Sum = 0
for i in range(2,21,2):
    Sum = Sum+i
print("Sum of 1st 10 even numbers are",Sum)

# This also can be done in the below method
Sum1=0
for i in range(1,21,1):
    if i%2==0:
        Sum1 = Sum1+i
print("Sum of the same by using if else Sum is =",Sum1)

# -----------------------------------

# SUM OF EVEN NUMBERS BTN 20 TO 40(including both)
Sum2 = 0
for i in range(20,41,2):
    Sum2+=i
print("Sum of even ones btn 20 to 40 is=",Sum2)
# This also can be done in the below method
Sum3 =0
for i in range(20, 41,1):
    if i%2==0:
        Sum3+=i
print("The same by using if else the sum of even btn 20 to 40",Sum3)