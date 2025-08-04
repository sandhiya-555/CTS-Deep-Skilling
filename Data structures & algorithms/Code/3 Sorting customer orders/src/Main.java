public class Main {
    public static void main(String[] args) {

        Order[] orders= {new Order(10,"Krishna",100),
                new Order(20,"Joseph",300),new Order(30,"Abdul",200)};
                System.out.println("Orders before sorting");
                for(Order order:orders){
                    order.display();
                }

                Quicksort.quicksort(orders,0, orders.length-1);
                System.out.println("Orders after sorting");
                for(Order order:orders){
                order.display();
                }

               System.out.println("Reinitialisation");
                orders=new Order[] {new Order(10,"Krishna",100),
                new Order(20,"Joseph",300),
                        new Order(30,"Abdul",200)};
        System.out.println("Orders before sorting");
        for(Order order:orders){
            order.display();
        }
        BubbleSort.bubbleSort(orders);
        System.out.println("Orders after sorting");
        for(Order order:orders){
            order.display();
        }

    }
}