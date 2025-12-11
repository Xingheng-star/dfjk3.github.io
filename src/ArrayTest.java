public class ArrayTest {
    public static void main(String[] args) { //快捷键：main
        int[] arr = {10,-1,8,0,34};
        
        System.out.println("===排序前的arr===");
        Utils.printArray(arr);
        
        // 使用Utils工具类进行冒泡排序
        Utils.bubbleSort(arr);
        
        //输出排序后的arr
        System.out.println("===排序后的arr===");    //快捷键：sout
        Utils.printArray(arr);
    }
}

// 保留原有的MyTools类以保持向后兼容
class MyTools {

    public void bubble(int[] arr) {
        //冒泡排序 - 优化版本，避免重复比较
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {  // 修正：减去i避免重复比较已排序的元素
                if(arr[j] > arr[j + 1]){ //交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
