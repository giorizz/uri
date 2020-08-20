vendedor = input()
salário = float(input())
vendas = float(input())

vendas = vendas*15/100

print("TOTAL = R $ {0:.2f}".format(salário + vendas))