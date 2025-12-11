/**
 * 通用工具类 - 提供常用的字符串、数组和数学工具方法
 * General Utility Class - Provides common string, array and math utility methods
 * 
 * @author Utils Module
 * @version 1.0
 */
public class Utils {
    
    // ==================== 字符串工具方法 (String Utilities) ====================
    
    /**
     * 检查字符串是否为空或null
     * Check if string is empty or null
     * 
     * @param str 要检查的字符串
     * @return 如果为空或null返回true，否则返回false
     */
    public static boolean isEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }
    
    /**
     * 反转字符串
     * Reverse a string
     * 
     * @param str 要反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }
    
    /**
     * 首字母大写
     * Capitalize first letter
     * 
     * @param str 输入字符串
     * @return 首字母大写的字符串
     */
    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    
    /**
     * 统计字符串中某个字符出现的次数
     * Count occurrences of a character in string
     * 
     * @param str 字符串
     * @param ch 要统计的字符
     * @return 出现次数
     */
    public static int countChar(String str, char ch) {
        if (isEmpty(str)) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }
    
    // ==================== 数组工具方法 (Array Utilities) ====================
    
    /**
     * 冒泡排序 - 升序排列
     * Bubble sort - ascending order
     * 
     * @param arr 要排序的数组
     */
    public static void bubbleSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    /**
     * 查找数组中的最大值
     * Find maximum value in array
     * 
     * @param arr 数组
     * @return 最大值
     */
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    /**
     * 查找数组中的最小值
     * Find minimum value in array
     * 
     * @param arr 数组
     * @return 最小值
     */
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("数组不能为空");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    
    /**
     * 计算数组元素的总和
     * Calculate sum of array elements
     * 
     * @param arr 数组
     * @return 总和
     */
    public static int sum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }
    
    /**
     * 计算数组元素的平均值
     * Calculate average of array elements
     * 
     * @param arr 数组
     * @return 平均值
     */
    public static double average(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0.0;
        }
        return (double) sum(arr) / arr.length;
    }
    
    /**
     * 打印数组
     * Print array
     * 
     * @param arr 要打印的数组
     */
    public static void printArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // ==================== 数学工具方法 (Math Utilities) ====================
    
    /**
     * 计算阶乘
     * Calculate factorial
     * 
     * @param n 非负整数
     * @return n的阶乘
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n必须是非负整数");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    /**
     * 判断是否为质数
     * Check if a number is prime
     * 
     * @param n 要检查的数
     * @return 如果是质数返回true，否则返回false
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 计算最大公约数 (使用欧几里得算法)
     * Calculate greatest common divisor using Euclidean algorithm
     * 
     * @param a 第一个数
     * @param b 第二个数
     * @return 最大公约数
     */
    public static int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    /**
     * 计算最小公倍数
     * Calculate least common multiple
     * 
     * @param a 第一个数
     * @param b 第二个数
     * @return 最小公倍数
     */
    public static int lcm(int a, int b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / gcd(a, b);
    }
    
    /**
     * 计算幂 (x的n次方)
     * Calculate power (x to the power of n)
     * 
     * @param x 底数
     * @param n 指数
     * @return x的n次方
     */
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / power(x, -n);
        }
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
    
    /**
     * 判断是否为偶数
     * Check if a number is even
     * 
     * @param n 要检查的数
     * @return 如果是偶数返回true，否则返回false
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    /**
     * 判断是否为奇数
     * Check if a number is odd
     * 
     * @param n 要检查的数
     * @return 如果是奇数返回true，否则返回false
     */
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
