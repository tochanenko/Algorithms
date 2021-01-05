package sort.bubblesort

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class BubbleSortTest {

    private val bubbleSort = BubbleSort()

    @Test
    fun sortArray() {
        assertArrayEquals(arrayOf(1, 2, 3, 4, 5), bubbleSort.sort(arrayOf(5, 1, 3, 4, 2)))
    }

    @Test
    fun sortEmpty() {
        assertArrayEquals(emptyArray(), bubbleSort.sort(emptyArray()))
    }

    @Test
    fun sortOne() {
        assertArrayEquals(arrayOf(-1), bubbleSort.sort(arrayOf(-1)))
    }
}