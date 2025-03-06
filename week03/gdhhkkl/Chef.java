public class Chef {
    private String dish;

   public static String getFood(){
       Refrigerator refrigerator = new Refrigerator();
       return  refrigerator.food("삽겹살");
   }


    public  String takeDish(){
        return this.dish ;
    }

    public static String onTheDish(){
       return getFood();
    }


// 냉장고에서 음식 가져오기
//고기 만들기
// 고기 접시에 담기
}
