package PTA;

import java.util.Scanner;
/**
 1002 写出这个数
 读入一个正整数 n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
 * */
public class pinyin {

    public static void main(String[] args) {
        String[] pinying={"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum=0;
        //每一位相加
        for (int i=0;i<n.length();i++){
            sum += n.charAt(i)-'0';
        }
        n=sum+"";
        for (int j=0;j<n.length();j++){
            System.out.print(pinying[n.charAt(j)-'0']);
            if(j<n.length()-1){
                System.out.print(" ");
            }
        }
    }
}
