import java.util.ArrayList;

class EmptyArray extends Exception {
}

class NegativeElement extends Exception {
	private ArrayList<int[]> negative_numbers;

	public NegativeElement(ArrayList<int[]> negative_numbers) {
		this.negative_numbers = negative_numbers;
	}

}

float avg(int[] nums) throws EmptyArray, NegativeElement { 
    int sum = 0;

    if (nums == null || nums.length == 0)
        throw new EmptyArray();

    ArrayList<int[]> negative_numbers = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
		if (nums[i] < 0) {
			negative_numbers.add(new int[] {i, nums[i]});
		}
    }
    if (!negative_numbers.isEmpty()) {
        throw new NegativeElement(negative_numbers);

    }


    for(int n: nums) sum += n;
    return sum / nums.length;
}
void main() {
    int[] nums = new int[] { 1, 2, -1, -2, 3, 4, -2 };
    Float result;
    try { result = avg(nums);}
    catch(EmptyArray e) {}
    catch(NegativeElement e) {
	for (int[] negative_number: e.negative_numbers) {
			System.out.println(
				String.format(
					"The %d-th number %d in your array is invalid",
					negative_number[0],
					negative_number[1]
				));
		}
	}

}
