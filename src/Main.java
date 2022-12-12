import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String userName,password;
        int enterance=3,selection,capital=1500,money;

        do {

            System.out.print("Lütfen kullanıcı adınızı giriniz : ");
            userName = input.nextLine();
            System.out.print("Lütfen şifrenizi giriniz : ");
            password = input.nextLine();
            if (userName.equals("ilkay")&&password.equals("123456789")){
                System.out.println("Sayın "+userName+" bankamıza hoşgeldiniz!");

                do{
                    System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz : \n1) Hesap sorgulama \n2) Para Çekme \n3)para Yatırma \n4) Çıkış Yap ");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1 -> System.out.println("Hesabınızda toplam : " + capital + "Tl vardır");
                        case 2 -> {
                            System.out.println("çekmek istediğiniz tutarı lütfen giriniz");
                            money = input.nextInt();
                            capital -= money;
                            System.out.println("Hesabınız da " + capital + " Tl kalmıştır ");
                        }
                        case 3 -> {
                            System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz : ");
                            money = input.nextInt();
                            capital += money;
                            System.out.println("Hesabınız da toplam " + capital + "TLniz vardır");
                        }
                    }
                }while (selection !=4);
                System.out.println("Yine Bekleriz Hoşcakalın!!");
                break;
            }else{
                enterance-=1;
                if (enterance>0){
                    System.out.println(enterance + " Hakkınız kalmıştır ! ");
                }else{
                    System.out.println("Hesabınız bloke olmuştur");
                }


            }
        }while (enterance>0);

    }
}