import java.util.Scanner;

public class Main {
    public static final String CORRECT_CHARS = " -ЁЙЦУКЕНГШЩЗХЪЭЖДЛОРПАВЫФЯЧСМИТЬБЮёйцукенгшщзхъэждлорпавыфячсмитьбю";
    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы.
        System.out.println("Введите ФИО");
        String input = new Scanner(System.in).nextLine().trim();
        boolean isValid = true;
        int spaceCount = 0;

        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)==' '){
                spaceCount++;
            }
            if(!CORRECT_CHARS.contains(String.valueOf(input.charAt(i)))){
                isValid = false;
                break;
            }
        }
        if (isValid && spaceCount == 2){
            System.out.println("Фамилия: " + input.replaceAll("\\s.*", "") +
                    "\nИмя: " + input.substring(input.indexOf(' '), input.lastIndexOf(' ')) +
                    "\nОтчество: " + input.substring(input.lastIndexOf(' ')));
        }else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}