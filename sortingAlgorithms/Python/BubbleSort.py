def BubbleSort(array):
    length = len(array)
    temp = 0
    for i in range(length - 1):
        for j in range(0,length - i - 1):
            if array[j] > array[j+1]:
                temp = array[j+1]
                array[j+1] = array[j]
                array[j] = temp


array = [3,2,8,4,7]
print("Unsorted Array:")
print(array)
BubbleSort(array)
print("Sorted Array")
print(array)