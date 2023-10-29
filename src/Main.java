import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ATM projesi
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right>0){
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.print("Parolanızı giriniz: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba " + userName + " ATM'ye hoşgeldiniz");
                do {
                    System.out.println  (
                                    "1-Para yatırma \n" +
                                    "2-Para çekme\n" +
                                    "3-Bakiye sorgula\n" +
                                    "4-Çıkış");
                    System.out.println("Ne yapmak istersiniz?");
                    select = input.nextInt();
                    if(select == 1) {
                        System.out.println("Ne kadar yatırmak istersiniz: ");
                        int price = input.nextInt();
                        balance += price;
                        System.out.println("Başarıyla hesabınıza yatırıldı");
                    } else if (select == 2) {
                        System.out.println("Para miktarı: ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Yeterli bakiyeniz yok");
                        }else{
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz: " + balance);
                    }
                }while (select != 4);
                System.out.println("Çıkış yapıldı, görüşmek üzere");
                break;

            }else{
                right--;
                System.out.println("Kullanıcı adı veya şifre!");
                if (right == 0){
                    System.out.println("Hesabınız bloke olmuştur");
                }
                System.out.println("Kalan Hakkınız: "+ right);
            }
        }



    }
}
