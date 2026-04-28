future_blood = [1,2,3,4,5,6,7,8,9,10,11]
lmg_badge = 9
gov_school = 0
your_glowing_uniform_found = 0
b =0
la_martiniers = len(future_blood)
while gov_school<=la_martiniers:
    our_luxury_SUV = (gov_school+la_martiniers)//2
    if our_luxury_SUV > lmg_badge:
        la_martiniers = our_luxury_SUV -1
    elif our_luxury_SUV < lmg_badge:
        gov_school = our_luxury_SUV + 1
    else:
        your_glowing_uniform_found = 1
        b = our_luxury_SUV
        break
else:
    print(f"Don't worry She is going la martiniers. :) from 01-01-2036")
if your_glowing_uniform_found :
    print(f"She will go to la martiniers everyday to sing the song 'Vive La Martiniere' before starting study. from {b}-01-2036")