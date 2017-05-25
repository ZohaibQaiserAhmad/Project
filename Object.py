# Name: Zohaib Ahmad

# Date : Tuesday , May 23

# Version : v0.02

# Description : Simple Object

class VideoGame:
    # Constructor
    def __init__(self, name, console, company, restricted):
        
        self.restricted = restricted
        self.company = company
        self.console = console
        self.name = name

    # Setter for name


    def setname(self, name):
    # Variables
        minimumcharacter = 5
        maximumcharacter = 25

    # If name is above or equal to min(character) and less then or eqaul to max character then set name
        if len(name) >= minimumcharacter and len(name) <= maximumcharacter:
            self.name = name

        # Getter for Name


    def getname(self):
        return self.name


# Setter for console
    def setconsole(self, console):
    # Variables
        hascompany = True
        hasname = True

        hascost = True
        hasdatereleased = True

        if hascompany == True and hasname == True and hascost == True and hasdatereleased == True:
            self.console = console


# Getter for console

    def getconsole(self):
        return self.console


# Setter for company
    def setcompany(self, company):
    # Variables
        minimum = 4
        maximum = 50

        if len(company) >= minimum and len(company) <= maximum:
            self.company = company


# Getter for company
    def getcompany(self):
        return self.company


# Setter for restricted
    def setrestricted(self, restricted):
        if restricted:
            self.restricted = restricted


# Getter for restricted

    def getrestricted(self):
        return self.restricted


# Method to convert to string
    def __str__(self):

        return "Name : {} , Company : {} , Console : {}, Restriction: {}".format(self.name, self.company, self.console, self.restricted)



if __name__ == "__main__":


#Shows Call of duty
    print(callofduty)
