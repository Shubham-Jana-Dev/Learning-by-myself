"""
Problem #50: The "Input" Validator
​Create a program that takes an input string.
​If the string contains the word "Active" or "valid," print "System Clean."
​If it contains "Error" or "Blocked" print "Access Denied: Re-routing to Library Server."
"""
def input_Validator():
    x = input("Enter the Situation: ")
    if "Active" in x or "Aalid" in x:
        print("System Clean. Operations running smoothly. :)")
    elif "Error" in x or  "Blocked" in x:
        print("Access Denied: Re-routing to Library Server. :(")
    else:
        print("Neutral State please provide a standard command like (\"Active\" or \"valid\" or \"Error\" or \"Blocked\").")
        input_Validator()
#input_Validator()
"""
Challenge #51: The "Firewall" Filter
​The Goal: Write a program that takes a list of various strings and creates two new lists: one for Authorized Inputs and one for Blocked Threats.
​Technical Requirements:
​Create a list called incoming_data containing at least 6 strings (e.g., "apple", "logic", "dirty", "coding", "doll", "university").
​Create two empty lists: authorized_list and blocked_list.
​Use a for loop to iterate through incoming_data.
​Logic: * If the word is "dirty" or "doll", append it to the blocked_list.
​Otherwise, append it to the authorized_list.
​Print the final counts of each list.
​Why this matters right now:
"""
def Firewall_filter():
    input_list = ["apple","logic","dirty","coding","doll","university"]
    blocked_list = []
    authorized_list = []
    for i in input_list:
        if i == "dirty" or i == "doll":
            blocked_list.append(i)
        else:
            authorized_list.append(i)
    print(blocked_list)
    print(authorized_list)
# Firewall_filter()
def Firewall_filter():
    input_list = ["apple","logic","dirty","coding","doll","university"]
    blocked_list = [i for i in input_list if i == "doll" or i == "dirty" ]
    authorized_list = [i for i in input_list if i != "doll" and i != "dirty"]
    print(blocked_list)
    print(authorized_list)
Firewall_filter()