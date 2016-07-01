def printPrimeNumber(n):
    for i in range(2, n+1):
        isPrimeNum = True
        for j in range(2, i):
            if i%j == 0:
                isPrimeNum = False
                break;
        if isPrimeNum:
            print i

