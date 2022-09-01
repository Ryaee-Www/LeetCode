public class Main {

    public static void main(String[] args) {
	    int[] newTest = {-1,2,3,4};
	    int target = 3;
	    Solution testCase = new Solution();
	    int[] result = testCase.twoSum(newTest,target);
	    System.out.println(result[0]);
		System.out.println(result[1]);
    }
}
