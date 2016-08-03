import time
import sys
import random
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
def expmod(base, exp, m):
	if exp == 0:
		return 1
	elif (exp%2==0):
		test = expmod(base, int(exp/2), m)
		return (test*test)%m
	else:
		res = expmod(base, exp-1, m)
		return (base*res)%m
def isRight(num):
	def try_it(a):
		return expmod(a, num, num) == a
	data = random.randint(1, num-1)
	return try_it(data+1)



if __name__ == '__main__':
	num = int(input("input number: "))
	nums = []
	def find(num):
		for i in range(2,num):
			if not isRight(i):
				nums.append(i)
	find(num)
	print(nums)