public class NamesArray {
    public String [] name = new String[10];

    public NamesArray(){
        name[0] = "Primis";
        name[1] = "Safal";
        name[2] = "Diego";
        name[3] = "Denis";
        name[4] = "Jony";
        name[5] = "Antonio";
        name[6] = "Finn";
        name[7] = "Andrej";
        name[8] = "Zsombor";
        name[9] = "Adam";
        name[0] = "Primus";
    }

    public void printValueAtIndex5(){
        System.out.println(name[5]);
    }

    public void printMyName(){
        System.out.println(name[1]);
    }

    public void printArrayLength(){
        System.out.println(name.length);
    }

    public void loopThroughArray(){
        for (int i = 0; i<name.length; i++){
            System.out.println(name[i]);
        }
    }

    public void foreachLoopThroughArray(){
        for (String i : name){
            System.out.println(i);
        }
    }

    public void printArrayValuesFromTo(int startPos, int endPos){
        if (startPos < endPos){
            for (int i = startPos; i <= endPos; i++){ // Error, because the exercise says so.
                System.out.println(name[i]);
            }
        } else if (startPos > endPos) {
            for (int i = startPos; i >= endPos; i--){ // Error, because the exercise says so.
                System.out.println(name[i]);
            }
        } else {
            System.out.println("“Startposition can’t be the same as endposition!”");
        }

    }
}
