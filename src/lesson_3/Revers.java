package lesson_3;

public class Revers {
    public static String revers(String s) {
        MyStack<Character> stack = new MyStack<Character>(50);
        char[] charArray = s.toCharArray();
        for (char c: charArray) {
            stack.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    public static void main (String [] args)
    {
        String s = "Переворачиваю вводимые строки!";
        s = revers(s);
        System.out.println("Перевернутая строка: " + s);
    }

}
