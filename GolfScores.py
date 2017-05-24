# Name: Zohaib Ahmad

# Date : Sunday , May 22

# Version : v0.01

# Description : In a round of golf, players usually play 18 holes.Write a program that

# asks the user to enter his/her score for each hole in a round of golf. Store the scores in an array and then

# output the scores.


# function to calculate max value
def maxvalue(data):
    # Sets highest to data at 0
    highest = data[0]

    # Sets length to length of data
    length = len(data)

    # While loop
    while length != 0:
        # decrease length
        length -= 1
        # If data at is greater than set value at original then convert that to the highest
        if data[length] >= highest:
            highest = data[length]
    return highest


# Function to determine average value
def averagevalue(data):
    # variables - total set to 0
    total = 0

    # sets length to length of data
    length = len(data)

    # while loop
    while length != 0:

        # decrease length
        length -= 1

        # add total with data values
        total += data[length]

        # returns average to user
        if length == 0:
            return total / len(data)


# Variables

#   Create five variables x, y , useranswer , answer ,average , max and array 'score'

x = 0
count = 0
userAnswer = ""
answer = False
max = 0
average = 0

score = []

# Intro
print("This program records the scores for a round of 18 holes of golf")

# # Score can store for up to 18 only

while count < 19 and answer is False:
    # Add one to count each time

    count = count + 1

    # Tells user to add score
    prompt = (input("Enter the score for the hole number : "))
    try:
        # Creates an array of which will store data
        score.append(float(prompt))
    except ValueError:
        print('Please input a valid number')

    # #Ask user if they wish to continue or not
    userAnswer = (input('Do you wish to continue yes or  no : '))

    if userAnswer.lower() == "no":

        # Prints out the max
        print("The max value is : ")

        # Calls function of which will return max value
        max = maxvalue(score)

        print(max)

        # prints out the average values
        print("The average value is  : ")

        # Calls function of which will return average value
        average = averagevalue(score)

        print(average)

        # Used to exit for loop once its done
        break

    elif userAnswer.lower() == "yes":

        # Prints out the max
        print("The max value is : ")

        # Calls function of which will return max value
        max = maxvalue(score)

        print(max)

        # prints out the average values
        print("The average value is  : ")

        # Calls function of which will return average value
        average = averagevalue(score)

        print(average)

else:

    print('Invalid choice')



