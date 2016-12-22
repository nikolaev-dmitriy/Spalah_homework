/**
 * Created by Man on 22.12.2016.
 */
public class Main {
    public static void main(String[] args){
        Deposit Nikolaev=new Deposit(4000,15,"Nikolaev Dmitriy");
        Deposit Konst=new Deposit(20000,4,"Konstantinovskiy Michael");
        Deposit Musienko=new Deposit(110000,32,"Musienko Konstantin");
        Bank PrivateBank=new Bank("PrivateBank");
        PrivateBank.addDeposit(Nikolaev);
        PrivateBank.addDeposit(Konst);
        PrivateBank.addDeposit(Musienko);
        PrivateBank.profirFromBank(3);

    }
}
