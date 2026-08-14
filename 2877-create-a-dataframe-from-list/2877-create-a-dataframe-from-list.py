import pandas as pd

def createDataframe(student_data: List[List[int]]) -> pd.DataFrame:
    the_disctionary = {}
    student_id = []
    age = []
    for i in student_data:
        student_id.append(i[0])
    for j in student_data:
        age.append(j[1])
    the_disctionary={
        "student_id" : student_id,
        "age": age
    }
    df = pd.DataFrame(the_disctionary)
    return df
