'''
The Problem: "The Unique Squared Intersection"

Take two lists of numbers (make one have some negatives).

Filter: Keep only the positive numbers from both.

Transform: Square every number.

Set Logic: Find the Symmetric Difference (the ^ operator we discussed!) between the two sets of squared numbers.

Bonus: Do this in as few lines as possible (Use List/Set Comprehension).
'''
la_Martiniers = [80,97,98,76,98,100,78]
gov_school = [-12,9,8,18,-5,7,29,2,-10]
a_little_light_of_future = [i for i in gov_school if i>0 ]
print(a_little_light_of_future)
a_little_light_form_your_badge_of_la_Martiniers_on_your_collar = [i**2 for i in a_little_light_of_future ]
print(a_little_light_form_your_badge_of_la_Martiniers_on_your_collar)
a_little_light_form_your_beautiful_white_uniform_of_la_Martiniers = [i**2 for i in la_Martiniers]
print(a_little_light_form_your_beautiful_white_uniform_of_la_Martiniers)
me_waiting_for_you_outside_LMG_in_our_luxury_blue_SUV = set(a_little_light_form_your_badge_of_la_Martiniers_on_your_collar) ^ set(a_little_light_form_your_beautiful_white_uniform_of_la_Martiniers)
print(me_waiting_for_you_outside_LMG_in_our_luxury_blue_SUV)