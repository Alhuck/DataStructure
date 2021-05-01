package gfg.array;

public class LeadersOfArr {

    public static void getAllLeaders(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isLead = true;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] <= arr[j]) {
                    isLead = false;
                    break;
                }
            }
            if (isLead) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    public static void main(String[] args) {

        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        getAllLeaders(arr);
    }

}
