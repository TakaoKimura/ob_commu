from sort.HeapSorter import HeapSorter
from sort.QuickSorter import QuickSorter

class SortingList:

    def __init__(self, sortId):
        self.list = []
        self.size = 0
        if sortId == 0:
            self.sorter = QuickSorter()
        elif sortId == 1:
            self.sorter = HeapSorter()

    def ascendingSort(self):
        self.list = self.sorter.acsendingSort(self.list, self.size)

    def descendingSort(self):
        self.list = self.sorter.desendingSort(self.list, self.size)


