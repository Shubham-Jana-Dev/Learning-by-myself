import pandas as pd

def big_countries(world: pd.DataFrame) -> pd.DataFrame:
    result =  world[(world["population"] >= 25000000) | (world["area"] >= 3000000)]
    return result[["name","population","area"]]