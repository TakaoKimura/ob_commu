def printPrimeNumber(n):
    for i in range(2, n+1):
        if isPrimeNum(i):
            print i

def isPrimeNum(i):
    for j in range(2, i):
            if i%j == 0:
                return False
    return True


