package Class19.Class19HW;

public class userClass {
    /* Write program: Class19.Class19HW.userClass  that has a constructor
    that initializes instance variable name and
    mobile number. Create a subclass  userInfo that will
    have user address variable and it also being
    initialized through constructor call.
    Print users name, mobile number and address
    in userDetails method. Test your code.
     */

    String name;
    long number;

    userClass (String name, long number) {
        this.name=name;
        this.number=number;
    }
}
    class UserInfo extends userClass {
        String address;

        UserInfo(String name, long number, String address) {
            super(name, number);
            this.address = address;
        }

        void printInfo() {
            System.out.println(name + number + address);
        }

    }  class UserInfoTester {
    public static void main(String[] args) {
        UserInfo UI = new UserInfo("Anna",147852369,"5566 Kings ave");
        UI.printInfo();
    }
}

