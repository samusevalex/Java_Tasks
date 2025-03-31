package com.company;

import java.util.Random;

public class Task5 {

    String alphanumeric="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    StringBuilder randomString(int i){
        StringBuilder sb = new StringBuilder(i);
        Random random = new Random();
        while (i-- > 0)
            sb.append(alphanumeric.charAt(random.nextInt(62))));
        return sb;
    }
/*
Перевернуть строку:
	char[] a = "Hello world".toCharArray();
	int len = a.length - 1;
	for (int i = (len - 1)/2; i >= 0; i--){
		a[i]^= a[len-i];     a = a XOR b
		a[len-i]^= a[i]; или b = a XOR b
		a[i]^= a[len-i];     a = a XOR b
	}
Прибавить единицу к числу 321:
	int a[] = {-1,3,2,1};
	int n = a.length;
	for (; a[--n]==9; a[n]=0);
	switch (a[n]) {
		case -1:
			a[n] = 1;
			break;
		default:
			a[n]++;
			break;
}
Числа Фибоначчи: for (int n1 = n2 = 1; n1 < 1000; System.out.println((n1+=n2) + (n2+=n1)))
Простое ли число х?: for (int n = x/2; (x%n) != 0; n--)
Факториал: for (int n = s = 1; ++n < 10; System.out.println( s*=n ))
Задача со скобками:
	[]()[][()] -- true
	[[(())]]   -- true
	[[[]]  -- false
	]][[   -- false
	[]]    -- false
	[(])   -- false

boolean foo()
	String str = "...";
	Stack<Character> s = new Stack<>();
	for(char c : str.toCharArray())
		switch(c) {
			case ']':
				if (s.empty() || s.pop() != '[')
					return false;
				break;
			case ')':
				if (s.empty() || s.pop() != '(')
					return false;
				break;
			case '[':
			case '(':
				s.push(c);
				break;
		}
	return s.empty();
*/
    StringBuilder reverseString(StringBuilder s) {
        StringBuilder sb = new StringBuilder();
        for (int i = s.length(); i-- > 0; sb.append(s.charAt(i)));
        return sb;
    }

    Task5(){
        for (int i = 10; i > 0; i--) {
            StringBuilder s1 = randomString(i);
            StringBuilder s2 = reverseString(s1);
            //StringBuilder s2 = new StringBuilder().append(s1);
            //reverseString(s2);
            System.out.println(s1+" : "+s2);
            switch (i){
                case 1 :
                case 2 :
                case 3 :
                    System.out.println("Index - "+i);
                    break;
                case 4 :
                    System.out.println("Index - Four");
                    break;
                case 5:
                    System.out.println("Index - Five");
                    break;
                default:
                    System.out.println("Index more than Five");
            }
        }
    }
}
