public class Clean_code {
    static class Number {

        int smallest;
        int largest;
    }

    static Number CheckLargestSmallest(int arrayGiven[], int sizeOfArray) {
        Number num = new Number();
        int index;

        if (sizeOfArray == 1) {
            num.largest = arrayGiven[0];
            num.smallest = arrayGiven[0];
            return num;
        }


        if (arrayGiven[0] > arrayGiven[1]) {
            num.largest = arrayGiven[0];
            num.smallest = arrayGiven[1];
        } else {
            num.largest = arrayGiven[1];
            num.smallest = arrayGiven[0];
        }

        for (index = 2; index < sizeOfArray; index++) {
            if (arrayGiven[index] > num.largest) {
                num.largest = arrayGiven[index];
            } else if (arrayGiven[index] < num.smallest) {
                num.smallest = arrayGiven[index];
            }
        }

        return num;
    }

    public static void main(String args[]) {
        int arrayGiven[] = {1000, 11, 445, 1, 330, 3000};
        int sizeOfArray = 6;
        Number num = CheckLargestSmallest(arrayGiven, sizeOfArray);
        System.out.printf("\nSmallest Number is %d", num.smallest);
        System.out.printf("\nLargest Number is %d", num.largest);
    }
}