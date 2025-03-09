package Caffe;




public class Caffe {
    public static void main(String[] args) {



        Barista barista = new Barista();
        Waiter waiter = new Waiter();


        barista.order(8, 2, 0);

        int result = barista.putTogether();

        barista.putCup(result);

        waiter.takeCup();
        System.out.println(barista.putCup(result));






    }

    /*
     *흑당 버블티를 주문한다.
     *당도,우유의 량, 커피의 량 입력받는다.
     * 지갑에서 카드를 꺼내서 결재를 한다. ->결재내역이 나온다.
     *제조자는 당도 우유의 량 커피량을 확인하고 컵에다가 넣어서 믹스해서 건네준다.
     *
     *
     *
     * 우유+당도+커피의 합에 따라 가격이 달라진다.
     * 거기에 맞는 카드를 선택해야한다.
     * 컵을 생성해서 우유와 설탕 커피를 입력 받은 대로 가져와 출력하낟.
     *
     */
}
