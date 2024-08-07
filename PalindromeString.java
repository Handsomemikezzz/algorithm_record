public class PalindromeString {
    public static String constructPalindrome(int n, int k) {
        // 如果要构造的回文子串数量超过了可能的最大数量，则返回"-1"
        if (k > (n - 2) / 3) return "-1";
        StringBuilder sb = new StringBuilder();
        // 首先添加k个"010"，因为"010"是一个长度为3的回文串
        for (int i = 0; i < k; i++) {
            sb.append("010");
        }
        // 填充剩余的长度，直到达到n
        while (sb.length() < n) {
            sb.append("0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 10; // 示例长度
        int k = 2; // 示例中长度为3的回文连续子串的数量
        System.out.println(1);
    }
}