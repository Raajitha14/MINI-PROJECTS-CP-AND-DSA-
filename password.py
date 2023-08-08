import random
import string
print("Welcome to password generator")
letters_len=int(input("How many letters do you want in your password:"))
numbers_len=int(input("How many numbers do you want in your password:"))
symbols_len=int(input("How many symbols do you want in your password:"))

letters=string.ascii_letters
numbers=string.digits
symbols=string.punctuation

# Generate password components based on user input
letter_choices = random.choices(letters, k=letters_len)
number_choices = random.choices(numbers, k=numbers_len)
symbol_choices = random.choices(symbols, k=symbols_len)

# Combine the password components
pwd = letter_choices + number_choices + symbol_choices
random.shuffle(pwd)# Shuffle the password to increase randomness
password="".join(pwd)# Join the shuffled components to create the final password
print("This is your password as per your requirement:",password)




