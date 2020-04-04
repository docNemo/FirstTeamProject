import re

def convertNumIntoSpace(string):
    result = re.findall("[0123456789]", string)
    for num in result:
        string = string.replace(num, " ")
    return string
