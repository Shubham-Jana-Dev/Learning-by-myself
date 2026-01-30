"""
Problem #50: The "Input" Validator
​Create a program that takes an input string.
​If the string contains the word "Active" or "valid," print "System Clean."
​If it contains "Error" or "Blocked" print "Access Denied: Re-routing to Library Server."
"""
def input_Validator():
    x = input("Enter the Situation: ")
    if x == "Active" or x == "Aalid":
        print("System Clean. Operations running smoothly. :)")
    elif x == "Error" or x == "Blocked":
        print("Access Denied: Re-routing to Library Server. :(")
    else:
        print("Neutral State please provide a standard command like (\"Active\" or \"valid\" or \"Error\" or \"Blocked\").")
        input_Validator()
input_Validator()