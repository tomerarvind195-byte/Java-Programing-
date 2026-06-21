f = open("test.txt", 'w')
f.write('you are good\n')
f.write('you are smart\n')
f.close()

f = open("test.txt", 'r')
print(f.readline())
print(f.readline())
f.close()