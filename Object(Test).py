# import for testing
from Object import VideoGame

# Sets Name
VideoGame.setname(VideoGame, "Call Of Duty")

#Returns Name (Verify it works)
print(VideoGame.getname(VideoGame))


#Set Console
VideoGame.setconsole(VideoGame , "PlayStation")

#Returns Console

print(VideoGame.getconsole(VideoGame))


#Sets Restriction

VideoGame.setrestricted(VideoGame , True)

#Returns Restriction
print(VideoGame.getrestricted(VideoGame))


#Sets Company

VideoGame.setcompany(VideoGame, "Activision")

#Returns Comapany
print(VideoGame.getcompany(VideoGame))


#Prints them out in nice style
print(VideoGame.__str__(VideoGame))