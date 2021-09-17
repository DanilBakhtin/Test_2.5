package Main;

import java.util.Scanner;

public class Main {

    private static String str;

    public static void main(String[] args) {
        /*
        System.out.println(search("aadsjkfh3ioew"));
        System.out.println(search("aaadsjkfh3ioew"));
        System.out.println(search("dsjkfh3ioewaa"));
        System.out.println(search("dsjkfh3ioewaaa"));
        System.out.println(search("dsjkfhaa3ioew"));
        System.out.println(search("aa"));
        System.out.println(search("aaa"));
        System.out.println();
        System.out.println(search("00dsjkfh3ioew"));
        System.out.println(search("000dsjkfh3ioew"));
        System.out.println(search("dsjkfh3ioew00"));
        System.out.println(search("dsjkfh3ioew000"));
        System.out.println(search("dsjkfh003ioewaa"));
        System.out.println(search("000"));*/
        input();
        search(str);
        output();

    }

    //Метод ввода строки из консоли
    private static void input(){
        System.out.print("Введите строку: ");
        str = new Scanner(System.in).nextLine();
    }

    /**
     * Поиск в строке "00" или "aa", например если в строке встретится "000", то это не будет считаться
     * @param str строка, в которой ищем подстроку
     * @return "yes" - если в строке найдена нужная подстрока и "no" - если подстрока не будет найдена
     */
    public static String search(String str){

        char[] sl = str.toCharArray();

        boolean flag = false;
        for (int i = 0; i < sl.length; i++){
            if (flag) {
                return "yes";
            }
            if (sl[i] == 'a' || sl[i] == '0'){
                char sought;
                if (sl[i] == 'a') sought = 'a';
                else sought = '0';
                for (int j = i + 1; j < sl.length; j++){
                    if (sl[j] == sought){
                        flag = !flag;
                    }
                    else {
                        i += 2;
                        break;
                    }
                    if (!flag){
                        i += 3;
                        break;
                    }
                }
            }
        }


        return "no";
    }

    private static void output(){
        System.out.println(search(str));
    }
}
