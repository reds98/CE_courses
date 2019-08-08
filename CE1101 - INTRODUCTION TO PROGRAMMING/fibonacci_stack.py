def fib_stack (n):
    if isinstance(n, int)and n>=0:
        return fib_stack_aux(n)
    else:
        return "Error"
def fib_stack_aux(n):
    if n==0 or n==1:
        return n
    else:
        return fib_stack_aux(n-1)+fib_stack_aux(n-2)
