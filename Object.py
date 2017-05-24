# Name: Zohaib Ahmad

# Date : Tuesday , May 23

# Version : v0.02

# Description : Simple Object

class VideoGame(object):
    # A Videogame has a console

    # A Videogame has restricted consoles

    # A Videogame has a company

    # A Videogame has a name






    # Constructor
    def _init_(self):

        self._name = None
        self._console = None

        self._company = None
        self._restricted = None

    # Setter for name
    def setname(self, name):

        # Variables
        minimumcharacter = 5
        maximumcharacter = 25

        # If name is above or equal to min(character) and less then or eqaul to max character then set name
        if name >= minimumcharacter and name <= maximumcharacter:
            self._name = name

    # Getter for Name
    def getname(self):
        return self._name

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

        return self._console

    # Setter for company
    def setcompany(self, company):

        # Variables
        minimumcharacter = 4
        maximumcharacter = 50

        if company <= maximumcharacter and company >= minimumcharacter:
            self.company = company

    # Getter for company
    def getcompany(self):

        return self._company

    # Setter for restricted

    def setrestricted(self, restricted):

        if restricted == True:
            self._restricted = restricted

    # Getter for restricted

    def getrestricted(self):

        return self._restricted












