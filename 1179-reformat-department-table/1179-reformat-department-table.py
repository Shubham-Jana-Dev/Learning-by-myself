import pandas as pd

def reformat_table(department: pd.DataFrame) -> pd.DataFrame:
    df = department.pivot(index="id",columns="month",values="revenue")
    all_months = ["Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"]
    df = df.reindex(columns=all_months)
    df.columns = [f"{col}_Revenue" for col in df.columns]
    return df.reset_index()