
public class quickSort {
    //此处采用最后一个元素作为枢轴来实现算法
    public void quickSort(int[] arr, int low, int high) {//https://leetcode.cn/circle/discuss/eBo9UB/#%E5%BF%AB%E9%80%9F%E6%8E%92%E5%BA%8F
        if (low < high) {
            // pi 是分区索引，arr[pi] 现在在正确的位置上
            int pi = partition(arr, low, high);
            // 递归地对分区点前后的子数组进行排序
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // 这个方法以最后一个元素作为枢轴，将枢轴元素放在正确的位置上，
    // 并将所有较小（小于枢轴）的元素移到枢轴的左边，较大的元素移到右边
    public int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // 较小元素的索引
        for (int j = low; j < high; j++) {
            // 如果当前元素小于或等于枢轴
            if (arr[j] <= pivot) {
                i++;
                // 交换 arr[i] 和 arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 交换 arr[i + 1] 和 arr[high]（或枢轴）
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;//返回新的枢轴位置
    }
// ------------3.测试-------------------------------
    // 打印数组的方法
    
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        quickSort ob = new quickSort();
        ob.quickSort(arr, 0, n - 1);

        System.out.println("排序后的数组:");
        printArray(arr);
    }
}
