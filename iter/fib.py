import time
import sys
sys.setrecursionlimit(15000)
def fib1(num):
	start = time.time()
	res = iter_fib(1, 0, num)
	end = time.time()
	print(end-start, res)

def iter_fib(a, b, num):
 	if num ==0:
 		return b
 	return iter_fib(a+b, a, num-1)


def fib2(num):
	start = time.time()
	res = fib_recur(num)
	end = time.time()
	print(end-start, res)



def fib_recur(num):
	if num == 0:
		return 0
	if num == 1:
		return 1
	return fib_recur(num-1)+fib_recur(num-2)
def main():
	target = 8000
	fib1(target)
	

if __name__ == '__main__':
	main()