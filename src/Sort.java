import java.util.ArrayList;
import java.util.List;

public class Sort {

   private int number;

    public Sort(int number) {
        this.number = number;
    }
    public Sort(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" +number;
    }
    public void numberEvenOdd(List<Sort>sorts){
        ArrayList<Integer>evenNum=new ArrayList<>();
        ArrayList<Integer>oddNum=new ArrayList<>();
        for (Sort sort:sorts) {
            if(sort.getNumber()%2==0){
                evenNum.add(sort.getNumber());
            }else {
               oddNum.add(sort.getNumber());
            }
        }
        System.out.println(evenNum);
        System.out.println(oddNum);
    }

}
