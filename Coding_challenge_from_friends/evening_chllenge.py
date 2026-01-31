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
# Firewall_filter()
"""
Challenge #52: The "Sanitizer" Function
​Since you are in the library and your "Processor" is running at peak efficiency, let's try a challenge that reflects your current environment.
​The Scenario: You are scanning a messy text file. You want to extract only the words that are "Safe" and convert them to UPPERCASE to emphasize your "AA-Grade" strength.
​The Challenge:
​Take your authorized_list from the previous code.
​Use a List Comprehension to create a new list called sanitized_output.
​Inside the comprehension, apply a string method to make every word uppercase (e.g., "APPLE", "LOGIC").
​Bonus Logic: Only include the word if its length is greater than 5 characters.
"""
def Sanitizer_list():
    My_list = ["apple","logic","dirty","coding","doll","university"]
    authorized_list = [i.upper() for i in My_list if (i != "doll" and i != "dirty") and 5 < len(i) ]
    print(authorized_list)
# Sanitizer_list()
"""
The Challenge:
​Create a list: logs = ["Success", "Success", "Warning", "Success", "Critical_Error", "Warning", "Success"]
​Use the .count() method to find how many "Success" logs there are.
​Advanced Logic: Create a Dictionary called system_report where the keys are the log types and the values are their counts.
"""
def count_string():
    logs = ["Success", "Success", "Warning", "Success", "Critical_Error", "Warning", "Success"]
    system_report  = {i:logs.count(i) for i in set(logs) if i == "Success" }
    print(system_report)
# count_string()
"""
Challenge #54: The "Final Security Audit"
​Let's combine everything. This is the last challenge for the library session.
​The Task:
​Create a dictionary called user_permissions.
​Keys: "Shubham", "Mamma", "Neha".
​Values: Give yourself "Admin", and give the others "Guest".
​Write a function that takes a name as input.
​If the name is "Shubham", print "Access Granted: Apple Scent Detected."
​If the name is anyone else, print "Access Denied: Restricted Zone."
"""
def Access():
    user_permissions = {"Shubham","Mamma","Neha"}
    Admin = {i for i in user_permissions if i == "Shubham"}
    Guest = {i for i in user_permissions if i not in Admin}
    User = input("Enter your Identity: ")
    if User in Admin:
        print("Access Granted: Apple Scent Detected.")
    else:
        print("Access Denied: Restricted Zone.")
Access()
def Access():
    # Dictionary with Key-Value pairs
    user_permissions = {
        "Shubham": "Admin",
        "Mamma": "Guest",
        "Neha": "Guest"
    }
    
    user = input("Enter your Identity: ")
    
    # Logic: Check the value associated with the key
    if user_permissions.get(user) == "Admin":
        print(f"Welcome {user}! Access Granted: Apple Scent Detected.")
    else:
        print("Access Denied: Restricted Zone.")