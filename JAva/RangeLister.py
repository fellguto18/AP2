class RangeLister:
    def make_range(self, lower, upper):
        # Cria uma lista com os números no intervalo inclusivo
        return list(range(lower, upper + 1))

# Método principal
if __name__ == "__main__":
    lister = RangeLister()
    range_list = lister.make_range(1, 10)

    print("The array: [", end=" ")
    for num in range_list:
        print(num, end=" ")
    print("]")