def fib_queue(n):
    if isinstance(n,int):
        return fib_queue_aux(n,0,1,0)
    else:
        return "Error"
def fib_queue_aux(n,cont,f1,f2):
    if cont==n:
        return f2
    else:
        return fib_queue_aux(n,cont+1,f2,f1+f2)    

