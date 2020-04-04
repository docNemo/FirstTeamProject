import re

def strip(strForStrip):
    return strForStrip.strip()

def wordreplay (cleanStr):
    return re.sub(r'\b([^\W\d_]+)(\s+\1)+\b', r'\1', re.sub(r'\W+', ' ', cleanStr), flags=re.I)
