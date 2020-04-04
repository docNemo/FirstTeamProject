import spaces

if __name__ == "__main__":
	stringForCleaning = input()
	stringForCleaning = spaces.strip(stringForCleaning)
	stringForCleaning = spaces.wordreplay(stringForCleaning)
	print(stringForCleaning)
