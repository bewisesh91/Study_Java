package chapter8;
import java.util.ArrayList;

public class ArrayListCustomerTest {
    public static void main(String[] args) {
        ArrayList<AdjCustomer> customerList = new ArrayList<AdjCustomer>();

        AdjCustomer customerLee = new AdjCustomer(10010, "lee");
        AdjCustomer customerShin = new AdjCustomer(10020, "Shin");
        AdjCustomer customerHong = new GoldCustomer(10030, "Hong");
        AdjCustomer customerKim = new GoldCustomer(10040, "Kim");
        AdjCustomer customerRyu = new AdjVIPCustomer(10050, "Ryu", 12345);

        customerList.add(customerLee);
        customerList.add(customerShin);
        customerList.add(customerHong);
        customerList.add(customerKim);
        customerList.add(customerRyu);

        System.out.println("===== 고객 정보 출력 =====");
        for(AdjCustomer customer : customerList){
            System.out.println(customer.showCustomerInfo());
        }

        System.out.println("===== 할인율과 보너스 포인트 계산 =====");
        int price = 10000;
        for(AdjCustomer customer : customerList){
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + " 원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.bonusPoint + "점입니다.");
        }
    }
}
