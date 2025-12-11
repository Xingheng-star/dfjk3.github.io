/**
 * Utils工具类使用示例
 * Utils Module Usage Demo
 * 
 * 这个类演示了如何使用Utils工具类中的各种方法
 * This class demonstrates how to use various methods in the Utils class
 */
public class UtilsDemo {
    
    public static void main(String[] args) {
        System.out.println("===== Utils工具类使用示例 =====");
        System.out.println("===== Utils Module Demo =====\n");
        
        // 字符串工具方法示例
        stringUtilsDemo();
        
        // 数组工具方法示例
        arrayUtilsDemo();
        
        // 数学工具方法示例
        mathUtilsDemo();
    }
    
    /**
     * 字符串工具方法示例
     */
    private static void stringUtilsDemo() {
        System.out.println("========== 字符串工具 (String Utilities) ==========");
        
        // 检查字符串是否为空
        String str1 = "Hello";
        String str2 = "";
        String str3 = null;
        System.out.println("isEmpty(\"" + str1 + "\"): " + Utils.isEmpty(str1));
        System.out.println("isEmpty(\"\"): " + Utils.isEmpty(str2));
        System.out.println("isEmpty(null): " + Utils.isEmpty(str3));
        
        // 反转字符串
        String original = "Hello World";
        System.out.println("\n原字符串: " + original);
        System.out.println("反转后: " + Utils.reverse(original));
        
        // 首字母大写
        String lowercase = "hello";
        System.out.println("\n原字符串: " + lowercase);
        System.out.println("首字母大写: " + Utils.capitalize(lowercase));
        
        // 统计字符出现次数
        String text = "hello world";
        char ch = 'l';
        System.out.println("\n字符串: " + text);
        System.out.println("字符 '" + ch + "' 出现次数: " + Utils.countChar(text, ch));
        
        System.out.println();
    }
    
    /**
     * 数组工具方法示例
     */
    private static void arrayUtilsDemo() {
        System.out.println("========== 数组工具 (Array Utilities) ==========");
        
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        
        System.out.print("原数组: ");
        Utils.printArray(arr);
        
        // 冒泡排序
        Utils.bubbleSort(arr);
        System.out.print("排序后: ");
        Utils.printArray(arr);
        
        // 查找最大值和最小值
        int[] numbers = {10, -5, 23, 8, 15, -2, 30};
        System.out.print("\n数组: ");
        Utils.printArray(numbers);
        System.out.println("最大值: " + Utils.findMax(numbers));
        System.out.println("最小值: " + Utils.findMin(numbers));
        
        // 计算总和和平均值
        System.out.println("总和: " + Utils.sum(numbers));
        System.out.println("平均值: " + Utils.average(numbers));
        
        System.out.println();
    }
    
    /**
     * 数学工具方法示例
     */
    private static void mathUtilsDemo() {
        System.out.println("========== 数学工具 (Math Utilities) ==========");
        
        // 阶乘
        int n = 5;
        System.out.println(n + "! = " + Utils.factorial(n));
        
        // 判断质数
        int[] testNumbers = {2, 7, 15, 23, 100};
        System.out.print("\n质数检测: ");
        for (int num : testNumbers) {
            System.out.print(num + (Utils.isPrime(num) ? "(质数) " : "(非质数) "));
        }
        System.out.println();
        
        // 最大公约数和最小公倍数
        int a = 48, b = 18;
        System.out.println("\n" + a + " 和 " + b + " 的最大公约数: " + Utils.gcd(a, b));
        System.out.println(a + " 和 " + b + " 的最小公倍数: " + Utils.lcm(a, b));
        
        // 计算幂
        double base = 2;
        int exponent = 10;
        System.out.println("\n" + base + " 的 " + exponent + " 次方 = " + Utils.power(base, exponent));
        
        // 判断奇偶数
        int[] evenOddTest = {10, 15, 22, 33};
        System.out.print("\n奇偶数判断: ");
        for (int num : evenOddTest) {
            System.out.print(num + (Utils.isEven(num) ? "(偶数) " : "(奇数) "));
        }
        System.out.println("\n");
        
        System.out.println("===== 演示完成 =====");
    }
}
