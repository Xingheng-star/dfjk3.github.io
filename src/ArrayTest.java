public class ArrayTest {
    public static void main(String[] args) { //快捷键：main
        MyTools mt = new MyTools();
        int[] arr = {10,-1,8,0,34};
        mt.bubble(arr);
        //输出排序后的arr
        System.out.println("===排序后的arr===");    //快捷键：sout
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
class MyTools {

    public void bubble(int[] arr) {
        //冒泡排序
        int temp = 0;
        for(int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j] > arr[j + 1]){ //交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
