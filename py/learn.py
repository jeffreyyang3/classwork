import pandas



def string_times(string, n):
	str = ""
	for i in range(n):
		str += string
	return str

def front_times(str, n):
  front_len = 3
  if front_len > len(str):
    front_len = len(str)
  front = str[:front_len]
  
  result = ""
  for i in range(n):
    result = result + front
  return result

def string_bits(str):
	xx = ""
	for i in range(0,len(str), 2):
		xx += str[i]

	return xx

def array_count9(nums):
  count = 0
  for i in range(0,len(nums)):
    if(nums[i] == 9):
      count+= 1
      
    
  return count


def array123(nums):
  for i in range(0,len(nums)-2):
    if(nums[i] == 1 and nums[i+1] == 2 and nums[i+2] == 3):
      return True
      
  return False
      
def string_match(a, b):

  shorter = min(len(a), len(b))
  count = 0
  

  for i in range(shorter-1):
    a_sub = a[i:i+2]
    b_sub = b[i:i+2]
    if a_sub == b_sub:
      count = count + 1

  return count

def factorial(num):
      if(num != 1):
            return num * factorial(num-1)
      else:
            return 1

print(factorial(5))
	