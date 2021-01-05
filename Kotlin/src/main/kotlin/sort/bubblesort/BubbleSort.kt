package sort.bubblesort

class BubbleSort {
    fun sort(arr: Array<Int>): Array<Int> {
        val res = arr.clone()
        for (i in arr.indices) {
            for (j in 0 until arr.size - i - 1) {
                if (res[j] > res[j + 1]) {
                    val a = res[j]
                    res[j] = res[j + 1]
                    res[j + 1] = a
                }
            }
        }
        return res
    }
}