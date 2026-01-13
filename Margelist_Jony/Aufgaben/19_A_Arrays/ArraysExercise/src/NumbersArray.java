public class NumbersArray {
    int [] numbers = {
            -8, 92, 53, 24, 2, 35, -50, 77, 12, -20
    };

    public int calculateArraySum(){
        int x = 0;
        for (int number : numbers){
            x += number;
        }

        return x;
    }

    public int calculateArraySumOfNegativeNumbers(){
        int x = 0;
        for (int number : numbers){
            if (number<0){
                x += number;
            }
        }

        return x;
    }

    public int calculateArraySumOfPositiveNumbers(){
        int x = 0;
        for (int number : numbers){
            if (number>0){
                x += number;
            }
        }
        return x;
    }
}
