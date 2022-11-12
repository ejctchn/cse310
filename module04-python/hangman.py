import random
import string

wordsList = 'ant baboon badger bat bear beaver camel cat clam cobra cougar \
        coyote crow deer dog donkey duck eagle ferret fox frog goat goose hawk \
        lion lizard llama mole monkey moose mouse mule newt otter owl panda \
        parrot pigeon python rabbit ram rat raven rhino salmon seal shark sheep \
        skunk sloth snake spider stork swan tiger toad trout turkey turtle \
        weasel whale wolf wombat zebra'.split()
def getRandomWord(wordsList):
    index = random.randint(0, len(wordsList) - 1)
    return wordsList[index]

#boolean for game loop
play = True

#there are 7 pictures or chances
hangman_pics = ['''
    +---+
        |
        |
        |
       ===''', '''
    +---+
    O   |
        |
        |
       ===''', '''
    +---+
    O   |
    |   |
        |
       ===''', '''
    +---+
    O   |
   /|   |
        |
       ===''', '''
    +---+
    O   |
   /|\  |
        |
       ===''', '''
    +---+
    O   |
   /|\  |
   /    |
       ===''', '''
    +---+
    O   |
   /|\  |
   / \  |
       ===''']

#displays the current hangman board
def displayBoard(errors):
    if errors == 0:
        print(hangman_pics[0])
    elif errors == 1:
        print(hangman_pics[1])
    elif errors == 2:
        print(hangman_pics[2])
    elif errors == 3:
        print(hangman_pics[3])
    elif errors == 4:
        print(hangman_pics[4])
    elif errors == 5:
        print(hangman_pics[5])
    elif errors == 6:
        print(hangman_pics[6])
    elif errors == 7:
        print(hangman_pics[7])
    else:
        print("")

#displays dashes/letters
def displayBlanks(blanks):
    
    print(*blanks, sep = ' ')
    return blanks   

#take in input from user
def computeGuess(lettersUsed, lettersWrong):
    check = True
    while(check):
        guess = input("Enter a guess: ").lower()

        if len(guess) != 1:
            print('Please enter a single letter.')
        elif guess in lettersUsed:
                print('You have already guessed that letter. Choose again.')
        elif guess not in alphabet:
                print('Please enter a LETTER.')
        else:
            check = False
            return guess

#Would you like to play again?
def playAgain():
    print()
    print(f"Good game. The word was {word}! Do you want to play again (y/n)?")
    print()
    return input().lower().startswith('y' or 'Y')

#TIME TO PLAY
while(play):
    alphabet = list(string.ascii_lowercase)
    lettersUsed = ""
    lettersWrong = ""
    errors = 0
    word = getRandomWord(wordsList)
    blanks = [" _ "] * len(word)
    #Always welcome your guests
    print()
    print("Welcome to hangman")
    print("A word has been chosen for you.")
    print("You may begin.")
    print()

    while(errors < 6): 
        i = 0   
        #show all of the details of the game and word
        displayBoard(errors)
        displayBlanks(blanks)
        print()
        #print(f"Letters available: {lettersAvailable}")
        print(f"Letters used: {lettersUsed}")
        print(f"Incorrect letters: {lettersWrong}")

        guess = computeGuess(lettersUsed, lettersWrong)
        if guess in word:
            lettersUsed += guess
        else:
            lettersWrong += guess
            errors += 1

        #iterate through word to find letters
        for x in word:
            if word[i] == guess.strip():
                blanks[i] = guess.strip()
                i += 1
            else:
                i += 1
        if len(lettersUsed) == len(word):
            #a condition to kick out the loop
            errors = 10
        else:
            pass

    displayBlanks(blanks)
    displayBoard(errors)
    
    play = playAgain()
    
print()
print("Thanks for playing!")