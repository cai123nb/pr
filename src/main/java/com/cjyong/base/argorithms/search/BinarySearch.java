package com.cjyong.base.argorithms.search;

/**
 * Created with IntelliJ IDEA By
 * User: cjyong
 * Date: 2017/11/24
 * Time: 15:46
 * Description: Base binarySearch implement. Just for Comparable Object.
 */
public class BinarySearch {
    /**
     * For Comparable value binary search, the array must be sorted.
     *
     * @param key: Target data you want to find in the array.
     * @param data: Array data where you could find the key.
     * @return -1: means the data doesn't contain the key value or return the index in the data.
     */
    public static int indexOf(Comparable key, Comparable[] data) {
        int head = 0, tail = data.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (key.compareTo(data[mid]) < 0)
                tail = mid - 1;
            else if (key.compareTo(data[mid]) > 0)
                head = mid + 1;
            else
                return mid;
        }
        return -1;
    }
    /**
     * Overloading for Integer value binary search, the array must be sorted.
     *
     * @param key: Target data you want to find in the array.
     * @param data: Array data where you could find the key.
     * @return -1: means the data doesn't contain the key value or return the index in the data.
     */
    public static int indexOf(int key, int[] data) {
        int head = 0, tail = data.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (key < data[mid])
                tail = mid - 1;
            else if (key > data[mid])
                head = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    /**
     * Overloading for Long value binary search, the array must be sorted.
     *
     * @param key: Target data you want to find in the array.
     * @param data: Array data where you could find the key.
     * @return -1: means the data doesn't contain the key value or return the index in the data.
     */
    public static int indexOf(long key, long[] data) {
        int head = 0, tail = data.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (key < data[mid])
                tail = mid - 1;
            else if (key > data[mid])
                head = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    /**
     * Overloading for Double value binary search, the array must be sorted.
     *
     * @param key: Target data you want to find in the array.
     * @param data: Array data where you could find the key.
     * @return -1: means the data doesn't contain the key value or return the index in the data.
     */
    public static int indexOf(double key, double[] data) {
        int head = 0, tail = data.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (key < data[mid])
                tail = mid - 1;
            else if (key > data[mid])
                head = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    /**
     * Overloading for Float value binary search, the array must be sorted.
     *
     * @param key: Target data you want to find in the array.
     * @param data: Array data where you could find the key.
     * @return -1: means the data doesn't contain the key value or return the index in the data.
     */
    public static int indexOf(float key, float[] data) {
        int head = 0, tail = data.length - 1;
        while (head <= tail) {
            int mid = head + (tail - head) / 2;
            if (key < data[mid])
                tail = mid - 1;
            else if (key > data[mid])
                head = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
