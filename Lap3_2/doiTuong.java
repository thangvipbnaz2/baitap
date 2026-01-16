public class doiTuong {
    public static class Account {
        String name;
        long balance;

        void deposit(long money, long balance) {
            this.balance += money;
        }

        void display() {
            System.out.print("Name:" + this.name + ""+
                    "Balance:" + this.balance);

        }
    }

        public static void main(String[] args) {
            Account acc1 = new Account();
            acc1.name = "Giang";
            acc1.balance = 2000000;
            acc1.display();

            Account acc2 = new Account();
            acc2.name = "Tuan";
            acc2.balance = 1000000;
            acc2.display();
        }




}


